import java.util.Scanner;

public class Runners {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter runner 1 name: ");
		String name1 = input.nextLine();
		System.out.print("Enter runner 1 time (in minutes): ");
		int min1 = input.nextInt();
		input.nextLine();

		System.out.print("Enter runner 2 name: ");
		String name2 = input.nextLine();
		System.out.print("Enter runner 2 time (in minutes): ");
		int min2 = input.nextInt();
		input.nextLine();

		System.out.print("Enter runner 3 name: ");
		String name3 = input.nextLine();
		System.out.print("Enter runner 3 time (in minutes): ");
		int min3 = input.nextInt();


		if ((min1 < min2) || (min1 == min2)) {
			if ((min2 < min3) || (min2 == min3)) {
				System.out.println(name1 + "\n" + name2 + "\n" + name3 + "\n");
			}
		}
		if ((min1 < min3) || (min1 == min3)) {
			if (min3 < min2) {
				System.out.println(name1 + "\n" + name3 + "\n" + name2 + "\n");
			}
		}
		if ((min2 < min1) || (min2 == min1)) {
			if (min1 < min3) {
				System.out.println(name2 + "\n" + name1 + "\n" + name3 + "\n");
			}
		}
		if ((min2 < min3) || (min2 == min3)) {
			if (min3 < min1) {
				System.out.println(name2 + "\n" + name3 + "\n" + name1 + "\n");
			}
		}
		if ((min3 < min1) || (min3 == min1)) {
			if (min1 < min2) {
				System.out.println(name3 + "\n" + name1 + "\n" + name2 + "\n");
			}
		}
		if ((min3 < min2) || (min3 == min2)) {
			if (min2 < min1) {
				System.out.println(name3 + "\n" + name2 + "\n" + name1 + "\n");
			}
		}
		input.close();

	}

}
