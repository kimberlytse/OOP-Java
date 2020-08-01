//If-Else Statements
import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		/*
		int i = 10;
		int j = 1;
		boolean b = i > j;
		
		if(b) {
			System.out.println('i');
		} else {
			System.out.println('j');
		}
		*/
		int score1, score2, score3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter score1: ");
		score1 = input.nextInt();
		input.hasNextLine();
		
		System.out.println("Enter score2: ");
		score2 = input.nextInt();
		input.hasNextLine();
		
		System.out.println("Enter score3: ");
		score3 = input.nextInt();
		input.hasNextLine();
		
		double average = ((double)score1 + score2 + score3 )/3;
		
		if(average >= 80) {
			System.out.println("Good average. Average is: " + average);
			
		} else {
			System.out.println("Needs improvement. Average is " + average);
			
		}
		
		input.close();
		
	}
}
