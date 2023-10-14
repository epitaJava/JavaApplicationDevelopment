package demo;

import java.util.*;

public class ConditionalStatements {

	Scanner sc = new Scanner(System.in);
	
	private int n; // Use of access modifier

	public void fizzBuzz() {
		System.out.print("Enter a number: ");
		n = sc.nextInt();  // Get input from user
		
		// Check if FizzBuzz
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.print("FizzBuzz" + " ");
			} 
			
			else if (i % 3 == 0) {
				System.out.print("Fizz!" + " ");
			} 
			
			else if (i % 7 == 0) {
				System.out.print("Buzz!"+ " ");
			}
			
			else {
				System.out.print(i+ " ");
			}
		}
	}
	
	
	
	
	
	
}
