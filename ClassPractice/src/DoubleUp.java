import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;

public class DoubleUp {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("The program will multiply by 2 as many as you like... ");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int userNum = input.nextInt();
		input.nextLine();
		System.out.println("Enter the number of interations:");
		int numInts = input.nextInt();
		
		long startTime = System.currentTimeMillis();
		
		//System.out.println("The result is " + multiplyByTwo(userNum, numInts));
		//Unix time epoch
		PrintWriter pw = new PrintWriter("result.txt");
		pw.println(multiplyByTwo(userNum, numInts));
		
		long finishTime = System.currentTimeMillis();
		
		long difTime = finishTime - startTime;
		System.out.println("It took " + (difTime/100.0) + " seconds");
		
		pw.close();
		
		input.close();
	}

	public static BigInteger multiplyByTwo(int userNum, int numInts) {
		BigInteger big = BigInteger.valueOf(userNum);
		for(int i = 0; i < numInts; i++) {
			big = big.multiply(BigInteger.valueOf(2));
		}
		return big;
	}
}
