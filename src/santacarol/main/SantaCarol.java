package santacarol.main;

import javax.sound.midi.*;

public class SantaCarol {
	
	public static void main(String[] args) {
		System.out.println("Ready to play music!"); // Signal user that the music player will start
		SantaCarol sc = new SantaCarol(); // Create a new Santa Carol object to access the "play" method
		sc.play(); // Play
	}
	
	/**
	 * Plays music to a music video of the computer drawing you a cute little santa, merry Christmas :)
	 * 
	 * @author basti
	 */
	public void play() {
		
		try {
			// Get and open the sequencer
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			// Make a sequence and a track
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			// Music time! On Channel 1!
			track.add(makeEvent(true, 1, 62, 1));
			track.add(makeEvent(true, 1, 61, 4));
			track.add(makeEvent(true, 1, 62, 6));
			track.add(makeEvent(true, 1, 59, 8));
			track.add(makeEvent(true, 1, 62, 11));
			track.add(makeEvent(true, 1, 61, 14));
			track.add(makeEvent(true, 1, 62, 16));
			track.add(makeEvent(true, 1, 59, 18));
			track.add(makeEvent(true, 1, 62, 21));
			track.add(makeEvent(true, 1, 61, 24));
			track.add(makeEvent(true, 1, 62, 26));
			track.add(makeEvent(true, 1, 59, 28));
			track.add(makeEvent(true, 1, 62, 31));
			track.add(makeEvent(true, 1, 61, 34));
			track.add(makeEvent(true, 1, 62, 36));
			track.add(makeEvent(true, 1, 59, 38));
			track.add(makeEvent(true, 1, 62, 41));
			track.add(makeEvent(true, 1, 61, 44));
			track.add(makeEvent(true, 1, 62, 46));
			track.add(makeEvent(true, 1, 59, 48));
			track.add(makeEvent(true, 1, 62, 51));
			track.add(makeEvent(true, 1, 61, 54));
			track.add(makeEvent(true, 1, 62, 56));
			track.add(makeEvent(true, 1, 59, 58));
			track.add(makeEvent(true, 1, 62, 51));
			track.add(makeEvent(true, 1, 61, 54));
			track.add(makeEvent(true, 1, 62, 56));
			track.add(makeEvent(true, 1, 59, 58));
			track.add(makeEvent(true, 1, 62, 61));
			track.add(makeEvent(true, 1, 61, 64));
			track.add(makeEvent(true, 1, 62, 66));
			track.add(makeEvent(true, 1, 59, 68));
			track.add(makeEvent(true, 1, 62, 71));
			track.add(makeEvent(true, 1, 61, 74));
			track.add(makeEvent(true, 1, 62, 76));
			track.add(makeEvent(true, 1, 59, 78));
			
			// Music time! On Channel 2!
			track.add(makeEvent(true, 2, 47, 41));
			track.add(makeEvent(true, 2, 45, 51));
			track.add(makeEvent(true, 2, 43, 61));
			track.add(makeEvent(true, 2, 42, 71));
			
			// Let's play the music
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(160);
			sequencer.start();
		} catch (Exception ex) {
			// Catch and print the exception
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * Simplifies/Abstracts the creation of a MidiEvent, you're welcome :)
	 * 
	 * @author basti
	 * @param noteType - Whether a note is played or released, enter True for play and False for release
	 * @param note - Note number
	 * @param beat - Play or releases note at this beat
	 * @return a MidiEvent to add to a track
	 */
	public static MidiEvent makeEvent(boolean noteType, int channel, int note, int beat) {
		// Based on noteType determine number for command
		int cmd;
		if (noteType) {
			cmd = 144;
		} else {
			cmd = 128;
		}
		
		try {
			ShortMessage a = new ShortMessage(); // Make a music message
			
			a.setMessage(cmd, channel, note, 100); // Play or release a note...
			MidiEvent playNote = new MidiEvent(a, beat); // ...at beat "beat"
			return playNote; // Return the note
		} catch (Exception ex) {
			// Catch and print the exception
			ex.printStackTrace();
			return null; // We still need to return something
		}
	}
}
