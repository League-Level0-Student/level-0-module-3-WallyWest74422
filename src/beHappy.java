import java.net.URI;

import javax.swing.JOptionPane;

public class beHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you Happy?");
		if (happy == "Yes") {
			playVideo("https://www.youtube.com/watch?v=ZbZSe6N_BXs");
		}
	
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}