
public class Overloading {
	public static void main(String[] args) {
		add(10, 20);
	}
	public static double add(int a, double b) {
		System.out.println("Int Double");
		return a + b;
	}
	public static double add(double a, int b) {
		System.out.println("Double Int");
		return a + b;
	}
}
