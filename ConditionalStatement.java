package demo;

import java.util.Scanner;

public class ConditionalStatement {
	
	Scanner sc = new Scanner(System.in);
	private int age;
	public void voteCheck() {
		age = sc.nextInt();
		if(age > 18) {
			System.out.println("ELIGIBLE");
		}
		else {
			System.out.println("NOT ELIGLBLE");
		}
	}
}
