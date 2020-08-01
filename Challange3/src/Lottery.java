
//Kimberly Tse
//Lottery
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int userNum = 999; // User inputs number, the value 999 allows it to go in a loop until the user
							// inputs a two digit number
		char firstUserChar = 0; // Gets first character of user input
		char secondUserChar = 0; // Gets second character of user input
		int lotNum = (int) (100 * Math.random()); // Lottery number is generated using randomizer. Since it spans from
													// 0-99, I added 10 to the range 0-9 so that it can stay in the
													// double digit range.
		if (lotNum < 10) {
			lotNum += 10;
		}
		char firstLotChar = 0; // Gets first character of lottery number
		char secondLotChar = 0; // Gets second character of lottery number

		while (userNum == 999) { // As long as the user doesn't input a double digit number, the user will be
									// prompt the same question
			System.out.println("Enter your lottery pick: ");

			userNum = input.nextInt();

			String userNumChars = Integer.toString(userNum);
			firstUserChar = userNumChars.charAt(0);

			String lotNumChars = Integer.toString(lotNum);
			if (userNumChars.length() != lotNumChars.length()) {
				System.out.println("Please type in two digits.");
				userNum = 999;
			} else {
				firstLotChar = lotNumChars.charAt(0);
				secondUserChar = userNumChars.charAt(1);
				secondLotChar = lotNumChars.charAt(1);
			}

		}

		if (userNum == lotNum) { // User gets exact number right
			System.out.println("Exact match: you win $10,000");
		} else if ((firstUserChar == secondLotChar) && (secondUserChar == firstLotChar)) { // User gets the digits right
																							// but not in order
			System.out.println("Match all digits: you win $3,000");
		} else if ((firstUserChar == secondLotChar) || (secondUserChar == firstLotChar)
				|| (firstUserChar == firstLotChar) || (secondUserChar == secondLotChar)) { // User gets one digit right
			System.out.println("Match one digit: you win $1,000");
		} else { // User has completely different number
			System.out.println("Sorry, no match");
		}

		input.close();
	}
}
