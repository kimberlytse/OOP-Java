
public class Rectangle {
	private static int numRectangles;
	private double length;
	private double width;

	public Rectangle() {

	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	public static int getNumRectangles() {
		return numRectangles;
	}

	public static void setNumRectangles(int numRectangles) {
		Rectangle.numRectangles = numRectangles;
	}

}
