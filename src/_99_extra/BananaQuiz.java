//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String bananas = JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
		if(bananas.equals("No")) {
			JOptionPane.showMessageDialog(null, "You are crazy!");
		}if(bananas.equals("Yes")) {
	String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	JOptionPane.showMessageDialog(null,hobby+ " is much better with bananas!");
		}else {
			JOptionPane.showMessageDialog(null, "You r banananas!!!");
		}
		
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}
