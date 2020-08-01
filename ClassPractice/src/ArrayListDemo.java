import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// Create an ArrayList to hold some names.
		ArrayList nameList = new ArrayList();

		// Add some names to the ArrayList.
		nameList.add("James");
		nameList.add("Catherine");
		nameList.add("Bill");

		// Display the size of the ArrayList.
		System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");

		// Now display the items in nameList.
		for (int index = 0; index < nameList.size(); index++)
			System.out.println(nameList.get(index));
	}
}