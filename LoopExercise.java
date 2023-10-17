package demo;
import java.util.*;
public class LoopExercise {
	Scanner sc = new Scanner(System.in);
	public void reverse() {
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int rev= 0 , temp = num, rem = 0;
		
		// Using while loop
		while(temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		
		//Using for loop
		for(; temp > 0; temp/=10) {
			rem = temp % 10;
			rev = rev * 10 + rem;
		}
		System.out.println("Reversed number : " + rev);
		
}
}
