package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int sum;
		for(int i = 0; i < 10; i++) {
			sum = num1 + num2;
			System.out.println(sum);
			if(i % 2 == 0) {
				num2 = sum;
			}
			else {
				num1 = sum;
			}
		}
		
	}
}
