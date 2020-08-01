import java.util.Arrays;
import java.util.Scanner;

public class Search2DArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many rows?");
		int rows = input.nextInt();
		System.out.println("How many columns?");
		int columns = input.nextInt();

		int[][] twoDimArray = new int[rows][columns];
		for (int j = 0; j < twoDimArray.length; j++) {
			for (int k = 0; k < twoDimArray[j].length; k++) {
				twoDimArray[j][k] = (int) (Math.random() * 100);
			}
		}
		System.out.println("Array elements are: " + Arrays.deepToString(twoDimArray));

		System.out.println("What number would you like to look for?");
		int userNum = input.nextInt();

		System.out.println("Method will search for " + userNum);
		System.out.println("The index of the value " + userNum + " is " + searchArray(twoDimArray, userNum));

		input.close();
	}

	public static String searchArray(int[][] twoDimArray, int userNum) {
		String coordinates = null;

		for (int j = 0; j < twoDimArray.length; j++) {
			for (int k = 0; k < twoDimArray[j].length; k++) {
				if (twoDimArray[j][k] == userNum) {
					coordinates = j + " " + k;
				}
			}
		}
		if (coordinates == null) {
			coordinates = "not available";
		}

		return coordinates;
	}
}
