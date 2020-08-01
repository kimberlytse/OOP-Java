
public class RandomArray {
	public static void main(String[] args) {
		int[] myArray = new int[100];
		fillArray(myArray);
		double average = findAvg(myArray);

		findAboveAvg(myArray, average);
		findBelowAvg(myArray, average);
	}

	public static void findBelowAvg(int[] myArray, double average) {
		int counter = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] < average) {
				counter++;
			}
		}
		System.out.println("There are " + counter + " numbers below average");
	}

	public static void findAboveAvg(int[] myArray, double average) {
		int counter = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > average) {
				counter++;
			}
		}
		System.out.println("There are " + counter + " numbers above average");

	}

	public static void fillArray(int[] myArray) {
		System.out.println("The random array generated is: ");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 100);
			System.out.print(myArray[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.print("\n");
			}
		}
	}

	public static double findAvg(int[] myArray) {
		double sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			sum = sum + myArray[i];
		}
		System.out.println("The average of the values in the random array is " + (sum / myArray.length));
		return sum / myArray.length;
	}
}
