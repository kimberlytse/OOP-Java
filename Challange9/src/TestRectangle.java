
import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Rectangle r = new Rectangle();

		System.out.println("Enter the number of rectangles to be created");
		Rectangle.setNumRectangles(input.nextInt());

		double[] rectangleArea = new double[Rectangle.getNumRectangles()];
		double[] rectanglePerimeter = new double[Rectangle.getNumRectangles()];

		for (int i = 0; i < Rectangle.getNumRectangles(); i++) {
			System.out.println("Enter rectangle " + (i + 1) + " length");
			r.setLength(input.nextDouble());
			System.out.println("Enter rectangle " + (i + 1) + " length");
			r.setWidth(input.nextDouble());

			rectangleArea[i] = r.getArea();
			rectanglePerimeter[i] = r.getPerimeter();
		}

		System.out.println("Here are the rectangles that you created");
		for (int i = 0; i < Rectangle.getNumRectangles(); i++) {
			System.out.println("Rectangle " + (i + 1) + ": area: " + rectangleArea[i] + " : perimeter: "
					+ rectanglePerimeter[i]);

		}

		input.close();
	}
}
