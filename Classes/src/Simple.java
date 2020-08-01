// A simple java program for demonstrating the basics of this program
public class Simple {
	public static void main(String[] args) {
		System.out.println("Java is easy to learn."); // println
		System.out.print("This will print line but NOT terminate new line..."); // print
		System.out.println("See?");
		System.out.printf("Java was found in %d by %s", 1994, "James Gosling"); // printf and C program components

		String s = String.format("Formatted number is: %,.2f", 123.56489);
		System.out.println(s);

		int speed = 100; // integers, variables

		System.out.println(3 + 5);
		System.out.println("This" + " combines " + "strings");
		System.out.println("speed is " + speed);

		int i = 1;
		int j = 2;
		System.out.println("i + j is " + i + j);
		System.out.println(i + j + "i + j is ");

		// left associate, if number is on right, string on left, then the number will
		// be a string.

		byte smallValue = 1;

		int quantity = 100;
		long largerValue = 100000000000000l;
		float num = 3.5f;
		double time = 10.54;
		char c = 'c';
		String myName = "Class";

		boolean switch1 = true;
		double newVariable = quantity;
		// System.out.println(newVariable);

		int var2 = (int) time; // explicit type casting
		System.out.println(var2);
		
		
		
	}
}
