
//Kimberly Tse
//Leap Year

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a year that would be determined if it a leap or not");

		int year = input.nextInt();
		input.hasNextLine();

		boolean divByFour = year % 4 == 0;
		boolean divByHundred = year % 100 == 0;
		boolean divByFourHundred = year % 400 == 0;

		if ((divByFour && !divByHundred) || divByFourHundred) {
			System.out.println("Year " + year + " is a leap year");

		} else {
			System.out.println("Year " + year + " is not a leap year");
		}

		input.close();

	}
}
