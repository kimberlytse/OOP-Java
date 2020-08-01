/**
 * This program demonstrates passing individual array elements as arguments to a
 * method.
 */

public class PassElements {
	public static void main(String[] args) {
		int[] numbers = { 5, 10, 15, 20, 25, 30, 35, 40 };

		changeValue(numbers[0]);

		for (int i = 0; i < numbers.length; i++)
			showValue(numbers[i]);
	}

	public static void changeValue(int i) {
		i++;
		System.out.println(i); // only passes an array, not actually copy it
	}

	public static void showValue(int n) {
		System.out.print(n + " ");
	}
}