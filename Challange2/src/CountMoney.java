import java.util.Scanner;

//Kimberly Tse
//Count Money
public class CountMoney {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of money in integer form: ");
		int money = input.nextInt();
		input.nextLine();

		int dollars = (money - money % 100) / 100;
		int quarters = (money - dollars * 100) / 25;
		int dimes = (money - dollars * 100 - quarters * 25) / 10;
		int nickels = (money - dollars * 100 - quarters * 25 - dimes * 10) / 5;
		int pennies = money - dollars * 100 - quarters * 25 - dimes * 10 - nickels * 5;

		System.out.println("Your amount of " + money + " consists of...");
		System.out.println(dollars + "\t dollars");
		System.out.println(quarters + "\t quarters");
		System.out.println(dimes + "\t dimes");
		System.out.println(nickels + "\t nickels");
		System.out.println(pennies + "\t pennies");

		input.close();
	}
}