/**
	This class stores time templates that are stored
	in Templates.txt
 */
public class TimeTemplate {
	// = = = CLASS FIELDS = = =
	private int workMinutes;
	private int workSecondsTotal;
	
	private int restMinutes;
	private int restSecondsTotal;
	
	// = = = GETTERS AND SETTERS = = = 
	public int getWorkSecondsTotal() {
		return workSecondsTotal;
	}
	public void setWorkSecondsTotal(int workSecondsTotal) {
		this.workSecondsTotal = workSecondsTotal;
	}
	public int getRestSecondsTotal() {
		return restSecondsTotal;
	}
	public void setRestSecondsTotal(int restSecondsTotal) {
		this.restSecondsTotal = restSecondsTotal;
	}
	
	// = = = CONSTRUCTORS = = = 
	public TimeTemplate(int workMin, int restMin)
	{
		//Setting Data
		this.workMinutes = workMin;
		this.restMinutes = restMin;
		
		//Calculating the Seconds
		this.workSecondsTotal = Timer.convertTimeToSeconds(workMinutes, 0);
		this.restSecondsTotal = Timer.convertTimeToSeconds(restMinutes, 0);
		
	}//End Constructor
	
	
	
}//End class TimeTemplate
