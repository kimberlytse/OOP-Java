import java.util.Scanner;

public class TestAvgAndGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter test grade for student 1: ");
		double test1 = input.nextDouble();
		input.nextLine();

		System.out.print("Enter test grade for student 2: ");
		double test2 = input.nextDouble();
		input.nextLine();

		System.out.print("Enter test grade for student 3: ");
		double test3 = input.nextDouble();
		input.nextLine();

		System.out.print("Enter test grade for student 4: ");
		double test4 = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter test grade for student 5: ");
		double test5 = input.nextDouble();
		input.nextLine();

		System.out.println("The letter grades are as follows:");
		System.out.println("Student 1: " + determineGrade(test1));
		System.out.println("Student 2: " + determineGrade(test2));
		System.out.println("Student 3: " + determineGrade(test3));
		System.out.println("Student 4: " + determineGrade(test4));
		System.out.println("Student 5: " + determineGrade(test5));

		System.out.printf("The average grade was: " + "%.2f" + "\n", calcAverage(test1, test2, test3, test4, test5));

		input.close();
	}

	public static double calcAverage(double test1, double test2, double test3, double test4, double test5) {
		return (test1 + test2 + test3 + test4 + test5) / 5.00;
	}

	public static String determineGrade(double testGrade) {
		String letGrade;
		if (testGrade >= 90) {
			letGrade = "A";
		} else if (testGrade < 90 && testGrade >= 80) {
			letGrade = "B";
		} else if (testGrade < 80 && testGrade >= 70) {
			letGrade = "C";
		} else if (testGrade < 70 && testGrade >= 60) {
			letGrade = "D";
		} else {
			letGrade = "F";
		}
		return letGrade;
	}

}