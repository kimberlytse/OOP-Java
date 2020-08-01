
public class Animal {
	protected String species;
	protected double weight;
	protected String color;

	public Animal() {
		System.out.println("Animal is created");
	}

	public Animal(String species, double weight, String color) {
		System.out.println("Animal is created");
		this.species = species;
		this.weight = weight;
		this.color = color;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}
