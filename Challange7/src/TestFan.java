
//Kimberly Tse
//updated

import java.util.Scanner;

public class TestFan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Fan myFan = new Fan();

		// myFan.toString(); testing to make sure the default values work

		System.out.print("Enter the fan speed: ");
		int speed = input.nextInt();
		input.nextLine();

		System.out.print("Enter the fan status (Enter 'true' or 'false'): ");
		boolean status = input.nextBoolean();
		input.nextLine();

		System.out.print("Enter the fan radius: ");
		double radius = input.nextDouble();
		input.nextLine();

		System.out.print("Enter the fan color: ");
		String color = input.nextLine();

		System.out.println("");
		myFan.setFan(speed, status, radius, color);
		System.out.println(myFan.toString());

		input.close();

	}
}
