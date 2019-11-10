package _04_are_you_happy;

import javax.swing.JOptionPane;

public class RUHappy {
public static void main(String[] args) {
	String answer1 = JOptionPane.showInputDialog("Are You Happy? (Yes/No)");
	if(answer1.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Then keep doing whatever you're doing :)");
	}else if(answer1.equals("No")) {
		String answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
		if(answer2.contentEquals("Yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}else if(answer2.equals("No")) {
			JOptionPane.showMessageDialog(null, "Then keep doing whatever you're doing");
		}
	}
}
}
