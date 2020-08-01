
public class Player {
	private String team;
	private String name;
	private int no;
	private static int playerList;

	public Player(String team, String name, int no) {
		this.setTeam(team);
		this.setName(name);
		this.setNo(no);
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public static int getPlayerList() {
		return playerList;
	}

	public static void setPlayerList(int playerList) {
		Player.playerList = playerList;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String toString() {
		return "Player is from " + team + ", player's name is " + name + ", player's no is " + no;
	}

}
