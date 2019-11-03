//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		JOptionPane.showMessageDialog(null, "Welcome to THE PRICE IS RIGHT!");
		for(int i = 0; i<10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String response = JOptionPane.showInputDialog("Please guess a number between 1 and 100.");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
int better = (Integer.parseInt(response));
			// 5. if the guess is correct
				// 6. Win
if (better == random) {
	String name = JOptionPane.showInputDialog("Congrats! You have won the game along with $10,000! What is your name, young fellow?");
	JOptionPane.showMessageDialog(null, "Let's all give a huge round of applause for " + name );

				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
System.exit(0);}
			// 7. if the guess is high
else if (better > random){
	JOptionPane.showMessageDialog(null,"Your guess is too high. $30 will be charged to your credit card!");
}
	
	// 8. Tell them it's too high

			// 9. if the guess is low
				// 10. Tell them it's too low
else if (better < random){
	JOptionPane.showMessageDialog(null, "Your guess is too low. $30 will be charged to your credit card!");}
}
	
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "You lose! Please come back next time!...Please don't, we dont want you here");
	}

}


