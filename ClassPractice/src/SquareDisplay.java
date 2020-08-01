import java.util.Scanner;

public class SquareDisplay{
	public static void main(String[] args) {

	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter an integer in the range of 1-15: ");
	    int userNum = keyboard.nextInt();
		while(userNum > 15 || userNum < 1){
			System.out.print("Enter an integer in the range of 1-15: ");
	    	userNum = keyboard.nextInt();
		}
	
		
		int getNum =  userNum;
		int i, j;
		for(i = 0; i < getNum; i++){
			for(j = 0; j < getNum; j++){
				System.out.print("X");
			}
			System.out.println("");
		}
		
	
		keyboard.close();

	}	




}