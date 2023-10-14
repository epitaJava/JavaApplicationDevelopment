package demo;

import java.io.*;
import java.util.Scanner;

public class Files {
	public static void main(String[] args) throws IOException {

		File fileObj1 = new File("C:\\Users\\earuvai\\Downloads\\FileFolder\\NewFile.txt");
		try {
			if (fileObj1.createNewFile()) {
				System.out.println("NewFile Created!");
			} else {
				System.out.println("Already exists");
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();

		}
		// Method - 1 Write file using FileWriter

		FileWriter fWrite = new FileWriter("C:\\Users\\earuvai\\Downloads\\FileFolder\\NewFile1.txt");
		fWrite.write("Java has a content now!!" + "\n");
		fWrite.append("Appending as a second line!" + "\n");
		fWrite.write("Java has a content now as a 3rd line!!");
		fWrite.close();

		// Method - 2 Write File using BufferedWriter write until user wants to end

		Scanner sc = new Scanner(System.in);
		FileWriter file = new FileWriter("C:\\Users\\earuvai\\Downloads\\FileFolder\\NewFile.txt");
		String data = "";
		BufferedWriter bf = null;
		try {
			System.out.println("Enter the content:");
			bf = new BufferedWriter(file);
			while (!data.contentEquals("/")) {
				data = sc.nextLine();
				bf.write(data, 0, data.length());
				bf.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		bf.close();
		sc.close();

		/*
		 * BufferedWriter using Offset - Method 3
		 */

		/*
		 * Scanner sc1 = new Scanner(System.in); FileWriter file1 = new
		 * FileWriter("C:\\Users\\earuvai\\Downloads\\FileFolder\\NewFile.txt"); String
		 * data1 = ""; BufferedWriter bf1 = null; try {
		 * System.out.println("Enter the content:"); data1 = sc1.nextLine();
		 * System.out.println("Enter the offset:"); int offset = sc1.nextInt(); bf1 =
		 * new BufferedWriter(file1); bf1.write(data1, offset, data1.length() - offset);
		 * // bf.write(data, 0, data.length()); } catch (IOException e) {
		 * e.printStackTrace(); } bf1.close(); sc1.close();
		 */
		/*
		 * 
		 * Read the content of the file
		 * 
		 */
		char[] array = new char[100];
		try {
			// Creates a reader using the FileReader
			FileReader readFile = new FileReader("C:\\Users\\earuvai\\Downloads\\FileFolder\\NewFile.txt");

			// Reads characters
			readFile.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			readFile.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

		/*
		 * 
		 * To delete a file
		 * 
		 */

		File filedelete = new File("C:\\Users\\earuvai\\Downloads\\FileFolder\\NewFile1.txt");

		// deletes the file
		boolean value = filedelete.delete();
		if (value) {
			System.out.println("The File is deleted.");
		} else {
			System.out.println("The File is not deleted.");
		}

		// check if it an read/write/get path

		/*
		 * System.out.println(fileObj1.canRead());
		 * System.out.println(fileObj1.canWrite());
		 * System.out.println(fileObj1.getAbsolutePath());
		 * System.out.println(fileObj1.length());
		 */

	}
}
