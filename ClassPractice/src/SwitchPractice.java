import java.util.Scanner;

public class SwitchPractice {
	public static void main(String[] args) {
		/*
		 * int status = 1; switch (status) { case 0: System.out.println("0"); break;
		 * case 1: System.out.println("1"); break; case 2: System.out.println("2");
		 * break; default: System.out.println("Status invalid"); }
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("What is your major? Engineering(1) or Science(2)?");
		int major = input.nextInt();
		if (major == 1) {
			System.out.println("What is your area of concentration? EE(1), CE(2), SE(3), or IE(4)?");
			int areaOfConcentrationEng = input.nextInt();
			input.nextLine();
			switch (areaOfConcentrationEng) {
			case 1:
				System.out.println("Learn Lontover");
				break;
			case 2:
				System.out.println("Learn Java");
				break;
			case 3:
				System.out.println("Learn Scala");
				break;
			case 4:
				System.out.println("Learn SAP");
				break;
			default:
				System.out.println("Not in this program...");
				break;
			}

		} else if (major == 2) {
			System.out.println("What is your area of concentration? Biology(1) Chemistry(2) Physics(3)");
			int areaOfConcentrationSci = input.nextInt();
			input.nextLine();
			switch (areaOfConcentrationSci) {
			case 1:
				System.out.println("Learn the cells");
				break;
			case 2:
				System.out.println("Learn the Periodic Table");
				break;
			case 3:
				System.out.println("Learn Mechanics");
				break;
			default:
				System.out.println("Not in this program...");
				break;
			}

		} else {
			System.out.println("Sorry, not in this program.");
		}

		input.close();

	}
}
