
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "September 13th";
		String dadsBirthday = "May 28th";
		String myBirthday = "April 21nd";
		String brother = "April 21nd";
		String sister = "April 10th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birth = JOptionPane.showInputDialog("Who's birthday do you want to know");
		// 3. Print out what the user typed
		System.out.println(birth);
		// 4. if user asked for "mom"
			if(birth.equals("Mommy")) {
				System.out.println(momsBirthday);
			}else if(birth.contentEquals("Daddy")){
				System.out.println(dadsBirthday);
			}else if(birth.contentEquals("Ashi")) {
				System.out.println(myBirthday);
			}else if(birth.contentEquals("Devi")) {
				System.out.println(brother);
			}else if(birth.contentEquals("Sagey")) {
				System.out.println(sister);
			}else {
				JOptionPane.showMessageDialog(null, "Sorry, I don't know that person's birthday");
			}
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
