
//Kimberly Tse
//Sum digits

import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 1 and 1000: ");
		int num = input.nextInt();
		input.nextLine();

		int firstDigit = (num - num % 100) / 100;
		int midDigit = (num - firstDigit * 100) / 10;
		int lastDigit = (num - firstDigit * 100 - midDigit * 10);

		int sum = firstDigit + midDigit + lastDigit;

		System.out.println("The sum of all digits in " + num + " is " + sum);

		input.close();
	}
}
