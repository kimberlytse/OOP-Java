
//Kimberly Tse
import java.util.Scanner;

public class FindPI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will iteratively find the digits of PI using the Leibniz formula");
		System.out.println("How many iterations should we use? Please enter an integer");
		int userNum = input.nextInt();

		double startTime = System.currentTimeMillis();
		double numPI = findDigits(userNum);
		long finishTime = System.currentTimeMillis();

		double difTime = (finishTime - startTime) / 1000;

		System.out.println(numPI);
		System.out.println("After " + userNum + " iterations.");
		System.out.println("This operation took " + difTime + " seconds.");

		input.close();

	}

	public static double findDigits(int num) {

		double addNum = 0;

		for (int i = 0; i < num; i++) {
			double lebAlgorithm = ((Math.pow(-1, i)) / (2 * i + 1)) * 4;
			addNum = addNum + lebAlgorithm;
		}
		return addNum;
	}
}
