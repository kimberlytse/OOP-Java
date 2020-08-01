
public class StringArray {
	public static void main(String[] args) {
		
		String[] cities = {"San Antonio", "Houston", "Austin"};
		for(int i = 0; i < cities.length; i++) {
			cities[i] = cities[i].toUpperCase();
			System.out.println(cities[i].length());
			System.out.println(cities[i]);
			System.out.println(cities[i].substring(2,5));
			
		}
	}
}
