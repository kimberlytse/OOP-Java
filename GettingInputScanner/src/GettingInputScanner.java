import java.util.Scanner;

public class GettingInputScanner {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Enter the name of the song");
		String songName = input.nextLine();
	
		
		System.out.println("Enter the price");
		double price = input.nextDouble();
		
		System.out.println("Song: " + songName + "\nYear: " + year + "\nPrice:" + price);

		input.close();
	}
}
