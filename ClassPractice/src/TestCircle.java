
public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle(10, "white", true);
		System.out.println(c1.getColor() + c1.getRadius());
		System.out.println(Circle.getNoCircles());
		Circle c2 = new Circle(20, "red", true);
		System.out.println(c2.getColor() + c2.getRadius());
		Circle c3 = new Circle(30, "grey", true);
		System.out.println(c3.getColor() + c3.getRadius());
		Circle c4 = new Circle();
		System.out.println(Circle.getNoCircles());
	}
}
