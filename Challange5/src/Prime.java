
//Kimberly Tse
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(
				"Enter a number. The System will find all the prime numbers smaller than this number.");
		int userNum = input.nextInt();
		int primeCount = 0;

		for (int n = 2; n < userNum; n++) {
			if (getPrime(n) == true) {
				System.out.print(n + "\t");
				primeCount++;
				if (primeCount % 10 == 0) {
					System.out.println("");
				}
			}
		}

		System.out.println("\nThere are a total of " + primeCount + " Mersenne prime numbers");
		input.close();

	}

	public static boolean getPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
