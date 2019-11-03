//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot

		Robot zane = new Robot("batman");
		zane.miniaturize();
		zane.sparkle();
		zane.setSpeed(200);
		zane.penDown();
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i<1;) {
		String color = JOptionPane.showInputDialog("What color would you like me to draw? Green Blue or Purple");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equals("Blue")) {
	zane.setPenColor(0, 0, 255);
} else if(color.equals("Green")) {
	zane.setPenColor(0, 255, 0);
} else if(color.contentEquals("Purple")) {
	zane.setPenColor(255, 0, 255);
} else {
	zane.setRandomPenColor();
}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		zane.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)

zane.move(100);
zane.turn(120);
zane.move(100);
zane.turn(120);
zane.move(100);
zane.turn(120);
	}}}

