import java.util.Arrays;

public class CompareArrays {
	public static void main(String[] args) {
		int[] firstArray = { 2, 4, 6, 8, 10 };
		int[] secondArray = { 2, 4, 6, 8, 10 };
		boolean arraysEqual = true;
		int i = 0;

		// First determine whether the arrays are the same size.
		if (firstArray.length != secondArray.length)
			arraysEqual = false;

		// Next determine whether the elements contain the same data.
		while (arraysEqual && i < firstArray.length) {
			if (firstArray[i] != secondArray[i])
				arraysEqual = false;
			i++;
		}

		if (arraysEqual)
			System.out.println("The arrays are equal.");
		else
			System.out.println("The arrays are not equal.");

		/*
		 * 
		 * 
		 */

		int[] arr1 = { 5, 10, 15, 20, 25 };
		int[] arr2 = { 5, 10, 15, 20, 25 };
		System.out.println(arr1.equals(arr2));
		// This only compares the references

		System.out.println(Arrays.equals(arr1, arr2));
		// This compares the contents

	}
}