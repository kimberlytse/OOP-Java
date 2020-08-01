import java.util.Scanner;
public class LargestAndSmallest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int userNum = 0;
		int smallNum = 999;
		int largeNum = -999;
		
		while(userNum != -99) {
			System.out.print("Enter an integer (-99 to stop): ");
			userNum = input.nextInt();
			if(userNum == -99) {
				break;
			}
			if(userNum < smallNum) {
				smallNum = userNum;
				
			}
			if(userNum > largeNum) {
				largeNum = userNum;
			}
			
		}
		System.out.println("The smallest number was:" + smallNum);
		System.out.println("The largest number was: " + largeNum);
		
		
		input.close();
	}
}