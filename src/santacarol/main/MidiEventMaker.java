package santacarol.main;

// Import necessary modules
import javax.sound.midi.*;

public class MidiEventMaker {

	/**
	 * Simplifies/Abstracts the creation of a MidiEvent, you're welcome :)
	 * 
	 * @author basti
	 * @param noteType - Whether a note is played or released, enter True for play and False for release
	 * @param note - Note number
	 * @param beat - Play or releases note at this beat
	 * @return a MidiEvent to add to a track
	 */
	public static MidiEvent makeEvent(boolean noteType, int note, int beat) {
		// Based on noteType determine number for command
		int cmd;
		if (noteType) {
			cmd = 144;
		} else {
			cmd = 128;
		}
		
		try {
			ShortMessage a = new ShortMessage(); // Make a music message
			a.setMessage(cmd, 1, note, 100); // Play or release a note...
			MidiEvent playNote = new MidiEvent(a, beat); // ...at beat "beat"
			return playNote; // Return the note
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
	}
	
}
