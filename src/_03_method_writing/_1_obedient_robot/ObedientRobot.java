package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("What shape do you want?");
		if(a.equals("square")) {
			drawSquare();
		}
		else if(a.equals("triangle")) {
			drawTriangle();
		}
		else if(a.equals("circle")) {
			drawCircle();
		}
		
		
	}
	
	static void drawSquare() {
		
		Robot rob = new Robot();
		rob.penDown();
		String color = JOptionPane.showInputDialog("Do you want your shape to be red, blue, or black?");
		if(color.equals("red")) {
			rob.setPenColor(Color.red);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(Color.blue);
		}
		else if(color.equals("black")){
			rob.setPenColor(Color.black);
		}
		for(int i = 0; i < 4; i++) {
			rob.move(200);
			rob.turn(90);
		}
		
	}
	
	static void drawTriangle() {
		
		Robot rob = new Robot();
		rob.penDown();
		String color = JOptionPane.showInputDialog("Do you want your shape to be red, blue, or black?");
		if(color.equals("red")) {
			rob.setPenColor(Color.red);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(Color.blue);
		}
		else if(color.equals("black")){
			rob.setPenColor(Color.black);
		}
		for(int i = 0; i < 3; i++) {
			rob.move(200);
			rob.turn(120);
		}
	}

	static void drawCircle() {
		
		Robot rob = new Robot();
		rob.penDown();
		String color = JOptionPane.showInputDialog("Do you want your shape to be red, blue, or black?");
		if(color.equals("red")) {
			rob.setPenColor(Color.red);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(Color.blue);
		}
		else if(color.equals("black")){
			rob.setPenColor(Color.black);
		}
		for(int i = 0; i < 360; i++)
			rob.move(1);
			rob.turn(1);
	}
}
