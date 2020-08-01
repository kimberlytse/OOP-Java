
//Kimberly Tse
//updated

import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		Scanner input = new Scanner(System.in);

		System.out.println("The program will calculate the perimeter and area of a rectangle");
		System.out.println("Enter the length of the rectangle");
		r.setLength(input.nextDouble());

		System.out.println("Enter the width of the rectangle");
		r.setWidth(input.nextDouble());

		System.out.println("The area of the rectangle is " + r.getArea());
		System.out.println("The perimeter of the rectangle is " + r.getPerimeter());

		input.close();
	}
}
