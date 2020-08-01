public class ReturnArray {
	public static void main(String[] args) {
		double[] values;

		values = getArray();
		for (int i = 0; i < values.length; i++)
			System.out.print(values[i] + "  ");
	}

	public static double[] getArray() {
		double[] array = { 1.2, 2.3, 4.5, 6.7, 8.9 };

		return array;
	}
}