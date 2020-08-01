import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {
	public static void main(String[] args) {
		int[] myArray = new int[5];
		System.out.println("Enter a series of 5 numbers.");
		fillArray(myArray);
		shuffleArray(myArray);
	}

	public static void shuffleArray(int[] myArray) {
		Random rgen = new Random();
		for (int i = 0; i < myArray.length; i++) {
			int randPos = rgen.nextInt(myArray.length);
			int temp = myArray[i];
			myArray[i] = myArray[randPos];
			myArray[randPos] = temp;
		}
		System.out.println("Here are the randomly shuffled numbers: " + Arrays.toString(myArray));
	}

	public static void fillArray(int[] myArray) {
		Scanner num = new Scanner(System.in);
		for (int i = 0; i < myArray.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			myArray[i] = num.nextInt();
		}
		System.out.println("Here are the numbers that you entered: " + Arrays.toString(myArray));
		num.close();
	}
}
