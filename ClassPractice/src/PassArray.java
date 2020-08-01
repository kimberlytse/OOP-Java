/*
 *  This program demonstrates passing an array
 *  as an argument to a method.
*/
public class PassArray {
	public static void main(String[] args) {
		int[] numbers = { 5, 10, 15, 20, 25, 30, 35, 40 };
		showArray(numbers);
	}

	/*
	 * showArray method accepts an array as an argument and displays its contents
	 */
	public static void showArray(int[] array) {
		// Display the array elements.
		for (int i = 0; i < array.length; i++) {
			array[i]++;
			System.out.print(array[i] + " ");
		}
	}
}