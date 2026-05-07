package Pomodoro;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 * This class is used to play sound effects at 
 * designated specific times. It wont require a 
 * constructor, and everything is called statically.
 */
public class AudioHandler {
	// = = = CLASS FIELDS = = = 
	public static final String AUDIO_PATH = "AlarmSoundFX.wav";
	private static Clip clip;
	
	static //Creating the audio stream
	{
		try
		{
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(AudioHandler.class.getResource(AUDIO_PATH));
			clip = AudioSystem.getClip();
			clip.open(audioIn);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	// = = = STATIC METHODS = = = 
	public static void playAudio() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException
	{
		if(clip != null)
		{
			clip.stop();
			clip.setFramePosition(0);
			clip.start();
		}	
	}//End playAudio
	
}//End class AudioHandler
