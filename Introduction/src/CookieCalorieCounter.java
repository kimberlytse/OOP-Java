import java.util.Scanner;

public class CookieCalorieCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of cookies eaten: ");

		int cookieCount = sc.nextInt();

		int servingSize = 4;
		int caloriesPerCookie = 300 / servingSize;
		int totalCalories = cookieCount * caloriesPerCookie;

		System.out.println("Your calorie intake was: " + totalCalories);
		
		sc.close();
	}
}
