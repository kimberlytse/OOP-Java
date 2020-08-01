
public class TestCountry {
	public static void main(String[] args) {
		//in order to access private data, you must access it through public methods
		Country c = new Country();
		Country d = new Country("Poland", 400000);
	
		System.out.println(c.getName() + " " + c.getPopulation());
		System.out.println(d.getName() + " " + d.getPopulation());
		
		d.setName("Germany");
		d.setPopulation(80000);
		System.out.println(d.getName() + " " + d.getPopulation());
		System.out.println(d);
		System.out.println(c);
	}
}
