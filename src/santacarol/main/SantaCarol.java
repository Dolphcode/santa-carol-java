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
			track.add(makeEvent(true, 1, 62, 1, 100));
			track.add(makeEvent(true, 1, 61, 4, 100));
			track.add(makeEvent(true, 1, 62, 6, 100));
			track.add(makeEvent(true, 1, 59, 8, 100));
			track.add(makeEvent(true, 1, 62, 11, 100));
			track.add(makeEvent(true, 1, 61, 14, 100));
			track.add(makeEvent(true, 1, 62, 16, 100));
			track.add(makeEvent(true, 1, 59, 18, 100));
			track.add(makeEvent(true, 1, 62, 21, 100));
			track.add(makeEvent(true, 1, 61, 24, 100));
			track.add(makeEvent(true, 1, 62, 26, 100));
			track.add(makeEvent(true, 1, 59, 28, 100));
			track.add(makeEvent(true, 1, 62, 31, 100));
			track.add(makeEvent(true, 1, 61, 34, 100));
			track.add(makeEvent(true, 1, 62, 36, 100));
			track.add(makeEvent(true, 1, 59, 38, 100));
			track.add(makeEvent(true, 1, 62, 41, 100));
			track.add(makeEvent(true, 1, 61, 44, 100));
			track.add(makeEvent(true, 1, 62, 46, 100));
			track.add(makeEvent(true, 1, 59, 48, 100));
			track.add(makeEvent(true, 1, 62, 51, 100));
			track.add(makeEvent(true, 1, 61, 54, 100));
			track.add(makeEvent(true, 1, 62, 56, 100));
			track.add(makeEvent(true, 1, 59, 58, 100));
			track.add(makeEvent(true, 1, 62, 51, 100));
			track.add(makeEvent(true, 1, 61, 54, 100));
			track.add(makeEvent(true, 1, 62, 56, 100));
			track.add(makeEvent(true, 1, 59, 58, 100));
			track.add(makeEvent(true, 1, 62, 61, 100));
			track.add(makeEvent(true, 1, 61, 64, 100));
			track.add(makeEvent(true, 1, 62, 66, 100));
			track.add(makeEvent(true, 1, 59, 68, 100));
			track.add(makeEvent(true, 1, 62, 71, 100));
			track.add(makeEvent(true, 1, 61, 74, 100));
			track.add(makeEvent(true, 1, 62, 76, 100));
			track.add(makeEvent(true, 1, 59, 78, 100));
			track.add(makeEvent(true, 1, 62, 81, 100));
			track.add(makeEvent(true, 1, 61, 84, 100));
			track.add(makeEvent(true, 1, 62, 86, 100));
			track.add(makeEvent(true, 1, 59, 88, 100));
			track.add(makeEvent(true, 1, 62, 91, 100));
			track.add(makeEvent(true, 1, 61, 94, 100));
			track.add(makeEvent(true, 1, 62, 96, 100));
			track.add(makeEvent(true, 1, 59, 98, 100));
			track.add(makeEvent(true, 1, 62, 101, 100));
			track.add(makeEvent(true, 1, 61, 104, 100));
			track.add(makeEvent(true, 1, 62, 106, 100));
			track.add(makeEvent(true, 1, 59, 108, 100));
			track.add(makeEvent(true, 1, 62, 111, 100));
			track.add(makeEvent(true, 1, 61, 114, 100));
			track.add(makeEvent(true, 1, 62, 116, 100));
			track.add(makeEvent(true, 1, 59, 118, 100));
			track.add(makeEvent(true, 1, 66, 121, 100));
			track.add(makeEvent(true, 1, 64, 124, 100));
			track.add(makeEvent(true, 1, 66, 126, 100));
			track.add(makeEvent(true, 1, 62, 128, 100));
			track.add(makeEvent(true, 1, 66, 131, 100));
			track.add(makeEvent(true, 1, 64, 134, 100));
			track.add(makeEvent(true, 1, 66, 136, 100));
			track.add(makeEvent(true, 1, 62, 138, 100));
			track.add(makeEvent(true, 1, 66, 141, 100));
			track.add(makeEvent(true, 1, 64, 144, 100));
			track.add(makeEvent(true, 1, 66, 146, 100));
			track.add(makeEvent(true, 1, 62, 148, 100));
			track.add(makeEvent(true, 1, 66, 151, 100));
			track.add(makeEvent(true, 1, 64, 154, 100));
			track.add(makeEvent(true, 1, 66, 156, 100));
			track.add(makeEvent(true, 1, 62, 158, 100));
			track.add(makeEvent(true, 1, 71, 161, 100)); // 161
			track.add(makeEvent(true, 1, 71, 164, 100)); // 164
			track.add(makeEvent(true, 1, 71, 166, 100)); // 166
			track.add(makeEvent(true, 1, 69, 168, 100)); // 168
			track.add(makeEvent(true, 1, 67, 170, 100)); // 170
			track.add(makeEvent(true, 1, 66, 172, 100)); // 172
			track.add(makeEvent(true, 1, 66, 175, 100)); // 175
			track.add(makeEvent(true, 1, 66, 177, 100)); // 177
			track.add(makeEvent(true, 1, 64, 179, 100)); // 179
			track.add(makeEvent(true, 1, 62, 181, 100)); // 181
			track.add(makeEvent(true, 1, 64, 183, 100)); // 183
			track.add(makeEvent(true, 1, 64, 186, 100)); // 186
			track.add(makeEvent(true, 1, 64, 188, 100)); // 188
			track.add(makeEvent(true, 1, 66, 190, 100)); // 190
			track.add(makeEvent(true, 1, 64, 192, 100)); // 192
			track.add(makeEvent(true, 1, 59, 194, 100)); // 194
			track.add(makeEvent(true, 1, 59, 197, 100)); // 197
			track.add(makeEvent(true, 1, 59, 199, 100)); // 199
			track.add(makeEvent(true, 1, 59, 201, 100)); // 201
			
			// Music time! On Channel 2!
			track.add(makeEvent(true, 2, 47, 41, 120));
			track.add(makeEvent(true, 2, 45, 51, 120));
			track.add(makeEvent(true, 2, 43, 61, 120));
			track.add(makeEvent(true, 2, 42, 71, 120));
			track.add(makeEvent(true, 2, 47, 81, 120));
			track.add(makeEvent(true, 2, 45, 91, 120));
			track.add(makeEvent(true, 2, 43, 101, 120));
			track.add(makeEvent(true, 2, 42, 111, 120));
			track.add(makeEvent(true, 2, 47, 121, 120));
			track.add(makeEvent(true, 2, 45, 131, 120));
			track.add(makeEvent(true, 2, 43, 141, 120));
			track.add(makeEvent(true, 2, 42, 151, 120));
			track.add(makeEvent(true, 2, 47, 161, 120));
			track.add(makeEvent(true, 2, 45, 172, 120));
			track.add(makeEvent(true, 2, 43, 183, 120));
			track.add(makeEvent(true, 2, 42, 194, 120));
			
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
	 * @param channel - Channel on which a note will be played on
	 * @param note - Note number
	 * @param beat - Play or releases note at this beat
	 * @return a MidiEvent to add to a track
	 */
	public static MidiEvent makeEvent(boolean noteType, int channel, int note, int beat, int hardness) {
		// Based on noteType determine number for command
		int cmd;
		if (noteType) {
			cmd = 144;
		} else {
			cmd = 128;
		}
		
		try {
			ShortMessage a = new ShortMessage(); // Make a music message
			
			a.setMessage(cmd, channel, note, hardness); // Play or release a note...
			MidiEvent playNote = new MidiEvent(a, beat); // ...at beat "beat"
			return playNote; // Return the note
		} catch (Exception ex) {
			// Catch and print the exception
			ex.printStackTrace();
			return null; // We still need to return something
		}
	}
}
