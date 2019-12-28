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
			track.add(makeEvent(true, 1, 71, 161, 100));
			track.add(makeEvent(true, 1, 71, 164, 100));
			track.add(makeEvent(true, 1, 71, 166, 100));
			track.add(makeEvent(true, 1, 69, 168, 100));
			track.add(makeEvent(true, 1, 67, 170, 100));
			track.add(makeEvent(true, 1, 66, 172, 100));
			track.add(makeEvent(true, 1, 66, 175, 100));
			track.add(makeEvent(true, 1, 66, 177, 100));
			track.add(makeEvent(true, 1, 64, 179, 100));
			track.add(makeEvent(true, 1, 62, 181, 100));
			track.add(makeEvent(true, 1, 64, 183, 100));
			track.add(makeEvent(true, 1, 64, 186, 100));
			track.add(makeEvent(true, 1, 64, 188, 100));
			track.add(makeEvent(true, 1, 66, 190, 100));
			track.add(makeEvent(true, 1, 64, 192, 100));
			track.add(makeEvent(true, 1, 59, 194, 100));
			track.add(makeEvent(true, 1, 59, 197, 100));
			track.add(makeEvent(true, 1, 59, 199, 100));
			track.add(makeEvent(true, 1, 59, 201, 100));
			track.add(makeEvent(true, 1, 59, 204, 100)); // 204
			track.add(makeEvent(true, 1, 61, 206, 100)); // 206
			track.add(makeEvent(true, 1, 63, 208, 100)); // 208
			track.add(makeEvent(true, 1, 64, 210, 100)); // 210
			track.add(makeEvent(true, 1, 66, 212, 100)); // 212
			track.add(makeEvent(true, 1, 67, 214, 100)); // 214
			track.add(makeEvent(true, 1, 69, 216, 100)); // 216
			track.add(makeEvent(true, 1, 71, 218, 100)); // 218
			track.add(makeEvent(true, 1, 69, 220, 100)); // 220
			track.add(makeEvent(true, 1, 67, 223, 100)); // 223
			track.add(makeEvent(true, 1, 71, 226, 100)); // 226
			track.add(makeEvent(true, 1, 73, 228, 100)); // 228
			track.add(makeEvent(true, 1, 75, 230, 100)); // 230
			track.add(makeEvent(true, 1, 76, 232, 100)); // 232
			track.add(makeEvent(true, 1, 78, 234, 100)); // 234
			track.add(makeEvent(true, 1, 79, 236, 100)); // 236
			track.add(makeEvent(true, 1, 81, 238, 100)); // 238
			track.add(makeEvent(true, 1, 83, 240, 100)); // 240
			track.add(makeEvent(true, 1, 81, 242, 100)); // 242
			track.add(makeEvent(true, 1, 79, 245, 100)); // 245
			track.add(makeEvent(true, 1, 79, 248, 100));
			track.add(makeEvent(true, 1, 78, 251, 100));
			track.add(makeEvent(true, 1, 79, 253, 100));
			track.add(makeEvent(true, 1, 76, 255, 100));
			track.add(makeEvent(true, 1, 79, 248, 100));
			track.add(makeEvent(true, 1, 78, 251, 100));
			track.add(makeEvent(true, 1, 79, 253, 100));
			track.add(makeEvent(true, 1, 76, 255, 100));
			track.add(makeEvent(true, 1, 79, 258, 100));
			track.add(makeEvent(true, 1, 78, 261, 100));
			track.add(makeEvent(true, 1, 79, 263, 100));
			track.add(makeEvent(true, 1, 76, 265, 100));
			track.add(makeEvent(true, 1, 79, 268, 100));
			track.add(makeEvent(true, 1, 78, 271, 100));
			track.add(makeEvent(true, 1, 79, 273, 100));
			track.add(makeEvent(true, 1, 76, 275, 100));
			track.add(makeEvent(true, 1, 79, 278, 100));
			track.add(makeEvent(true, 1, 78, 281, 100));
			track.add(makeEvent(true, 1, 79, 283, 100));
			track.add(makeEvent(true, 1, 76, 285, 100));
			track.add(makeEvent(true, 1, 79, 288, 100));
			track.add(makeEvent(true, 1, 78, 291, 100));
			track.add(makeEvent(true, 1, 79, 293, 100));
			track.add(makeEvent(true, 1, 76, 295, 100));
			track.add(makeEvent(true, 1, 79, 298, 100));
			track.add(makeEvent(true, 1, 78, 301, 100));
			track.add(makeEvent(true, 1, 79, 303, 100));
			track.add(makeEvent(true, 1, 76, 305, 100));
			track.add(makeEvent(true, 1, 79, 308, 100));
			track.add(makeEvent(true, 1, 78, 311, 100));
			track.add(makeEvent(true, 1, 79, 313, 100));
			track.add(makeEvent(true, 1, 76, 315, 100));
			track.add(makeEvent(true, 1, 79, 318, 100));
			track.add(makeEvent(true, 1, 78, 321, 100));
			track.add(makeEvent(true, 1, 79, 323, 100));
			track.add(makeEvent(true, 1, 76, 325, 100));
			track.add(makeEvent(false, 1, 76, 341, 100));
		
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
			track.add(makeEvent(true, 2, 42, 204, 120));
			track.add(makeEvent(true, 2, 42, 216, 120));
			track.add(makeEvent(true, 2, 42, 226, 120));
			track.add(makeEvent(true, 2, 42, 238, 120));
			track.add(makeEvent(true, 2, 47, 248, 120));
			track.add(makeEvent(true, 2, 45, 258, 120));
			track.add(makeEvent(true, 2, 43, 268, 120));
			track.add(makeEvent(true, 2, 42, 278, 120));
			track.add(makeEvent(true, 2, 47, 288, 120));
			track.add(makeEvent(false, 2, 47, 296, 120));
			
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
	 * @param hardness - How hard the note is being pressed
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
