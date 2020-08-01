import java.util.Scanner;
import java.util.ArrayList;

public class TestPlayer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many players do you want to enter to the system?");
		Player.setPlayerList(input.nextInt());
		input.nextLine();

		ArrayList<Object> myPlayers = new ArrayList<Object>(Player.getPlayerList());
		Player[] playersList = new Player[Player.getPlayerList()];

		for (int i = 0; i < Player.getPlayerList(); i++) {

			playersList[i] = new Player();
			System.out.println("Please enter the player's team");
			playersList[i].setTeam(input.nextLine());
			System.out.println("Please enter the player's name");
			playersList[i].setName(input.nextLine());
			System.out.println("Please enter the player's no");
			playersList[i].setNo(input.nextInt());
			input.nextLine();

			myPlayers.add(playersList[i]);
			System.out.println();
		}
		printList(playersList);

		int userNum = -100;
		while (userNum != -1) {
			System.out.println(
					"\nDo you want to remove any players, enter player's no to remove, enter -1 to keep the players");
			userNum = input.nextInt();
			deletePlayers(userNum, playersList, myPlayers);

		}
		printCurrentList(myPlayers);

		input.close();
	}

	public static void printCurrentList(ArrayList<Object> array) {
		System.out.println("\nThe current list is ");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}

	public static void printList(Player[] playersList) {
		System.out.println("You entered " + Player.getPlayerList() + " players\n");
		for (int i = 0; i < Player.getPlayerList(); i++) {
			System.out.println(playersList[i]);
		}
	}

	public static void deletePlayers(int userNum, Player[] playersList, ArrayList<Object> myPlayers) {
		for (int i = 0; i < Player.getPlayerList(); i++) {
			if (userNum == playersList[i].getNo()) {
				myPlayers.remove(i);
			}
		}
	}
}
