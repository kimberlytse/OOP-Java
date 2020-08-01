import java.util.Scanner;

public class TheSpeedOfSound {
	public static void main(String[] args) {

		int air = 1100;
		int water = 4900;
		int steel = 16400;
		
		Scanner input = new Scanner(System.in);
		String medium = "a";
		double time;
		double x;
		
		
		while((medium.compareTo("air") != 0)||(medium.compareTo("water") != 0)||(medium.compareTo("steel") != 0)) {
			System.out.println( "Enter one of the following: air, water, or steel: ");
			medium = input.next();
			if((medium.compareTo("air") == 0)||(medium.compareTo("water") == 0)||(medium.compareTo("steel") == 0)) {
				break;
			} else {
				System.out.println( "Sorry, you must enter air, water, or steel.");
			}
		}
		System.out.println("Enter the distance the sound wave will travel: ");
		time = input.nextDouble();
		
		if(medium.equals("air")) {
			x = time / air;
			System.out.println("It will take " + x + " seconds.");
			
		} else if(medium.equals("water")){
			x = time / water;
			System.out.println("It will take " + x + " seconds.");
		} else {
			x = time / steel;
			System.out.println("It will take " + x + " seconds.");
			
		}
		input.close();
		
	}
}
