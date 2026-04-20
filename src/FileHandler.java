/**
	This class will load all template data from Templates.txt
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
	// = = = CLASS FIELDS = = = 
	private String filePath;
	
	// = = = CONSTRUCTOR = = = 
	public FileHandler(String filePath)
	{
		this.filePath = filePath;
	}//End constructor
	
	// = = = CLASS METHODS = = =
	/**
	 * Reads in the data from Templates.txt and returns the templates
	 * as objects that can be accessed for time.
	 * @return templates (ArrayList)
	 * @throws FileNotFoundException
	 */
	public ArrayList<TimeTemplate> getTemplates() throws FileNotFoundException
	{
		//Local Vars
		ArrayList<TimeTemplate> templates = new ArrayList<TimeTemplate>();
		ArrayList<String> templateStrings = new ArrayList<String>();
		
		//Opening Up the File and Reading from it
		File reader = new File(this.filePath);
		FileReader fileReader = new FileReader(reader);
		Scanner in = new Scanner(fileReader);
		
		in.nextLine(); //Skips instruction line
		
		//Reading from File
		while(in.hasNextLine())
		{
			templateStrings.add(in.nextLine());
		}
		
		//Converting to Templates
		for(int i = 0; i < templateStrings.size(); i++)
		{
			//Splitting the Numbers
			String numbers[] = templateStrings.get(i).split("/");
			
			//Creating Template and Adding it to the ArrayList
			TimeTemplate newTemplate = new TimeTemplate(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]));
			templates.add(newTemplate);
		}
		
		//Closing Input Stream
		in.close();
		
		//Returning Final Template
		return templates;
	}//End getTemplates()
	
	
}//End class FileHandler