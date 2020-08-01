
//Kimberly Tse
//updated
import java.util.Scanner;
import java.text.DecimalFormat;

public class TestAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		Account myAccount = new Account();

		System.out.print("Enter your ID: ");
		int id = input.nextInt();
		input.nextLine();
		myAccount.setId(id);

		System.out.print("Enter your balance: ");
		double balance = input.nextDouble();
		input.nextLine();
		myAccount.setBalance(balance);

		System.out.print("Enter your annual interest: ");
		double annualInterest = input.nextDouble();
		input.nextLine();
		myAccount.setAnnualInterestRate(annualInterest);

		System.out.print("Enter your deposit: ");
		double deposit = input.nextDouble();
		input.nextLine();
		balance = myAccount.deposit(deposit);
		myAccount.setBalance(balance);

		System.out.print("Enter your withdrawal: ");
		double withdrawal = input.nextDouble();
		input.nextLine();
		balance = myAccount.withdrawal(withdrawal);
		myAccount.setBalance(balance);

		System.out.println("Your balance is $" + myAccount.getBalance());
		System.out.println("Your monthly interest is " + (df.format(myAccount.getMonthlyInterestRate())+ "%"));
		System.out.println("This account was created on " + myAccount.getDataCreated());

		input.close();
	}

}
