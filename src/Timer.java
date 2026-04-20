
/**
 * This class handles all the variables and methods to
 * handle the timer. Such as setting and updating the time.
 */
public class Timer {
	// = = = CLASS FIELDS = = = 
	final private int MILLISECONDS = 1000; //Needed for the 
	private int seconds;
	
	// = = = GETTERS AND SETTERS = = = 
	
	public int getSeconds() {
		return seconds;
	}//End getSeconds

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}//End setSeconds

	// = = = CONSTRUCTOR = = = 
	public Timer(int seconds)
	{
		this.seconds = seconds;
	}//End constructor
	
	// = = = CLASS METHODS = = = 
	/**
	 * Displays what the current time is, 
	 * based off of the seconds given.
	 */
	public void updateTime()
	{
		//Loop to count down each second
		while(this.seconds > 0)
		{
			//The actual logic for counting down
			try {
				System.out.println(returnFormattedTime(seconds));
				Thread.sleep(MILLISECONDS);
				seconds--;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//end while
		System.out.println("Timer is Done!");
	}//End updateTime()
	
	/**
	 * Returns a formatted time based off of the seconds given. 
	 * 00:00 Format
	 * @param secondsGiven
	 * @return formattedString
	 */
	private String returnFormattedTime(int secondsGiven)
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
	
	
}//End class Timer
