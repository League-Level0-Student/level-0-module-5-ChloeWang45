package _04_practice._1_skill_practice;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SkillPractice {
	
		public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have

			String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
			int cents = Integer.parseInt(dimes);

		// Tell them how many cents they have (hint multiply by 10)

			JOptionPane.showMessageDialog(null, "You have " + 10 * cents + " cents.");


		// Ask the user how tall they are (inches)

			String height = JOptionPane.showInputDialog("How tall are you in inches?");
			int x = Integer.parseInt(height);

		// If they are shorter than 36 inches, tell them to eat their Wheaties

			if(x < 36) {
				JOptionPane.showMessageDialog(null, "Eat you Wheaties!");
			}


		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console

			int a = 0;
			for(int i = 0; i < 10; i++) {
				System.out.println(a + 3);
				a = a + 3;
			}
			
		}

		void skill3() { // Get a random number that is less than 20 and print it to the console

			Random ran = new Random();
			int b = ran.nextInt(20);
			System.out.println(b);

		// Get another random number that is less than 10 and print it to the console

			int c = ran.nextInt(10);
			System.out.println(c);

		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
			
			int d = b - c;
			JOptionPane.showMessageDialog(null, "The difference between the numbers is " + d);

		}

		void skill4() { // In a pop-up, ask the user for the city they live in

			String city = JOptionPane.showInputDialog("What city do you live in?");

		// If they answered "San Diego", tell them they live in America's Finest City

			if(city.equals("San Diego")) {
				JOptionPane.showMessageDialog(null, "You live in America's Finest City.");
			}

		// Otherwise, tell them to move to San Diego

			else {
				JOptionPane.showMessageDialog(null, "You should move to San Diego.");
			}

		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."

			int cars = 1;
			int wheels = cars * 4;
			if(cars == 0) {
				JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
			}

		// If there is 1 car, use a pop-up to display the make/model of the car
			
			else if(cars == 1) {
				  ImageIcon car = new ImageIcon("car.webp");
				  JOptionPane.showMessageDialog(null, car);
				  
			}

		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
			
			else if(cars >= 2) {
				JOptionPane.showMessageDialog(null, "There is a total of " + wheels + " wheels.");
			}
		
		}

		void skill5() { // In a pop-up, ask the user for the name of their school

			String school = JOptionPane.showInputDialog("What school you go to?");

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.
			
			JOptionPane.showMessageDialog(null, school + " is a fantastic school!");

		}
		
}
