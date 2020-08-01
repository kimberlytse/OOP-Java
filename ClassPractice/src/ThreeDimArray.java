import java.util.Arrays;
public class ThreeDimArray {
	public static void main(String[] args) {
		int[][][] array = new int[3][4][5];
		int value = 1;
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				for (int k = 0; k < array[i][j].length; k++)
					array[i][j][k] = value++;
		System.out.println(Arrays.deepToString(array));
	}
}