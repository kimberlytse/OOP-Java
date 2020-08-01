
public class Circle extends GeometricObject1 {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}

	public double getDiameter() {
		return radius * 2;
	}
}
