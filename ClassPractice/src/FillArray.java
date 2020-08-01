import java.util.*;

public class FillArray {
	public static void main(String[] args) {
		double[][] scores = new double[3][4]; // 3 rows, 4 columns
		Scanner input = new Scanner(System.in);
		for (int row = 0; row < 3; row++) { // goes thru 3 rows
			for (int col = 0; col < scores[row].length; col++) { // for each row, goes through each column (across, not
																	// vertical)
				System.out.print("Enter a score: ");
				scores[row][col] = input.nextDouble();
			}
		}

		System.out.println(Arrays.deepToString(scores)); // deep to String for multi-dimensional arrays
		input.close();
	}
}