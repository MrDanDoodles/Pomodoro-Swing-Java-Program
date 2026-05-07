package Pomodoro;
/**
	This class stores time templates that the 
	program uses to dictate how much time is spent
	working/studying and resting.
 */
public class TimeTemplate {
	// = = = CLASS FIELDS = = =
	private int workMinutes;
	private int workSecondsTotal;
	
	private int restMinutes;
	private int restSecondsTotal;
	
	// = = = GETTERS AND SETTERS = = = 
	/**
	 * Gets the total amount of work in
	 * seconds
	 * @return workSecondsTotal
	 */
	public int getWorkSecondsTotal() {
		return workSecondsTotal;
	}
	
	/**
	 * Gets the total amount of rest in
	 * seconds
	 * @return restSecondsTotal
	 */
	public int getRestSecondsTotal() {
		return restSecondsTotal;
	}
	
	// = = = CONSTRUCTORS = = = 
	/**
	 * This constructor is needed for the 
	 * conversion of minutes to a total
	 * amount of seconds.
	 * @param workMin
	 * @param restMin
	 */
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
