
public class TestGeometric {
	public static void main(String[] args) {
		GeometricObject1 myRectangle = new Rectangle(2, 3);
		GeometricObject1 myCircle = new Circle(4);

		myRectangle.setColor("black");
		myRectangle.setFilled(true);

		myCircle.setColor("blue");
		myCircle.setFilled(false);

		System.out.println("Rectangle\n" + myRectangle.toString());
		System.out.println("Area: " + ((Rectangle) myRectangle).getArea());
		System.out.println("Perimeter:" + ((Rectangle) myRectangle).getPerimeter());

		System.out.println();

		System.out.println("Circle\n" + myCircle.toString());
		System.out.println("Area: " + ((Circle) myCircle).getArea());
		System.out.println("Perimeter:" + ((Circle) myCircle).getPerimeter());

	}
}
