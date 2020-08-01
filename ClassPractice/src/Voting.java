
public class Voting {
	public static void main(String[] args) {

		int age = 15;
		String status = "Citizen";
		/*
		 * if (age >= 18) { if (status == "Citizen") {
		 * System.out.println("You're eligible to vote."); } else {
		 * System.out.println("You have to be a citizen to vote."); } } else {
		 * System.out.println("You must be at least 18 years old to vote.");
		 * 
		 * }
		 */

		if (age < 18) {
			System.out.println("You must be at least 18 years old to vote.");
		} else if (status != "Citizen") {
			System.out.println("You have to be a citizen to vote.");
		} else {
			System.out.println("You're eligible to vote.");
		}

	}
}
