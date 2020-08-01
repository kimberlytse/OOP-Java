import java.text.DecimalFormat;

public class MathOperations {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.000");
		
		final double PI = 3.14; // makes the variable a constant
		double radius = 10.0;
		
		System.out.println(df.format(radius * radius * PI));
		System.out.println(df.format(radius * radius * Math.PI));

		/*
		int a = 10;
		double b = 3;
		
		if (b == 0) {
			System.out.println("Please do not use 0 for b");
		} else {
			System.out.println(df.format(a / b));
		}
		
		a = 20;
		*/
		
		String s = "Hello World";
		System.out.println(s.length());
		
		System.out.println(s.charAt(6));
		System.out.println(s.indexOf('l'));
		System.out.println(s.toUpperCase());
	}
}
