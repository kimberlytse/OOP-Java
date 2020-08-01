import java.util.Arrays;
public class ArrayExamples {
	public static void main(String[] args) {
		int[] myArray = createArray();
		fillArray(myArray); // fill with random numbers from 0-10
		printArray(myArray); // print elements 
		findHighest(myArray);
		findLowest(myArray);
		findAvg(myArray);
		sortArray(myArray); // lowest to highest
	}

	public static void sortArray(int[] myArray) {
		int placeHolder;
		for(int i = 1; i < myArray.length; i++) {
			if(myArray[i] < myArray[i-1]) {
				placeHolder = myArray[i-1];
				myArray[i] = myArray[i-1];
				myArray[i-1] = placeHolder;
			}
			
		}
		System.out.println(Arrays.toString(myArray));
	}

	public static void findAvg(int[] myArray) {
		double sum = 0;
		for(int i = 0; i < myArray.length; i++) {
			sum = sum + myArray[i];
		}
		System.out.println("Average: " + (sum / myArray.length));
	}

	public static void findLowest(int[] myArray) {
		int minNum = myArray[0];
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] < minNum) {
				minNum = myArray[i];
			}
		}
		System.out.println("Min: " + minNum);
	}

	public static void findHighest(int[] myArray) {
		int maxNum = myArray[0];
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] > maxNum) {
				maxNum = myArray[i];
			}
		}
		System.out.println("Max: " + maxNum);
	}

	public static void printArray(int[] myArray) {
		System.out.print("Array: ");
		for(int i: myArray) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
	}

	public static void fillArray(int[] myArray) {
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = (int)(Math.random()*10 + 1);
		}
	}

	public static int[] createArray() {
		int[] myArray = new int[10];
		return myArray;
	}
	
	
}
