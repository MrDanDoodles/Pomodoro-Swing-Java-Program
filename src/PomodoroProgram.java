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

		// = = = SWING TEMPLATE = = = 
			//Frame Settings
		JFrame frame = new JFrame();
		frame.setSize(800, 800);
		frame.setTitle("PomoTimer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground( new Color(192, 225, 210) ); //Setting Background Color
		frame.setLayout(new BorderLayout());
		
			//Panels
		JPanel sideBar = new JPanel(new GridLayout(1, 3));
		sideBar.setBounds(100, 100, 100, 100);
		
			//Text
		JLabel appNameTop = new JLabel("POMODORO TIMER");
		appNameTop.setFont(new Font ("Serif", Font.BOLD, 45));
		frame.add(appNameTop, BorderLayout.NORTH);
		
		JLabel timeLabel = new JLabel("00:00");
		timeLabel.setFont(new Font("Serif", Font.BOLD, 35) );
		frame.add(timeLabel, BorderLayout.CENTER);
		
			//Buttons
		JButton startButton = new JButton();
		startButton.setSize(50,150);
		
		JButton stopButton = new JButton();
		stopButton.setSize(50,150);
		
		JButton resetButton = new JButton();
		resetButton.setSize(50,150);
		
		sideBar.add(startButton);
		sideBar.add(stopButton);
		sideBar.add(resetButton);
		frame.add(sideBar, BorderLayout.AFTER_LAST_LINE);
		
		//Setting Frame Visible
		frame.setVisible(true);
		
	}//End main()

}//End class PomodoroProgram


