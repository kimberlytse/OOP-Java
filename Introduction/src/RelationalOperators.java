
public class RelationalOperators {
	public static void main(String[] args) {

		int number = 8;

		boolean result = !((number % 3 == 0) || (number % 2 == 0));

		System.out.println(result);

		int salary = 50000;
		int yearsOnJob = 3;
		
		if (salary >= 30000 && yearsOnJob >= 2) {
			System.out.println("You are qualified for the loan");
		} else {
			System.out.println("You are not qualified for the loan");
		}
		
		int i = 1;
		int j = 2;
		
		System.out.println(i++ + 1 + ++j);
		

	}
}
