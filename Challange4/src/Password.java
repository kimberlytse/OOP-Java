
//Kimberly Tse
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a four character password: ");
		String savePass = input.nextLine();

		while (savePass.length() != 4) { // if the password has more or less than 4 characters, user will be asked to
											// retype password
			System.out.println("Please enter a four character password.");
			System.out.println("Enter a four character password: ");
			savePass = input.nextLine();
		}

		System.out.println("Enter your password again: ");
		String passWord = input.nextLine();

		while (passWord.length() != 4) { // user will need to retype the password if it isn't 4 characters
			System.out.println("Please enter a four character password.");
			System.out.println("Enter your password again:  ");
			passWord = input.nextLine();
		}

		if (savePass.compareTo(passWord) == 0) {
			System.out.println("Passwords match");
		} else {
			System.out.print(
					"The following characters doesn't match the password in correspondance of order and character: ");
			for (int i = 0; i < 4; i++) { // prints the characters that doesn't match with original password
				if (savePass.charAt(i) != passWord.charAt(i)) {
					System.out.print(passWord.charAt(i));
				}
			}

		}

		input.close();
	}

}
