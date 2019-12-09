package _16_obedient_robot;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class shapeRobot {
public static void main(String[] args) {
String shape =	JOptionPane.showInputDialog("What shape do you want? Options are Square, Circle, and Triangle");
String color =	JOptionPane.showInputDialog("Which color would you like? Options are Red, Green, and Blue");
if(shape.equals("Square")) {
	drawSquare();
}else if(shape.equals("Triangle")) {
	drawTriangle();
}else if(shape.equals("Circle")) {
	drawCircle();
	if(color.equals("Red")) {
		drawSquare();
	}else if(color.equals("Green")) {
		drawTriangle();
	}else if(color.equals("Blue")) {
		drawCircle();
}}
}	
	public static void drawSquare() {
		Robot zane=new Robot("batman");
		zane.setSpeed(100);
		zane.penDown();
		for(int i=1;i<5;i++) {
			zane.turn(90);
			zane.move(100);}
	}
	public static void drawTriangle() {
		Robot zane=new Robot("sparkle");
		zane.setSpeed(100);
		zane.penDown();
		for(int i=1;i<4;i++) {
			zane.turn(120);
			zane.move(100);}
	}
	public static void drawCircle() {
		Robot zane=new Robot("mini");
		zane.setSpeed(250);
		zane.penDown();
		for(int i=1;i<361;i++) {
			zane.turn(1);
			zane.move(1);}
}}
