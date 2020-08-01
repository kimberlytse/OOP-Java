import java.util.Scanner; 

public class BankAccountTest {
	public static void main(String[] args) {
		final int NUM_ACCOUNTS = 3; // Number of accounts
		BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];
		createAccounts(accounts);

		System.out.println("Here are the balances " + "for each account:");

		for (int index = 0; index < accounts.length; index++) {
			System.out.println("Account " + (index + 1) + ": $" + accounts[index].getBalance());
		}
	}

	private static void createAccounts(BankAccount[] array) {
		double balance; 
		Scanner keyboard = new Scanner(System.in);

		for (int index = 0; index < array.length; index++) {

			System.out.print("Enter the balance for account " + (index + 1) + ": ");
			balance = keyboard.nextDouble();

			array[index] = new BankAccount(balance);
			keyboard.close();
		}
	}
}