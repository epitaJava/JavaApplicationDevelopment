package demo;
import java.util.*;

public class ArrayExample {
	
	public void arrayEx() {
		Scanner sc = new Scanner(System.in);
		// METHOD 1  
		int[] intArr = new int[5]; // datatype[] variable = new datatype[size];

		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		System.out.println("Method 1:");
		for (int i = 0; i < 5; i++) {
			System.out.println(intArr[i]);
		}

		System.out.println("*****************");
		System.out.println("Method 2:");
		// METHOD-2 size depends on the user given values {}
		int[] intArr1 = { 1, 3, 5, 7 };
		for (int i = 0; i < 4; i++) {
			System.out.println(intArr1[i]);
		}
		
		// METHOD-3 size will be dynamic
		System.out.println("Method 3:");
		System.out.print("Enter the size:");
		int size = sc.nextInt();
		int[] intArrayUser = new int[size]; // Array of integers//double//float//char//string

		System.out.println("Enter the values:");
		for (int i = 0; i < size; i++) // Get user input interger array values
		{
			intArrayUser[i] = sc.nextInt();
		}
		System.out.println("The values entered:");

		for (int i = 0; i < size; i++) {
			System.out.println(intArrayUser[i]);
		}
		System.out.println("String Array:");
		// String Declaration METHOD - 1
		String[] arrStr = new String[10]; 
		arrStr[0] = "Hello Java!!";
		
		System.out.println(arrStr[0]);
		
	}
}
