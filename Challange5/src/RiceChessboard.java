
//Kimberly Tse
import java.math.BigInteger;

public class RiceChessboard {
	public static void main(String[] args) {

		BigInteger baseNum = new BigInteger("2");
		BigInteger calculateRice = baseNum.pow(63);
		System.out.println(calculateRice + " rice on square 64");

		BigInteger count = new BigInteger("0");
		for (int n = 0; n < 64; n++) {
			count = count.add(baseNum.pow(n));
		}

		System.out.println("Total of rice: " + count);
	}

}
