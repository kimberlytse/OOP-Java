import java.util.Scanner;
public class Population {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the starting number organisms: ");
		double numOrganisms =  input.nextInt();
		while(numOrganisms < 2) {
			System.out.print("Enter the starting number organisms: ");
			numOrganisms =  input.nextInt();
		}
		
		System.out.print("Enter the daily increase: ");
		double dailyInc = input.nextDouble();
		
		System.out.print("Enter the number of days the organisms will multiply: ");
		int numDays = input.nextInt();
		
		System.out.println("Day\t\tOrganisms");
		System.out.println("-----------------------------");
		for(int i = 1; i <= numDays; i ++) {
			double popIncrease = numOrganisms;
			System.out.println(i + "\t\t" + popIncrease);
			numOrganisms = popIncrease + (numOrganisms * dailyInc);
		}
		
		input.close();
	}
}