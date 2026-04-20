import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import javax.swing.*;

//180 , 330 , 190

public class PomodoroFrame extends JFrame{
	// = = = CLASS FIELDS = = = 
	final int HEIGHT = 700;
	final int WIDTH = 800;
	final String COLOR_HEX[] = {"#F63049", "#D02752", "#8A244B", "#111F35"}; //[Lght Red], [Medium Red], [Dark Red], [Dark Grey]
	
	private JFrame frame;
		//Panels
	private JPanel upperPanel;
	
	private JPanel centerPanel;
	private JPanel centerLabelsPanel;
	private JPanel centerButtonsPanel;
	
	private JPanel lowerPanel;
	
		//Labels
	private JLabel titleLabel;
	private JLabel timerLabel;
	private JLabel sequenceLabel;
	
		//Buttons
	private JButton sequence1Button;
	private JButton sequence2Button;
	private JButton sequence3Button;
	private JButton backButton;
	private JButton forwardButton;
	private JButton startButton;
	private JButton stopButton;
	private JButton restartButton;
	
	
	// = = = CONSTRUCTOR = = =
	public PomodoroFrame()
	{
		//Creating the Frame
		setupFrame();
		
		//Creating the Major JPanels
		setupPanels();
		
		//Adding Content to the Major JPanels
		setupLabelsAndButtons();
		
		//Setting the frame visible
		frame.setVisible(true);
	}//End Constructor
	
	
	// = = = CLASS METHODS = = = 
	/**
	 * This method is used for generating and accepting
	 * all custom fonts that come with the program.
	 */
	private void generateFont()
	{
//		try {
//		    Font customFont = Font.createFont(
//		        Font.TRUETYPE_FONT,
//		        new File("resources/fonts/MyFont.ttf")
//		    ).deriveFont(24f); // set size here
//
//		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//		    ge.registerFont(customFont);
//
//		    //someComponent.setFont(customFont);
//
//		} catch (Exception e) {
//		    e.printStackTrace();
	}//End generateFont
	
