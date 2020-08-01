
//Kimberly Tse
//RockPaperScissor
import java.util.Scanner;

public class PaperRockScissors {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 0, 1, or 2\nscissors (0), rock (1), paper (2):");

		int userNum = input.nextInt();
		int cpuNum = (int) (3 * Math.random());

		input.nextLine();

		if (userNum == cpuNum) {
			System.out.println("Tie");
		} else {
			if ((cpuNum < userNum) || (cpuNum == 2 && userNum == 0)) {
				if (userNum == 0) {
					System.out.println("You won: scissors beats paper.");
				}
				if (userNum == 1) {
					System.out.println("You won: rock beats scissors.");
				}
				if (userNum == 2) {
					System.out.println("You won: paper beats rock.");
				}

			} else {
				if (userNum == 0) {
					System.out.println("You lost: rock beats scissors.");
				}
				if (userNum == 1) {
					System.out.println("You lost: paper beats rock.");
				}
				if (userNum == 2) {
					System.out.println("You lost: scissors beats paper.");
				}
			}

		}
		input.close();

	}
}
