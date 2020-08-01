import java.util.Scanner;

public class RainFall {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] rainFall = new double[12];
		for (int i = 0; i < rainFall.length; i++) {
			System.out.print("Enter rainfall for month " + (i + 1) + ":");
			rainFall[i] = input.nextDouble();
			while(rainFall[i] < 0) {
				System.out.print("Enter rainfall for month " + (i + 1) + ":");
				rainFall[i] = input.nextDouble();
			}
		}
		input.close();

		System.out.println(totalRainFall(rainFall));
		System.out.println(avgRainFall(rainFall));
		System.out.println(mostRainMonth(rainFall));
		System.out.println(leastRainMonth(rainFall));
	}

	public static String leastRainMonth(double[] rainFall) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		int index = 0;

		for (int i = 0; i < rainFall.length; i++) {
			if (rainFall[i] < rainFall[index]) {
				index = i;
			}
		}
		return months[index];

	}

	public static String mostRainMonth(double[] rainFall) {
		String[] months = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		int index = 0;

		for (int i = 0; i < rainFall.length; i++) {
			if (rainFall[i] > rainFall[index]) {
				index = i;
			}
		}
		return months[index];
	}

	public static double avgRainFall(double[] rainFall) {
		return totalRainFall(rainFall) / rainFall.length;
	}

	public static double totalRainFall(double[] rainFall) {
		double sum = 0;
		for (int i = 0; i < rainFall.length; i++) {
			sum += rainFall[i];
		}
		return sum;
	}
}
