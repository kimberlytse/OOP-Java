
public class LargerThanN {
	
	public static int[] greaterNumbers(int[] integerArray, int number) {
		int[] greaterNumbersArray = new int[integerArray.length];
		int count = 0;
		for(int i = 0; i < integerArray.length; i++) {
			if(integerArray[i] > number) {
				greaterNumbersArray[count] = integerArray[i];
				count++;
			}
		}
		return greaterNumbersArray;
		
	}
	public static void main(String[] args) {
		int[] array1 = {1, 5, 10, 2, 4, -3, 6};
		int[] array2 = {10, 12, 15, 24} ;
		int num1 = 3;
		int num2 = 12;
		
		int[] numReturned1 = greaterNumbers(array1, num1);
		int[] numReturned2 = greaterNumbers(array2, num2);
		
		for(int i = 0; i < numReturned1.length; i++) {
			if(numReturned1[i] == 0) {
				break;
			} else {
				System.out.println(numReturned1[i]);
			}
		}
		
		for(int i = 0; i < numReturned2.length; i++) {
			if(numReturned2[i] == 0) {
				break;
			} else {
				System.out.println(numReturned2[i]);
			}
		}
		
	}

}
