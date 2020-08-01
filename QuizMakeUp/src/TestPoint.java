/*
 * Kimberly Tse
 * Quiz Make-up 4/24/2019
 * 
 */

import java.util.Scanner;

public class TestPoint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ThePoint point1 = new ThePoint();
		ThePoint point2 = new ThePoint();

		System.out.println("Program will calculate the distance between two points");
		System.out.println("Enter x value for point 1");
		point1.setX(input.nextDouble());
		System.out.println("Enter y value for point 1");
		point1.setY(input.nextDouble());

		System.out.println("Enter x value for point 2");
		point2.setX(input.nextDouble());
		System.out.println("Enter y value for point 2");
		point2.setY(input.nextDouble());

		System.out.println("The points are (" + point1.getX() + ", " + point1.getY() + ") and (" + point2.getX() + ", "
				+ point2.getY() + ")");
		System.out.println("The distance between these points is " + ThePoint
				.getDistance(Math.abs((point2.getX() - point1.getX())), Math.abs((point2.getY() - point1.getY()))));

		input.close();

	}
}
