package Pomodoro;
import javax.swing.JButton;

/**
 * This subclass of JButton accepts an object
 * of TimeTemplate to be stored for GUI uses.
 */
public class PresetButton extends JButton {
	// = = = CLASS FIELDS = = = 
	private TimeTemplate buttonTemplate;
	
	// = = = GETTER = = = 
	public TimeTemplate getButtonTemplate() {
		return buttonTemplate;
	}
	
	// = = = CONSTRUCTOR = = = 
	/**
	 * Creates a custom button object that has
	 * a TimeTemplate to go with
	 * @param text
	 * @param template
	 */
	public PresetButton(String text, TimeTemplate template)
	{
		super.setText(text);
		buttonTemplate = template;
	}//End constructor

	
	
}//End class Preset Button
