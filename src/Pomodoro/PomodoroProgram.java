/*
	Author: MrDanDoodles
	Date: 4/11/2026
	Project: Pomodoro Program
	
	This program is a timer that counts down a certain amount of time
	and a certain amount of rest. Custom times can be given, or a 
	preset chosen amount of time can also be selected.
	
	TODO:
		-Figure out how to get custom fonts to work in Swing
			-Change the fonts on all the labels and timers to custom fonts
		-Figure out how to make rounded buttons
 */
package Pomodoro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.*;
import java.io.File;

public class PomodoroProgram {

	public static void main(String[] args) throws FileNotFoundException {
		// = = = VARIABLES = = = 
		final String TEMPLATE_PATH = "Templates.txt";
		FileHandler fh = new FileHandler(TEMPLATE_PATH);
		
		File iconFile = fh.loadFile("/Pomodoro Application/src/TomatoIcon_resized.png");
		ImageIcon iconImg = fh.loadImageIcon("/Pomodoro/TomatoIcon_resized.png");
		System.out.println(iconFile.exists());
		
		//Creating a timer
		Timer timer = new Timer(0);

		//Creating the frame
		PomodoroFrame frame = new PomodoroFrame(timer, iconImg);
		
	}//End main()

}//End class PomodoroProgram