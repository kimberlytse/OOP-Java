import java.util.Scanner;

public class SoftwareSales {
	public static void main(String[] arg) {

		int pack = 99;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of packages purchased: ");
		int quantity = input.nextInt();

		if (quantity >= 10 && quantity < 20) {
			int preCost = quantity * pack;
			double discount = .2 * preCost;
			double finalCost = preCost - discount;
			System.out.printf("Your discount is: $%.2f\n", discount);
			System.out.printf("Your total is: $%.2f\n", finalCost);
		} else if (quantity >= 20 && quantity < 50) {
			int preCost = quantity * pack;
			double discount = .3 * preCost;
			double finalCost = preCost - discount;
			System.out.printf("Your discount is: $%.2f\n", discount);
			System.out.printf("Your total is: $%.2f\n", finalCost);

		} else if (quantity >= 50 && quantity < 99) {
			int preCost = quantity * pack;
			double discount = .4 * preCost;
			double finalCost = preCost - discount;
			System.out.printf("Your discount is: $%.2f\n", discount);
			System.out.printf("Your total is: $%.2f\n", finalCost);
		} else {
			int preCost = quantity * pack;
			double discount = 0 * preCost;
			double finalCost = preCost - discount;
			System.out.printf("Your discount is: $%.2f\n", discount);
			System.out.printf("Your total is: $%.2f\n", finalCost);
		}

		input.close();
	}
}