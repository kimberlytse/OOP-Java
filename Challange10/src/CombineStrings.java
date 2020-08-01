
import java.util.Arrays;

public class CombineStrings {
	public static void main(String[] args) {
		String[] string1 = { "abc", "123" };
		String[] string2 = { "def", "456" , "oof"};

		String[] combined = combineString(string1, string2);

		System.out.println("The first array is " + Arrays.toString(string1));
		System.out.println("The second array is " + Arrays.toString(string2));
		System.out.print("The combined array is: " + Arrays.toString(combined));
	}

	public static String[] combineString(String[] string1, String[] string2) {
		int totalElements = string1.length + string2.length;
		int count = 0;
		String[] comboString = new String[totalElements];
		for (int i = 0; i < string1.length; i++) {
			comboString[count] = string1[i];
			count++;
		}
		for (int i = 0; i < string2.length; i++) {
			comboString[count] = string2[i];
			count++;
		}
		return comboString;
	}

}
