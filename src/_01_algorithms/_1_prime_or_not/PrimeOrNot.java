package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Enter a number");
		int a = Integer.parseInt(num);
		boolean stop = false;
		for(int i = 2; i <= a/2; i++) {
			if(a % i == 0) {
				stop = true;
			}
		
		}
		if(!stop) {
			System.out.println(num + " is a prime number.");
		}
		else {
			System.out.println(num + " is a composite number.");
		}
	}
	
}
