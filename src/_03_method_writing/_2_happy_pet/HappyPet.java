package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	static // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task1 = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Pet Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Give Water", "Groom", "Clean Up Poop", "Take a Walk" }, null);
			int task2 = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Pet Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Give Water", "Groom", "Clean Up Poop", "Take a Walk" }, null);
			int task3 = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Pet Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Give Water", "Groom", "Clean Up Poop", "Take a Walk" }, null);
			int task4= JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Pet Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Give Water", "Groom", "Clean Up Poop", "Take a Walk" }, null);
			int task5 = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Pet Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Give Water", "Groom", "Clean Up Poop", "Take a Walk" }, null);
			// 5. Use user input to call the appropriate method created in step 4.
			if(task1 == 1) {
				cuddle();
			}
			else if(task1 == 2) {
				feed();
			}
			else if(task1 == 3) {
				water();
			}
			else if(task1 == 4) {
				groom();
			}
			else if(task1 == 5) {
				poop();
			}
			else if(task1 == 6) {
				walk();
			}
			
			if(task2 == 1) {
				cuddle();
			}
			else if(task2 == 2) {
				feed();
			}
			else if(task2 == 3) {
				water();
			}
			else if(task2 == 4) {
				groom();
			}
			else if(task2 == 5) {
				poop();
			}
			else if(task2 == 6) {
				walk();
			}
			
			if(task3 == 1) {
				cuddle();
			}
			else if(task3 == 2) {
				feed();
			}
			else if(task3 == 3) {
				water();
			}
			else if(task3 == 4) {
				groom();
			}
			else if(task3 == 5) {
				poop();
			}
			else if(task3 == 6) {
				walk();
			}
			
			if(task4 == 1) {
				cuddle();
			}
			else if(task4 == 2) {
				feed();
			}
			else if(task4 == 3) {
				water();
			}
			else if(task4 == 4) {
				groom();
			}
			else if(task4 == 5) {
				poop();
			}
			else if(task4 == 6) {
				walk();
			}
			
			if(task5 == 1) {
				cuddle();
			}
			else if(task5 == 2) {
				feed();
			}
			else if(task5 == 3) {
				water();
			}
			else if(task5 == 4) {
				groom();
			}
			else if(task5 == 5) {
				poop();
			}
			else if(task5 == 6) {
				walk();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel >= 50) {
				JOptionPane.showMessageDialog(null, "You love your pet, and your pet is very happy!");
			}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void cuddle() {
		happinessLevel += 10;
		JOptionPane.showMessageDialog(null, "Your pet looked up at you contently with its cute eyes.");
	}
	
	static void feed() {
		happinessLevel += 15;
		JOptionPane.showMessageDialog(null, "Your pet quickly ate up everything.");
	}
	
	static void water() {
		happinessLevel += 13;
		JOptionPane.showMessageDialog(null, "Your pet quickly drank everything.");
	}
	
	static void groom() {
		happinessLevel += 11;
		JOptionPane.showMessageDialog(null, "Your pet happily pranced around the room.");
	}
	
	static void poop() {
		happinessLevel += 14;
		JOptionPane.showMessageDialog(null, "Your pet quietly watched you in the corner.");
	}
	
	static void walk() {
		happinessLevel += 5;
		JOptionPane.showMessageDialog(null, "Your pet kept stepping on your feet.");
	}
}