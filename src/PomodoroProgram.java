/*
	Author: Danielle Rodriguez
	Date: 4/11/2026
	Project: Pomodoro Program
	
	This program is a timer that counts down a certain amount of time
	and a certain amount of rest. Custom times can be given, or a 
	preset chosen amount of time can also be selected.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.*;

public class PomodoroProgram {

	public static void main(String[] args) throws FileNotFoundException {
		// = = = VARIABLES = = = 
		final String TEMPLATE_PATH = "Templates.txt";
		ArrayList<TimeTemplate> templates = new ArrayList<TimeTemplate>();
		FileHandler fh = new FileHandler(TEMPLATE_PATH);
		
		//Getting the Templates
		templates = fh.getTemplates();
		
		//Setting the Timer
//		System.out.println("Work Timer");
//		Timer myTimer = new Timer(templates.get(1).getWorkSecondsTotal());
//		myTimer.updateTime(); //Work Timer
//		
//		System.out.println("Rest Timer");
//		myTimer.setSeconds(templates.get(1).getRestSecondsTotal());
//		myTimer.updateTime(); //Rest Timer

		PomodoroFrame frame = new PomodoroFrame();
		
	}//End main()

}//End class PomodoroProgram


