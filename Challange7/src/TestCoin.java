
//Kimberly Tse
//updated
import java.util.Scanner;

public class TestCoin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Coin myCoin = new Coin();

		System.out.print("Enter the number of times to flip the coin: ");
		int numFlip = input.nextInt();
		input.nextLine();

		System.out.print("Initial side facing up: " + myCoin.getSideUp());

		for (int i = 0; i < numFlip; i++) {
			myCoin.toss();
			System.out.println(myCoin.getSideUp());
		}

		System.out.print("Heads flipped: " + Coin.getNumHeads() + "\n");
		System.out.print("Tails flipped: " + Coin.getNumTails());

		input.close();
	}
}
