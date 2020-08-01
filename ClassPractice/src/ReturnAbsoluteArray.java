public class ReturnAbsoluteArray {
	public static void main(String[] args) {
		int[] values = { 1, -2, 3, -5, 7, -10 };

		values = getAbsoluteArray(values);
		for (int i : values) {
			System.out.print(i + " ");
		}
	}

	public static int[] getAbsoluteArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = array[i] * -1;
			}
		}
		return array;
	}
}