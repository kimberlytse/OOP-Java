
/*
 * Kimberly Tse
 * Quiz Make-up 4/24/2019
 * 
 */

import java.util.Date;

public class Time {
	public static void main(String[] args) {
		Date dateCreated = new Date(System.currentTimeMillis());
		System.out.println("At the execution of this program, system local time is " + dateCreated);

		double timeElapsed = dateCreated.getTime();

		System.out.println("\nTime elapsed since Unix Time Epoch: Hours: " + (int) getHours(timeElapsed) + " Minutes: "
				+ (int) getMinutes(timeElapsed) + " Seconds: " + (int) getSeconds(timeElapsed));
	}

	public static double getHours(double timeElapsed) {
		return (timeElapsed / (1000 * 60 * 60));

	}

	public static double getMinutes(double timeElapsed) {
		double remain = getHours(timeElapsed) - (int) getHours(timeElapsed);
		return remain * 60;
	}

	public static double getSeconds(double timeElapsed) {
		double remain = getMinutes(timeElapsed) - (int) getMinutes(timeElapsed);
		return remain * 60;

	}
}
