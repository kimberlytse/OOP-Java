import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {
	static ArrayList<String> studentNames = new ArrayList<String>();
	static double[][] studentTestScores = new double[5][4];
	static double[] avgScores = new double[5];
	static char[] letterGrades = new char[5];
	//static char[] studentLetterGrades = { 'A', 'B', 'C', 'D', 'F' };

	public static void main(String[] args) {

		getStudentNames(studentNames);
		getAvgScores(studentTestScores);
		getLetterGrades(avgScores);
		System.out.println("\n=== Grade Book Data ===\n");
		for (int i = 0; i < studentNames.size(); i++) {
			System.out.println("Student name: " + studentNames.get(i));
			System.out.println("Average test score: " + avgScores[i]);
			System.out.println("Letter grade: " + letterGrades[i]);
			System.out.println("= = = = =");
		}

	}

	public static void getLetterGrades(double[] avgScores) {
		for (int i = 0; i < avgScores.length; i++) {
			if (avgScores[i] < 60) {
				letterGrades[i] = 'F';

			} else if (avgScores[i] < 70) {
				letterGrades[i] = 'D';

			} else if (avgScores[i] < 80) {
				letterGrades[i] = 'C';

			} else if (avgScores[i] < 90) {
				letterGrades[i] = 'B';

			} else if (avgScores[i] >= 90) {
				letterGrades[i] = 'A';

			}
		}
	}

	public static void getAvgScores(double[][] studentTestScores) {
		for (int i = 0; i < studentTestScores.length; i++) {
			double sum = 0;
			for (int j = 0; j < studentTestScores[i].length; j++) {
				sum += studentTestScores[i][j];
			}
			avgScores[i] = sum / 4;
		}

	}

	public static void getStudentNames(ArrayList<String> studentNames) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter student " + (i + 1) + " name: ");
			studentNames.add(input.nextLine());
			for (int j = 0; j < 4; j++) {
				System.out.print("Enter student " + studentNames.get(i) + "'s grade for test " + (j + 1) + ": ");
				studentTestScores[i][j] = input.nextDouble();
				while (studentTestScores[i][j] < 0 || studentTestScores[i][j] > 100) {
					System.out.print("Enter student " + studentNames.get(i) + "'s grade for test " + (j + 1) + ": ");
					studentTestScores[i][j] = input.nextDouble();
				}
			}
		}
		input.close();

	}
}
