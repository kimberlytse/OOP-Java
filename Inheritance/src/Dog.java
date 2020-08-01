
public class Dog extends Animal {
	String tail;
	String breed;
	
	public Dog() {
		super();
		System.out.println("Dog is created");
	}

	public Dog(String species, double weight,String color, String tail, String breed) {
		super(species, weight, color); // must be first, goes to Animal.java
		System.out.println("Dog is created");
		this.tail = tail;
		this.breed = breed;
	}
	
	public void makeNoise() {
		System.out.println("Woof");
	}
	

}
