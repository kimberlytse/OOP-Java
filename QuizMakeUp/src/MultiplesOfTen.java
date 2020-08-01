/*
 * Kimberly Tse
 * Quiz Make-up 4/24/2019
 * 
 */
public class MultiplesOfTen {
	public static void main(String[] args) {
		int number = 10;
		int count = 0;
		for (number = 10; number <= 1000; number += 10) {
			System.out.print(number + " ");
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}
	}
}
