import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {

		int[] userNum = new int[5];
		int[] lottery = new int[5];
		int count = 0;

		getValues(userNum);
		getLotValues(lottery);
		printLottery(lottery);

		System.out.println("You matched: " + compareNumbers(userNum, lottery, count) + " numbers");
		if (compareNumbers(userNum, lottery, count) != 0) {
			System.out.print("The matching numbers are: ");
			matchingNums(userNum, lottery, count);
			if(compareNumbers(userNum, lottery, count) == 5) {
				System.out.print("\nYou won the lottery!");
			}
		}

	}

	public static void matchingNums(int[] userNum, int[] lottery, int count) {
		for (int i = 0; i < userNum.length; i++) {
			if (userNum[i] == lottery[i]) {
				System.out.print(userNum[i] + " ");
			}
		}
	}

	public static int compareNumbers(int[] userNum, int[] lottery, int count) {
		for (int i = 0; i < userNum.length; i++) {
			if (userNum[i] == lottery[i]) {
				count++;
			}
		}
		return count;
	}

	public static void getLotValues(int[] lottery) {
		for (int i = 0; i < lottery.length; i++) {
			lottery[i] = (int) (10 * Math.random());
		}

	}

	public static void printLottery(int[] lottery) {
		System.out.println("\nThe lottery numbers are:");
		for (int i = 0; i < lottery.length; i++) {
			System.out.print(lottery[i] + " ");
		}
		System.out.println("");
	}

	public static void getValues(int[] userNum) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a series of 5 numbers");
		for (int i = 0; i < userNum.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			userNum[i] = input.nextInt();

		}
		input.close();
	}

}
