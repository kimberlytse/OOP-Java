import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers in this integer array? ");
		final int elements = input.nextInt();
		int[] myArray = new int[elements];

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 10);

		}
		System.out.println("Original array: " + Arrays.toString(myArray));
		reverseMethod(myArray);
		reverseMethod2(myArray);

		input.close();
	}

	public static void reverseMethod2(int[] myArray) { // use original array
		System.out.print("Reverse array using original array: ");
		int start = 0;
		int end = myArray.length - 1;
		int temp;
		for (int i = 0; i < myArray.length / 2; i++) {
			temp = myArray[start];
			myArray[i] = myArray[end];
			myArray[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(myArray));

	}

	public static void reverseMethod(int[] myArray) { // use copy of array
		System.out.print("Reverse array using a copy array: ");
		int start = 0;
		int[] myArray2 = new int[myArray.length];
		for (int i = myArray.length - 1; i >= 0; i--) {
			myArray2[start] = myArray[i];
			start++;
		}
		System.out.println(Arrays.toString(myArray2));
	}
}
