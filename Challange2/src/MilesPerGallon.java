
//Kimberly Tse
// Miles per gallon

import java.util.Scanner;

public class MilesPerGallon {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number for miles driven: ");
		int milesDriven = input.nextInt();
		input.nextLine();

		System.out.print("Enter the number of gallons used: ");
		int gasUsed = input.nextInt();
		input.nextLine();

		double milesPerGallon = milesDriven / gasUsed;

		System.out.println("Your MPG is: " + milesPerGallon);

		input.close();
	}
}
