
public class testMethods {
	static int number = 10;  //static field - visible to all methods

	public static void main(String[] args) {
		int number = 100;  //local variable - only accessible in main
		
		System.out.println(number);  //prints the local value - field is accessible but hidden (shadowing)
		method1();
		method2();
		
	}
	
	public static void method1() {
		int number = 1000;   //local variable - only accessible in method1
		System.out.println(number);   //prints the local value - field is accessible but hidden
	}
	
	public static void method2() {
		System.out.println(number);  //prints the field as there is no local variable
	}
}
