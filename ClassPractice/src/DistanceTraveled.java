import java.util.Scanner;

public class DistanceTraveled {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int time, speed, hour, distance;

		System.out.print("Enter vehicle speed (in mph): ");
		speed = keyboard.nextInt();
		while (speed < 0) {
			System.out.print("Enter vehicle speed (in mph): ");
			speed = keyboard.nextInt();
		}
		
		System.out.print("Enter time travelled (in hrs): ");
		time = keyboard.nextInt();
		while (time <= 0) {
			System.out.print("Enter time travelled (in hrs): ");
			time = keyboard.nextInt();
		}
		
		
		
		System.out.println("Hour\tDistance Travelled");
		System.out.println("--------------------------");
		
		hour = time;
		for(hour = 1; hour <= time; hour++){
			distance = speed * hour;
			System.out.println(hour + "\t\t" + distance);
		}

	}
}