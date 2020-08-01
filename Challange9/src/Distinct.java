import java.util.Scanner;

public class Distinct {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		getUserNum(numbers);
		getDistinct(numbers);
	}

	public static void getDistinct(int[] numbers) {
		int i;
		int j;
		System.out.println("\nDistinct numbers are:");
		for (i = 0; i < numbers.length; i++) {
			for (j = 0; j < i; j++)
				if (numbers[i] == numbers[j])
					break;
			if (i == j)
				System.out.print(numbers[i] + " ");

		}
	}

	public static void getUserNum(int[] numbers) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter integer " + (i + 1) + ": ");
			numbers[i] = input.nextInt();
		}
		input.close();
	}
}
