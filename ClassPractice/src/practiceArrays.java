
public class practiceArrays {
	public static void main(String[] args) {
		double[] numbers = { 3, 6, 9 };
		for (double i : numbers) {
			System.out.println("The next value is " + i);
		}
		
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };

		char[] copyTo = new char[7];

		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));

	}
}
