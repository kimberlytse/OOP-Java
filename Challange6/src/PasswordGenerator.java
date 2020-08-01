
//Kimberly Tse
import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("How many digits you like to use for a numeric password?");
		int getNum = input.nextInt();

		System.out.println("Your password is");
		randomGenerator(getNum);

		input.close();
	}

	public static int randomGenerator(int num) {
		for (int i = 0; i < num; i++) {
			int createNum = (int) (Math.random() * 10);
			System.out.print(createNum + " ");
		}
		return num;
	}
}
