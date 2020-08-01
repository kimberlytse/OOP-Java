
//Kimberly Tse
//updated
import java.util.Random;

public class Coin {
	private String sideUp = "";
	private static int numHeads = 0;
	private static int numTails = 0;

	public void toss() {
		Random random = new Random();
		int randNum = random.nextInt(2);
		if (randNum == 1) {
			sideUp = "tails";
			Coin.setNumTails(Coin.getNumTails() + 1);
		} else {
			sideUp = "heads";
			Coin.setNumHeads(Coin.getNumHeads() + 1);
		}
	}

	public String getSideUp() {
		return sideUp;
	}

	public static int getNumHeads() {
		return numHeads;
	}

	public static void setNumHeads(int numHeads) {
		Coin.numHeads = numHeads;
	}

	public static int getNumTails() {
		return numTails;
	}

	public static void setNumTails(int numTails) {
		Coin.numTails = numTails;
	}
}
