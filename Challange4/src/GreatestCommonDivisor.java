
//Kimberly Tse
import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first integer: ");
		int firstInt = input.nextInt();
		input.nextLine();

		System.out.println("Enter second integer: ");
		int secInt = input.nextInt();
		input.nextLine();

		System.out.println("Enter third integer: ");
		int thirdInt = input.nextInt();
		input.nextLine();

		int minPart1 = Math.min(firstInt, secInt); // gets minimum
		int minFinal = Math.min(minPart1, thirdInt);

		for (int i = minFinal; i >= 1; i--) {
			if ((firstInt % i == 0) && (secInt % i == 0) && (thirdInt % i == 0)) { // the i number goes down until it
																					// reaches a number that is
																					// divisible for all three integers
				int greatestComDiv = i;
				System.out.println("The greatest common divisor for " + firstInt + ", " + secInt + ", and " + thirdInt
						+ " is " + greatestComDiv);
				break;
			}
		}

		input.close();
	}
}
