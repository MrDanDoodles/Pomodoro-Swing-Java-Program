import javax.swing.JLabel;

/**
 * This class handles all the variables and methods to
 * handle the timer. Such as setting and updating the time.
 */
public class Timer {
	// = = = CLASS FIELDS = = = 
	final private int MILLISECONDS = 1000; //Needed for the 
	final private int DEFAULT_SEQUENCE = 4;
	
	private TimeTemplate currentTemplate;
	private int seconds;
	private int currentSequence;
	private boolean isOn;
	private JLabel timeLabel;
	
	// = = = GETTERS AND SETTERS = = = 
	
	public int getSeconds() {
		return seconds;
	}//End getSeconds

	/**
	 * This is the method that sets the total amount
	 * of seconds the timer will be running through
	 * @param seconds
	 */
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}//End setSeconds
	
	public boolean getIsOn()
	{
		return isOn;
	}//End getIsOn
	
	public int getCurrentSequence()
	{
		return currentSequence;
	}
	
	public TimeTemplate getCurrentTemplate()
	{
		return currentTemplate;
	}
	
	public void setCurrentTemplate(TimeTemplate newTemplate)
	{
		this.currentTemplate  = newTemplate;
	}
	
	// = = = CONSTRUCTOR = = = 
	/**
	 * Initializes the timer, takes in a param seconds.
	 * The timer is set to off by default.
	 * @param seconds
	 */
	public Timer(int seconds)
	{
		this.seconds = seconds;
		this.isOn = false;
		this.currentSequence = this.DEFAULT_SEQUENCE;
		this.currentTemplate = new TimeTemplate(30, 10);
	}//End constructor	
	
	// = = = CLASS METHODS = = = 	
	/**
	 * This method actually updates the JLabel object
	 * with the correctly formatted string of time.
	 * @param timeLabel
	 * @throws InterruptedException
	 */
	public void updateTimerLabel(JLabel timeLabel) throws InterruptedException
	{
		if(this.isOn == true && this.seconds > -1)
		{
			//Updating Time Label and Lowering the Second
			timeLabel.setText(returnFormattedTime(seconds));
			seconds--;
			
			//Updating Sequence
			if(this.seconds == 0)
			{
				this.currentSequence--;
			}
		}	
	}//End updateTimerLabel
	
	public void updateSequenceLabel(JLabel sequenceLabel)
	{
		sequenceLabel.setText(this.currentSequence + " Sequences Left");
	}//End updateSequenceLabel
	
	/**
	 * Returns a formatted time based off of the seconds given. 
	 * 00:00 Format
	 * @param secondsGiven
	 * @return formattedString
	 */
	public String returnFormattedTime(int secondsGiven)
	{
		//Local Vars
		int minutes;
		int seconds;
		String minuteString; //Needed for 00:00 format
		
		//Getting the number of minutes
		minutes = Math.floorDiv(secondsGiven, 60);
		seconds = secondsGiven - (minutes * 60);
		
		//Formatting the Time
			//Minutes
		if(minutes < 10)
		{
			minuteString = "0" + minutes;
		}
		else
		{
			minuteString = Integer.toString(minutes);
		}
			//Seconds & Returning the Final Format
		if(seconds < 10)
		{
			String formattedString = minuteString + ":0" + seconds;
			return formattedString;
		}
		else
		{
			String formattedString = minuteString + ":" + seconds;
			return formattedString;
		}
	}//End returnFormattedTime
	
	/**
	 * This static method converts a set amount of time (minutes & seconds)
	 * to a total amount of seconds.
	 * @param minutes
	 * @param seconds
	 * @return finalSeconds
	 */
	public static int convertTimeToSeconds(int minutes, int seconds)
	{
		//Local vars
		int finalSeconds = 0;
		
		//Converting the minutes to seconds
		finalSeconds += (minutes * 60);
		finalSeconds += seconds;
		
		return finalSeconds;
	}//End convertTimeToSeconds
	
	
	//Functions to enabale and disable the timer
	public void enableTimer()
	{
		this.isOn = true;
		System.out.println("Timer is On");
		//swingTimer.start();
		
	}
	public void disableTimer()
	{
		this.isOn = false;
		System.out.println("Timer is Off");
	}
	
}//End class Timer
