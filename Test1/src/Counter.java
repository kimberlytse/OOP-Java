import java.util.Scanner;
import java.util.Arrays;

public class Counter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the number of elements to be randomly created");
		int elements = input.nextInt();
		int[] randomArray = new int[elements];

		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 10);
		}
		
		System.out.println(Arrays.toString(randomArray));
		findOccurences(randomArray);
		findNumber(randomArray);

		input.close();
	}

	public static void findNumber(int[] randomArray) {
		Scanner input = new Scanner(System.in);
		int occurences = 0;
		System.out.println("Which number would you like to search?");
		int searchNum = input.nextInt();
		for (int i = 0; i < randomArray.length; i++) {
			if (randomArray[i] == searchNum) {
				occurences++;
			}
		}

		System.out.println("There are " + occurences + " occurences of " + searchNum + " in the list"); // occurences
		input.close();
	}

	public static void findOccurences(int[] randomArray) {
		int consecutive = 0;
		for (int i = 0; i < randomArray.length - 1; i++) {
			if (randomArray[i] == randomArray[i + 1]) {
				consecutive++;
			}
		}
		System.out.println("There are " + consecutive + " numbers that are repeated"); // consecutive numbers
	}
}
