
public class Circle {
	private int radius;
	private String color;
	private boolean filled;
	private static int noCircles = 0; //not an object, counter

	public Circle() {
		noCircles++;
	}

	public Circle(int radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
		noCircles++;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		// OR when you use String c
		// color = c;

	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getCircumference() {
		return radius * 2 * Math.PI;
	}

	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
	}

	public static int getNoCircles() {
		return noCircles;
	}
	
	

}
