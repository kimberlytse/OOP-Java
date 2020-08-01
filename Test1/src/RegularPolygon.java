
//Kimberly Tse
import java.util.Scanner;
import java.text.DecimalFormat;

public class RegularPolygon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		int numSides;
		double lengthSides;

		double perimeter;
		double area;

		final double PI = Math.PI;

		System.out.println("The program will calculate the perimeter and area of a regular polygon");
		System.out.println("Enter the number of sides:");
		numSides = input.nextInt();
		input.nextLine();

		System.out.println("Enter the length of the side:");
		lengthSides = input.nextDouble();
		input.nextLine();

		perimeter = numSides * lengthSides;
		area = (numSides * lengthSides * lengthSides) / (4 * Math.tan(PI / numSides));

		switch (numSides) {
		case 1:
		case 2:
			System.out.println("Not a polygon.");
			break;
		case 3:
			System.out.println("It is a triangle!");
			break;
		case 4:
			System.out.println("It is a square!");
			break;
		case 5:
			System.out.println("It is a pentagon!");
			break;
		case 6:
			System.out.println("It is a hexagon!");
			break;
		case 7:
			System.out.println("It is a heptagon!");
			break;
		case 8:
			System.out.println("It is an ocatagon!");
			break;
		default:
			System.out.println("It is a regular polygon!");
			break;

		}
		if (numSides >= 3) {
			System.out.println("This regular polygon has " + numSides + " sides of length " + lengthSides
					+ " and it has a perimeter of " + df.format(perimeter) + " and an area of " + df.format(area));
		}

		input.close();

	}
}
