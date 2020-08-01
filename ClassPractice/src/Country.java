
public class Country {
	private String name;
	private int population;
	// NOTE: if I do not call for any methods, there is a default method of public
	// country with no arguments.

	public Country() {
	}

	public Country(String name, int population) {
		this.name = name;
		this.population = population;

	}

	public String getName() {
		return name;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPopulation(int population) {
		this.population /* field*/ = population/*argument*/;
	}
}
