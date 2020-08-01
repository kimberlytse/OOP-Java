
public class RepetitionPractice {
	public static void main(String[] args) {
		int number = 1;
		while (number < 102) {
			System.out.print(number + " ");
			if(number % 10 == 0) {
				System.out.println(number);
			}
			number = number + 6;
		}

	}
}
