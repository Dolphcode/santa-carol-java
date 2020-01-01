package santacarol.main;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

/**
 * 
 * An awesome class for an application that draws Santa to the beat of Carol of the Bells
 * Run the play(); method for the app to run
 * 
 * @author InfernoProgrammer123
 * @Repo: https://github.com/InfernoProgrammer123/SantaCarol/
 *
 */
public class SantaCarol extends JFrame{
	
	// Instance variables
	private int tick = 0;
	private boolean isPlaying = false;
	private myDrawPanel myPanel;
	private JFrame frame = new JFrame("Santa's Carol");
	private JButton button = new JButton("Waiting for song to finish");
	private ImageIcon icon;
		
	public SantaCarol() {
		System.out.println("SantaCarol object created"); // Tell user a SantaCarol object has been created
	}
	
	private void setupGui() {
		
		myPanel = new myDrawPanel(); // Create a myDrawPanel object
		myPanel.setSize(600, 600);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				SantaCarol.class.
				getResource("/santacarol/main/images/SantaClausIcon.png"))); // Set the app icon
		
		setSize(600, 620); // Set the size
		setTitle("Santa's Carol"); // Set the title of the app
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(BorderLayout.CENTER, myPanel);
		getContentPane().add(BorderLayout.SOUTH, button);
		setVisible(true); // Make sure the frame is visible
		setResizable(false); // Make sure the frame is not resizable
		
		System.out.println("GUI Ready!"); // Signal user GUI is ready
	}
	
	public void play() {
		
		// Set isPlaying to true and reset the ticker
		isPlaying = true;
		tick = 0;
		
		try {
			
			// Add an action listener to the button
			button.addActionListener(new myButtonListener());
			
			// Set button text
			button.setText("Waiting for song to finish");
			
			// Create the gui
			setupGui();
			
			// Get and open the sequencer
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			System.out.println("Sequencer found and opened"); // Tell user sequencer was found and opened
			
			// Create conditions that controller listener will listen for and add the listener to the sequencer
			int[] eventQuery = {47};
			sequencer.addControllerEventListener(myPanel, eventQuery);
			
			// Make a sequence and a track
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			// Music time! On Channel 1!
			track.add(makeEvent(144, 1, 62, 1, 100));
			track.add(makeEvent(144, 1, 61, 4, 100));
			track.add(makeEvent(144, 1, 62, 6, 100));
			track.add(makeEvent(144, 1, 59, 8, 100));
			track.add(makeEvent(144, 1, 62, 11, 100));
			track.add(makeEvent(144, 1, 61, 14, 100));
			track.add(makeEvent(144, 1, 62, 16, 100));
			track.add(makeEvent(144, 1, 59, 18, 100));
			track.add(makeEvent(144, 1, 62, 21, 100));
			track.add(makeEvent(144, 1, 61, 24, 100));
			track.add(makeEvent(144, 1, 62, 26, 100));
			track.add(makeEvent(144, 1, 59, 28, 100));
			track.add(makeEvent(144, 1, 62, 31, 100));
			track.add(makeEvent(144, 1, 61, 34, 100));
			track.add(makeEvent(144, 1, 62, 36, 100));
			track.add(makeEvent(144, 1, 59, 38, 100));
			track.add(makeEvent(144, 1, 62, 41, 100));
			track.add(makeEvent(144, 1, 61, 44, 100));
			track.add(makeEvent(144, 1, 62, 46, 100));
			track.add(makeEvent(144, 1, 59, 48, 100));
			track.add(makeEvent(144, 1, 62, 51, 100));
			track.add(makeEvent(144, 1, 61, 54, 100));
			track.add(makeEvent(144, 1, 62, 56, 100));
			track.add(makeEvent(144, 1, 59, 58, 100));
			track.add(makeEvent(144, 1, 62, 51, 100));
			track.add(makeEvent(144, 1, 61, 54, 100));
			track.add(makeEvent(144, 1, 62, 56, 100));
			track.add(makeEvent(144, 1, 59, 58, 100));
			track.add(makeEvent(144, 1, 62, 61, 100));
			track.add(makeEvent(144, 1, 61, 64, 100));
			track.add(makeEvent(144, 1, 62, 66, 100));
			track.add(makeEvent(144, 1, 59, 68, 100));
			track.add(makeEvent(144, 1, 62, 71, 100));
			track.add(makeEvent(144, 1, 61, 74, 100));
			track.add(makeEvent(144, 1, 62, 76, 100));
			track.add(makeEvent(144, 1, 59, 78, 100));
			track.add(makeEvent(144, 1, 62, 81, 100));
			track.add(makeEvent(144, 1, 61, 84, 100));
			track.add(makeEvent(144, 1, 62, 86, 100));
			track.add(makeEvent(144, 1, 59, 88, 100));
			track.add(makeEvent(144, 1, 62, 91, 100));
			track.add(makeEvent(144, 1, 61, 94, 100));
			track.add(makeEvent(144, 1, 62, 96, 100));
			track.add(makeEvent(144, 1, 59, 98, 100));
			track.add(makeEvent(144, 1, 62, 101, 100));
			track.add(makeEvent(144, 1, 61, 104, 100));
			track.add(makeEvent(144, 1, 62, 106, 100));
			track.add(makeEvent(144, 1, 59, 108, 100));
			track.add(makeEvent(144, 1, 62, 111, 100));
			track.add(makeEvent(144, 1, 61, 114, 100));
			track.add(makeEvent(144, 1, 62, 116, 100));
			track.add(makeEvent(144, 1, 59, 118, 100));
			track.add(makeEvent(144, 1, 66, 121, 100));
			track.add(makeEvent(144, 1, 64, 124, 100));
			track.add(makeEvent(144, 1, 66, 126, 100));
			track.add(makeEvent(144, 1, 62, 128, 100));
			track.add(makeEvent(144, 1, 66, 131, 100));
			track.add(makeEvent(144, 1, 64, 134, 100));
			track.add(makeEvent(144, 1, 66, 136, 100));
			track.add(makeEvent(144, 1, 62, 138, 100));
			track.add(makeEvent(144, 1, 66, 141, 100));
			track.add(makeEvent(144, 1, 64, 144, 100));
			track.add(makeEvent(144, 1, 66, 146, 100));
			track.add(makeEvent(144, 1, 62, 148, 100));
			track.add(makeEvent(144, 1, 66, 151, 100));
			track.add(makeEvent(144, 1, 64, 154, 100));
			track.add(makeEvent(144, 1, 66, 156, 100));
			track.add(makeEvent(144, 1, 62, 158, 100));
			track.add(makeEvent(144, 1, 71, 161, 100));
			track.add(makeEvent(144, 1, 71, 164, 100));
			track.add(makeEvent(144, 1, 71, 166, 100));
			track.add(makeEvent(144, 1, 69, 168, 100));
			track.add(makeEvent(144, 1, 67, 170, 100));
			track.add(makeEvent(144, 1, 66, 172, 100));
			track.add(makeEvent(144, 1, 66, 175, 100));
			track.add(makeEvent(144, 1, 66, 177, 100));
			track.add(makeEvent(144, 1, 64, 179, 100));
			track.add(makeEvent(144, 1, 62, 181, 100));
			track.add(makeEvent(144, 1, 64, 183, 100));
			track.add(makeEvent(144, 1, 64, 186, 100));
			track.add(makeEvent(144, 1, 64, 188, 100));
			track.add(makeEvent(144, 1, 66, 190, 100));
			track.add(makeEvent(144, 1, 64, 192, 100));
			track.add(makeEvent(144, 1, 59, 194, 100));
			track.add(makeEvent(144, 1, 59, 197, 100));
			track.add(makeEvent(144, 1, 59, 199, 100));
			track.add(makeEvent(144, 1, 59, 201, 100));
			track.add(makeEvent(144, 1, 59, 204, 100));
			track.add(makeEvent(144, 1, 61, 206, 100));
			track.add(makeEvent(144, 1, 63, 208, 100));
			track.add(makeEvent(144, 1, 64, 210, 100));
			track.add(makeEvent(144, 1, 66, 212, 100));
			track.add(makeEvent(144, 1, 67, 214, 100));
			track.add(makeEvent(144, 1, 69, 216, 100));
			track.add(makeEvent(144, 1, 71, 218, 100));
			track.add(makeEvent(144, 1, 69, 220, 100));
			track.add(makeEvent(144, 1, 67, 223, 100));
			track.add(makeEvent(144, 1, 71, 226, 100));
			track.add(makeEvent(144, 1, 73, 228, 100));
			track.add(makeEvent(144, 1, 75, 230, 100));
			track.add(makeEvent(144, 1, 76, 232, 100));
			track.add(makeEvent(144, 1, 78, 234, 100));
			track.add(makeEvent(144, 1, 79, 236, 100));
			track.add(makeEvent(144, 1, 81, 238, 100));
			track.add(makeEvent(144, 1, 83, 240, 100));
			track.add(makeEvent(144, 1, 81, 242, 100));
			track.add(makeEvent(144, 1, 79, 245, 100));
			track.add(makeEvent(144, 1, 79, 248, 100));
			track.add(makeEvent(144, 1, 78, 251, 100));
			track.add(makeEvent(144, 1, 79, 253, 100));
			track.add(makeEvent(144, 1, 76, 255, 100));
			track.add(makeEvent(144, 1, 79, 248, 100));
			track.add(makeEvent(144, 1, 78, 251, 100));
			track.add(makeEvent(144, 1, 79, 253, 100));
			track.add(makeEvent(144, 1, 76, 255, 100));
			track.add(makeEvent(144, 1, 79, 258, 100));
			track.add(makeEvent(144, 1, 78, 261, 100));
			track.add(makeEvent(144, 1, 79, 263, 100));
			track.add(makeEvent(144, 1, 76, 265, 100));
			track.add(makeEvent(144, 1, 79, 268, 100));
			track.add(makeEvent(144, 1, 78, 271, 100));
			track.add(makeEvent(144, 1, 79, 273, 100));
			track.add(makeEvent(144, 1, 76, 275, 100));
			track.add(makeEvent(144, 1, 79, 278, 100));
			track.add(makeEvent(144, 1, 78, 281, 100));
			track.add(makeEvent(144, 1, 79, 283, 100));
			track.add(makeEvent(144, 1, 76, 285, 100));
			track.add(makeEvent(144, 1, 79, 288, 100));
			track.add(makeEvent(144, 1, 78, 291, 100));
			track.add(makeEvent(144, 1, 79, 293, 100));
			track.add(makeEvent(144, 1, 76, 295, 100));
			track.add(makeEvent(144, 1, 79, 298, 100));
			track.add(makeEvent(144, 1, 78, 301, 100));
			track.add(makeEvent(144, 1, 79, 303, 100));
			track.add(makeEvent(144, 1, 76, 305, 100));
			track.add(makeEvent(144, 1, 79, 308, 100));
			track.add(makeEvent(144, 1, 78, 311, 100));
			track.add(makeEvent(144, 1, 79, 313, 100));
			track.add(makeEvent(144, 1, 76, 315, 100));
			track.add(makeEvent(144, 1, 79, 318, 100));
			track.add(makeEvent(144, 1, 78, 321, 100));
			track.add(makeEvent(144, 1, 79, 323, 100));
			track.add(makeEvent(144, 1, 76, 325, 100));
			track.add(makeEvent(128, 1, 76, 341, 100));
		
			// Music time! On Channel 2!
			track.add(makeEvent(144, 2, 47, 41, 120));
			track.add(makeEvent(144, 2, 45, 51, 120));
			track.add(makeEvent(144, 2, 43, 61, 120));
			track.add(makeEvent(144, 2, 42, 71, 120));
			track.add(makeEvent(144, 2, 47, 81, 120));
			track.add(makeEvent(144, 2, 45, 91, 120));
			track.add(makeEvent(144, 2, 43, 101, 120));
			track.add(makeEvent(144, 2, 42, 111, 120));
			track.add(makeEvent(144, 2, 47, 121, 120));
			track.add(makeEvent(144, 2, 45, 131, 120));
			track.add(makeEvent(144, 2, 43, 141, 120));
			track.add(makeEvent(144, 2, 42, 151, 120));
			track.add(makeEvent(144, 2, 47, 161, 120));
			track.add(makeEvent(144, 2, 45, 172, 120));
			track.add(makeEvent(144, 2, 43, 183, 120));
			track.add(makeEvent(144, 2, 42, 194, 120));
			track.add(makeEvent(144, 2, 42, 204, 120));
			track.add(makeEvent(144, 2, 42, 216, 120));
			track.add(makeEvent(144, 2, 42, 226, 120));
			track.add(makeEvent(144, 2, 42, 238, 120));
			track.add(makeEvent(144, 2, 47, 248, 120));
			track.add(makeEvent(144, 2, 45, 258, 120));
			track.add(makeEvent(144, 2, 43, 268, 120));
			track.add(makeEvent(144, 2, 42, 278, 120));
			track.add(makeEvent(144, 2, 47, 288, 120));
			track.add(makeEvent(128, 2, 47, 296, 120));
			
			// Timing stuff for the event listener
			// The only arguments that matter are cmd and beat
			// Notes are all the same so we're only listening for one thing
			// Beat is for the timing of the events
			// Cmd = 176 is for events, the event listener will only catch things with 176 under cmd
			// All of these notes will come out as silence
			track.add(makeEvent(176, 2, 47, 0, 120));
			track.add(makeEvent(176, 2, 47, 41, 120)); // Background
			track.add(makeEvent(176, 2, 47, 51, 120)); // Trees
			track.add(makeEvent(176, 2, 47, 61, 120)); // Trees
			track.add(makeEvent(176, 2, 47, 71, 120)); // Snow
			track.add(makeEvent(176, 2, 47, 81, 120)); // Foot
			track.add(makeEvent(176, 2, 47, 91, 120)); // Foot
			track.add(makeEvent(176, 2, 47, 101, 120)); // Legs
			track.add(makeEvent(176, 2, 47, 111, 120)); // Puff
			track.add(makeEvent(176, 2, 47, 121, 120)); // Hand
			track.add(makeEvent(176, 2, 47, 131, 120)); // Hand
			track.add(makeEvent(176, 2, 47, 141, 120)); // Arms
			track.add(makeEvent(176, 2, 47, 151, 120)); // Puff
			track.add(makeEvent(176, 2, 47, 161, 120)); // Chest
			track.add(makeEvent(176, 2, 47, 172, 120)); // Line
			track.add(makeEvent(176, 2, 47, 183, 120)); // Belt
			track.add(makeEvent(176, 2, 47, 194, 120)); // Buckle
			track.add(makeEvent(176, 2, 47, 204, 120)); // Ears
			track.add(makeEvent(176, 2, 47, 216, 120)); // Head
			track.add(makeEvent(176, 2, 47, 226, 120)); // Eyes
			track.add(makeEvent(176, 2, 47, 238, 120)); // Nose
			track.add(makeEvent(176, 2, 47, 248, 120)); // Beard
			track.add(makeEvent(176, 2, 47, 258, 120)); // Hat
			track.add(makeEvent(176, 2, 47, 278, 120)); // Hat Puff
			track.add(makeEvent(176, 2, 47, 341, 120));
			System.out.println("Music loaded, now preparing to play"); // Signal user that music has been loaded into track
	
			// Let's play the music
			sequencer.setSequence(seq); //
			sequencer.setTempoInBPM(160); // Set BPM to 160
			sequencer.start(); // Start playing
			System.out.println("Now playing"); // Signal user music is playing
		} catch (Exception ex) {
			// Catch and print the exception
			System.out.println("Setup failed"); // Tell the user setup failed
			ex.printStackTrace();
		}
		
	}
	
	public static MidiEvent makeEvent(int cmd, int channel, int note, int beat, int hardness) {
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
	
	private class myButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button && isPlaying == false) {
				play();
			}
		}
		
	}
	
	private class myDrawPanel extends JPanel implements ControllerEventListener {
		
		// Not needed I think but Eclipse
		private static final long serialVersionUID = 1177792778672029685L;
		
		// A flag to trigger "paintComponent" only when an event is heard
		// Because other things can trigger a repaint
		boolean flag = false;
		
		// Save certain colors that are used multiple times for less typing
		Color skin = new Color(255, 212, 212);
		Color maroon = new Color(156, 0, 0);
		Color lightGray = new Color(230, 230, 230);
		Color treeTrunk = new Color(102, 49, 0);
		Color treeLeaves = new Color(0, 102, 51);
		
		public void controlChange(ShortMessage event) {
			flag = true;
			repaint();
		}
		
		// Paint component is called every "Repaint"
		public void paintComponent(Graphics g) {
			
			// Cast g to Graphics2D
			Graphics2D g2d = (Graphics2D) g;
			
			// Only execute if flag is true
			if (flag) {
				System.out.println("Valid event found, something was drawn"); // Tell user there was a valid event and something was drawn
				// Based on ticks(if we are on the nth beat, this happens)
				if (tick == 0) {
					
					// Set the background to white on start
					g2d.setPaint(Color.WHITE);
					g2d.fillRect(0, 0, 600, 600);
					
				} else if (tick == 1) {
					
					// Set start and end colors for gradient
					Color startColor = new Color(0, 14, 102);
					Color endColor = new Color(0, 0, 0);
					
					// Create gradient
					GradientPaint gradient = new GradientPaint(300, 600, startColor, 300, 0, endColor);
					
					// Paint background
					g2d.setPaint(gradient);
					g2d.fillRect(0, 0, 600, 600);
					
				} else if (tick == 2) {
					
					// Set paint to brown
					g2d.setPaint(treeTrunk);
					
					// Draw the tree trunk
					g2d.fillRect(75, 175, 30, 200);
					
					// Set paint to green
					g2d.setPaint(treeLeaves);
					
					// Create points for the first tree
					int[] x = {25,  90,  155};
					int[] y1 = {200, 125, 200};
					int[] y2 = {250, 175, 250};
					int[] y3 = {300, 225, 300};
					
					//Draw the tree leaves
					g2d.fillPolygon(x, y1, 3);
					g2d.fillPolygon(x, y2, 3);
					g2d.fillPolygon(x, y3, 3);
					
				} else if (tick == 3) {
					
					// Set paint to brown
					g2d.setPaint(treeTrunk);
					
					// Draw the tree trunk
					g2d.fillRect(475, 275, 30, 200);
					
					// Set paint to green
					g2d.setColor(treeLeaves);
					
					// Create points for the second tree
					int[] x = {425,  490,  555};
					int[] y1 = {200, 125, 200};
					int[] y2 = {250, 175, 250};
					int[] y3 = {300, 225, 300};
					
					//Draw the tree leaves
					g2d.fillPolygon(x, y1, 3);
					g2d.fillPolygon(x, y2, 3);
					g2d.fillPolygon(x, y3, 3);
					
				} else if (tick == 4) {
					
					// Set paint for snow
					g2d.setPaint(lightGray);
					
					// Paint snow
					g2d.fillOval(-100, 350, 375, 300);
					g2d.fillOval(-50, 350, 375, 300);
					g2d.fillOval(0, 350, 375, 300);
					g2d.fillOval(50, 350, 375, 300);
					g2d.fillOval(100, 350, 375, 300);
					g2d.fillOval(150, 350, 375, 300);
					g2d.fillOval(200, 350, 375, 300);
					g2d.fillOval(250, 350, 375, 300);
					g2d.fillOval(300, 350, 375, 300);
					
				} else if (tick == 5) {
					
					// Set paint to maroonish color
					g2d.setPaint(maroon);
					
					// Paint the legs
					g2d.fillRect(240, 375, 50, 150);
					g2d.fillRect(310, 375, 50, 150);
					
				} else if (tick == 6) {
					
					// Set paint to very dark grey
					g2d.setPaint(new Color(23, 23, 23));
					
					// Paint one shoe
					g2d.fillOval(190, 500, 100, 50);
					
				} else if (tick == 7) {
					
					// Paint another shoe
					g2d.fillOval(310, 500, 100, 50);
					
				} else if (tick == 8) {
					
					// Set paint for puff
					g2d.setPaint(Color.WHITE);
					
					// Paint the puff
					g2d.fillOval(230, 490, 70, 35);
					g2d.fillOval(300, 490, 70, 35);
					
				} else if (tick == 9) {
					
					// Set paint to maroonish color
					g2d.setPaint(maroon);
					
					// Set x and y values for the arms
					int[] x1 = {70, 190, 220, 100};
					int[] y1 = {300, 200, 230, 330};
					int[] x2 = {380, 500, 530, 410};
					int[] y2 = {230, 330, 300, 200};
					
					// Draw the arms
					g2d.fillPolygon(x1, y1, 4);
					g2d.fillPolygon(x2, y2, 4);
					g2d.fillOval(184, 194, 42, 42);
					g2d.fillOval(373, 193, 42, 42);
					
				} else if (tick == 10) {
					
					// Set paint to skin color
					g2d.setPaint(skin);
					
					// Paint a hand
					g2d.fillOval(64, 294, 42, 42);
					
				} else if (tick == 11) {
					
					// Set paint to skin color
					g2d.setPaint(skin);
					
					// Paint a second hand
					g2d.fillOval(493, 293, 42, 42);
					
				} else if (tick == 12) {
					
					// Set paint to puff color
					g2d.setPaint(Color.WHITE);
					
					// Set x and y values of puff
					int[] x1 = {60, 110, 140, 90};
					int[] y1 = {290, 340, 310, 260};
					int[] x2 = {460, 510, 540, 490};
					int[] y2 = {310, 260, 290, 340};
					
					// Paint puff
					g2d.fillPolygon(x1, y1, 4);
					g2d.fillPolygon(x2, y2, 4);
					
				} else if (tick == 13) {
					
					// Set paint to red
					g2d.setPaint(Color.RED);
					
					// Paint belly
					g2d.fillOval(190, 160, 220, 250);
					
				} else if (tick == 14) {
					
					// Set paint to maroon
					g2d.setPaint(maroon);
					
					// Paint the line in the middle
					g2d.fillRect(295, 160, 10, 250);
					
				} else if (tick == 15) {
					
					// Set paint to black
					g2d.setPaint(Color.BLACK);
					
					// Paint the belt
					g2d.fillRect(195, 320, 210, 30);
					
				} else if (tick == 16) {
					
					// Set paint to gold
					g2d.setPaint(new Color(255, 225, 0));
					
					// Paint the buckle
					g2d.fillRect(275, 315, 50, 40);
					
					// Set paint back to black
					g2d.setPaint(Color.BLACK);
					
					// Paint the part under the buckle
					g2d.fillRect(280, 320, 40, 30);
					
				} else if (tick == 17) {
					
					// Set paint to skin color
					g2d.setPaint(skin);
					
					// Paint the ears
					g2d.fillOval(190, 150, 50, 75);
					g2d.fillOval(360, 150, 50, 75);
					
				} else if (tick == 18) {
					
					// Set paint to skin color
					g2d.setPaint(skin);
					
					// Paint the head
					g2d.fillOval(215, 100, 170, 170);
					
				} else if (tick == 19) {
					
					// Set paint to black
					g2d.setPaint(Color.BLACK);
					
					// Paint the eyes
					g2d.fillOval(245, 160, 10, 10);
					g2d.fillOval(345, 160, 10, 10);
					
				} else if (tick == 20) {
					
					// Set paint to white
					g2d.setPaint(Color.WHITE);
					
					// Get x and y values for the beard
					int[] x1 = {215, 300, 385};
					int[] y1 = {225, 340, 225};
					
					// Paint the beard
					g2d.fillOval(215, 185, 170, 80);
					g2d.fillPolygon(x1, y1, 3);
					
				} else if (tick == 21) {
					
					// Set the paint to red
					g2d.setPaint(Color.RED);
					
					// Set the x and y values for the hat's base
					int[] x1 = {215, 300, 420, 360, 385};
					int[] y1 = {140, 10, 60, 50, 140};
					
					// Paint the base of the hat
					g2d.fillPolygon(x1, y1, 5);
					
				} else if (tick == 22) {
					
					// Set the paint to white
					g2d.setPaint(Color.WHITE);
					
					// Paint the puff in santa's hat
					g2d.fillRect(215, 130, 170, 20);
					g2d.fillOval(410, 50, 30, 30);
					
				} else if (tick == 24) {
					
					// Set button text
					button.setText("Click to start again");
					
					// Set isPlaying back to false
					isPlaying = false;
					
					System.out.println("Music finished, animation done, click to restart");
					
				}
				
				// Increment "tick"
				tick++;
			}
			
			// Set flag back to false
			flag = false;
		}
		
	}
	
}
