
//Kimberly Tse

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int guessNum = (int) Math.floor(Math.random() * 101);

		int userNum;
		int numGuesses = 0;

		System.out.println("Guess a number between 0 and 100 ");

		do {

			System.out.print("Enter a number: ");
			userNum = input.nextInt();
			if (userNum > guessNum) {
				System.out.println("Your guess is too high");
				numGuesses += 1;
			} else if (userNum < guessNum) {
				System.out.println("Your guess is too low");
				numGuesses += 1;
			} else {
				numGuesses += 1;
				break;
			}

		} while (userNum != guessNum);

		System.out.println("Yes, the number is " + guessNum + "\n");
		System.out.println("You guessed the correct number in " + numGuesses + " guesses");

		input.close();
	}
}
