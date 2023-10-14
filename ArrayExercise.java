package demo;

public class ArrayExercise {

	public static void main(String[] args) {

		int[] array1 = { 2, 3, 4, 5, 6 };
		int[] array2 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.print(array1[i]+" ");
				}
			}
		}

	}

}
