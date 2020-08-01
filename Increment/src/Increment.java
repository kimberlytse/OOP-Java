
public class Increment {
	public static void main(String[] args) {
		int a, b;

		a = 1;
		b = 2 * ++a + 1;

		System.out.println(a + " " + b);

		b = 2 * (a++ + 1);

		System.out.println(a + " " + b);
	}
}
