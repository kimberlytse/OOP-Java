public class RaggedArray {
	public static void main(String[] args) {
		
		int[][] numbers = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
		
		System.out.println(numbers.length);  //returns 3: number of rows
		System.out.println(numbers[0].length);   //returns 2: number of columns in row 0
		System.out.println(numbers[1].length);   //returns 3: number of columns in row 1
		System.out.println(numbers[2].length);   //returns 4: number of columns in row 2
		
	}
}