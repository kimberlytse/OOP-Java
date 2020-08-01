
//Kimberly Tse
import java.util.Scanner;

public class FindSquareRoot {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("The program will find the square root of a number");
		System.out.println("Enter a positive integer");
		long userNum = input.nextLong();
		while(userNum < 0) {
			System.out.println("Enter a positive integer");
			userNum = input.nextLong();
		}
		sqrt(userNum);

		input.close();
	}

	public static void sqrt(long n) {
		long i;
		double lastGuess = 1;
		double nextGuess = 0;
		for (i = 1; i < n; i++) {
			nextGuess = (lastGuess + n / lastGuess) / 2;
			if (Math.abs(nextGuess - lastGuess) < 0.000001) {
				break;
			}
			lastGuess = nextGuess;
		}
		System.out.println("The square root of " + n + " is " + nextGuess);
		System.out.println("The program found the result in " + i + " interations");
	}
}