	/**
	 * This method handles all the necessary functions and
	 * variable declarations to initialize the frame
	 */
	private void setupFrame()
	{
		//Creating the Frame
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setTitle("Pomodoro");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//End setupFrame
	
	/**
	 * This method creates all the panels. Major and minor
	 * divisions for content to be displayed and organized
	 * around.
	 */
	private void setupPanels()
	{
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		
		// - - - Upper Panel - - - 
		upperPanel = new JPanel(new BorderLayout());
		upperPanel.setPreferredSize(new Dimension(WIDTH, 180));
		upperPanel.setBackground(Color.decode(this.COLOR_HEX[0]));
		
		// - - - Center Panel - - - 
			// Major Panel
		centerPanel = new JPanel(new GridBagLayout());
		centerPanel.setPreferredSize(new Dimension(WIDTH, 330));;
		centerPanel.setBackground(Color.decode(this.COLOR_HEX[1]));
			
			//Center Labels
		centerLabelsPanel = new JPanel(new GridBagLayout());
		centerLabelsPanel.setOpaque(false);
		
			//Center Buttons
		centerButtonsPanel = new JPanel(new GridBagLayout());
		centerButtonsPanel.setOpaque(false);
		
			//Adding the Panels
		gbc.gridx = 0; gbc.gridy = 0; centerPanel.add(centerLabelsPanel, gbc);
		gbc.gridx = 0; gbc.gridy = 1; centerPanel.add(centerButtonsPanel, gbc);
		
		// - - - Lower Panel - - - 
		lowerPanel = new JPanel(new GridBagLayout());
		lowerPanel.setPreferredSize(new Dimension(WIDTH, 190));
		lowerPanel.setBackground(Color.decode(this.COLOR_HEX[2]));
		
		// - - - Adding all the panels - - - 
		frame.add(upperPanel, BorderLayout.NORTH);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.add(lowerPanel, BorderLayout.SOUTH);
	}//End setupPanels
	
	/**
	 * This method determines where and how
	 * all the buttons, labels, and panels are 
	 * oriented/organized.
	 */
	private void setupLabelsAndButtons()
	{
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		
		// - - - TOP PANEL - - - 
		titleLabel = new JLabel("Pomodoro");
		titleLabel.setFont(new Font("SansSerif", Font.BOLD, 70));
		titleLabel.setForeground(Color.white);
		
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		upperPanel.add(titleLabel, BorderLayout.CENTER);
		
		// - - - CENTER PANEL - - - 
			//Center Labels Panel
		timerLabel = new JLabel("00:00");
		timerLabel.setFont(new Font("SansSerif", Font.BOLD, 95));
		timerLabel.setForeground(Color.white);
		
		gbc.gridx = 0; gbc.gridy = 0;
		centerLabelsPanel.add(timerLabel, gbc);
		
		sequenceLabel = new JLabel("X Sequences Left");
		sequenceLabel.setFont(new Font("SansSerif", Font.BOLD, 28));
		sequenceLabel.setForeground(Color.white);
		
		gbc.gridx = 0; gbc.gridy = 1;
		centerLabelsPanel.add(sequenceLabel, gbc);
		
			//Center Buttons Panel
		gbc.insets = new Insets(10, 15, 0, 15); //Setting the Padding
		
		sequence1Button = new JButton("25/5");
		sequence1Button.setPreferredSize(new Dimension(150, 90));
		sequence1Button.setForeground(Color.white);
		sequence1Button.setFont(new Font("SansSerif", Font.BOLD, 24));
		sequence1Button.setBackground(Color.decode(COLOR_HEX[2]));
		gbc.gridx = 0; gbc.gridy = 0;
		centerButtonsPanel.add(sequence1Button, gbc);
		
		sequence2Button = new JButton("30/10");
		sequence2Button.setPreferredSize(new Dimension(150, 90));
		sequence2Button.setForeground(Color.white);
		sequence2Button.setFont(new Font("SansSerif", Font.BOLD, 24));
		sequence2Button.setBackground(Color.decode(COLOR_HEX[2]));
		gbc.gridx = 1; gbc.gridy = 0;
		centerButtonsPanel.add(sequence2Button, gbc);
		
		sequence3Button = new JButton("20/10");
		sequence3Button.setPreferredSize(new Dimension(150, 90));
		sequence3Button.setForeground(Color.white);
		sequence3Button.setFont(new Font("SansSerif", Font.BOLD, 24));
		sequence3Button.setBackground(Color.decode(COLOR_HEX[2]));
		gbc.gridx = 2; gbc.gridy = 0;
		centerButtonsPanel.add(sequence3Button, gbc);
		
		// - - - LOWER PANEL - - - 
		backButton = new JButton("<");
		backButton.setPreferredSize(new Dimension(90, 90));
		backButton.setFont(new Font("SansSerif", Font.BOLD, 24));
		backButton.setBackground(Color.decode(COLOR_HEX[3]));
		backButton.setForeground(Color.white);
		
		forwardButton = new JButton(">");
		forwardButton.setPreferredSize(new Dimension(90, 90));
		forwardButton.setFont(new Font("SansSerif", Font.BOLD, 24));
		forwardButton.setBackground(Color.decode(COLOR_HEX[3]));
		forwardButton.setForeground(Color.white);
		
		restartButton = new JButton("⟳");
		restartButton.setPreferredSize(new Dimension(90, 90));
		restartButton.setFont(new Font("SansSerif", Font.BOLD, 24));
		restartButton.setBackground(Color.decode(COLOR_HEX[3]));
		restartButton.setForeground(Color.white);
		
		startButton = new JButton("Start");
		startButton.setPreferredSize(new Dimension(180, 90));
		startButton.setFont(new Font("SansSerif", Font.BOLD, 24));
		startButton.setBackground(Color.decode(COLOR_HEX[3]));
		startButton.setForeground(Color.white);
		
		stopButton = new JButton("Stop");
		stopButton.setPreferredSize(new Dimension(180, 90));
		stopButton.setFont(new Font("SansSerif", Font.BOLD, 24));
		stopButton.setBackground(Color.decode(COLOR_HEX[3]));
		stopButton.setForeground(Color.white);
		
			//Adding the Buttons to the Panel
		gbc.gridx = 0; gbc.gridy = 0;
		lowerPanel.add(backButton, gbc);
		
		gbc.gridx = 1;
		lowerPanel.add(startButton, gbc);
		
		gbc.gridx = 2;
		lowerPanel.add(restartButton, gbc);
		
		gbc.gridx = 3;
		lowerPanel.add(stopButton, gbc);
		
		gbc.gridx = 4;
		lowerPanel.add(forwardButton, gbc);
	}//End setupLabelsAndButtons
	
}//End class PomodoroFrame
