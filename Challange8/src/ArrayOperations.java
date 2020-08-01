
import java.util.Scanner;

public class ArrayOperations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int numElement = input.nextInt();
		int[] myArray = new int[numElement];

		System.out.println("Enter a series of " + numElement + " numbers.");
		setArray(myArray);

		System.out.println("Highest element is: " + getHighest(myArray));
		System.out.println("Lowest element is: " + getLowest(myArray));
		System.out.println("The sum is: " + getSum(myArray));
		System.out.println("Average is: " + getAvg(myArray));

		input.close();
	}

	public static void setArray(int[] myArray) {
		Scanner num = new Scanner(System.in);
		for (int i = 0; i < myArray.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			myArray[i] = num.nextInt();
		}
		num.close();
	}

	public static int getHighest(int[] myArray) {
		int maxNum = myArray[0];
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > maxNum) {
				maxNum = myArray[i];
			}
		}
		return maxNum;
	}

	public static int getLowest(int[] myArray) {
		int minNum = myArray[0];
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] < minNum) {
				minNum = myArray[i];
			}
		}
		return minNum;
	}

	public static int getSum(int[] myArray) {
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}
		return sum;
	}

	public static double getAvg(int[] myArray) { // use getSum method here
		return getSum(myArray) / myArray.length;
	}
}