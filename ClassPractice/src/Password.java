import java.util.Scanner;

public class Password {
	public static void main(String[] args) {

		/*
		 * char cpuLetter = 'c';
		 * 
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Enter a one letter character: "); String userLetter =
		 * input.nextLine();
		 * 
		 * char userLetterChar = userLetter.charAt(0);
		 * 
		 * if (userLetter.length() != 1) {
		 * System.out.println("Please enter a one letter character."); } else { if
		 * (cpuLetter == userLetterChar) { System.out.println("Correct password."); }
		 * else { System.out.println("Incorrect password."); } }
		 * 
		 * input.close();
		 */
		Scanner input = new Scanner(System.in);
		String password = "password";
		
		System.out.println("Please enter password: ");
		String user = input.next();
		
		int i = password.length();
		int j;
		
		if(user.length() != password.length()) {
			System.out.println("incorrect length");
		} else {
			for(j = 0; j < i; j++) {
				if(user.charAt(j) != password.charAt(j)) {
					System.out.println("Incorrect");
				} else {
					System.out.println("Correct");
				}
			}
		}
		
		
		input.close();

	}
}
