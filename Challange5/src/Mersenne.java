import java.util.Scanner;

public class Mersenne {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(
				"Enter a number. The System will find all the Mersenne prime numbers smaller than this number.");
		int userNum = input.nextInt();
		int primeCount = 0;

		for (int n = 2; (Math.pow(2, n) - 1) < userNum; n++) {
			if (getMersennePrime((int) (Math.pow(2, n) - 1)) == true) {
				System.out.print((int) (Math.pow(2, n) - 1) + "\t");
				primeCount++;
				if (primeCount % 10 == 0) {
					System.out.println("");
				}
			}
		}

		System.out.println("\nThere are a total of " + primeCount + " Mersenne prime numbers");
		input.close();

	}

	public static boolean getMersennePrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}