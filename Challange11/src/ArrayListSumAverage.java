import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSumAverage {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter an integer: ");
			myList.add(input.nextInt());
		}
		System.out.print("The numbers are ");
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println();

		System.out.println("Sum of the numbers in the list is " + getSum(myList));
		System.out.println("Average value of the numbers in the list is " + getAverage(myList));

		input.close();
	}

	public static double getAverage(ArrayList<Integer> myList) {
		double avg = ((double) getSum(myList)) / myList.size();
		return avg;
	}

	public static int getSum(ArrayList<Integer> myList) {
		int sum = 0;
		for (int i = 0; i < myList.size(); i++) {
			sum += myList.get(i);
		}
		return sum;
	}
}
