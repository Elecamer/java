package Sounds_package;

import javax.sound.sampled.AudioInputStream;
import javax.swing.JFileChooser;

public class Sounds {
	public static void main (String[] args) {
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(null);
		System.out.println(fc.getSelectedFile());
		AudioInputStream audioInputStream = null;
		
	}
}


