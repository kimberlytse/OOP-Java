
public class Cat {
	
	String name;
	double weight;
	boolean fixed;
	String color;
	
	public void makeSound() {
		System.out.println(name + " meows");
	}
	public double getWeight() {
		return weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return name + " " + weight + " " + fixed + " " + color;
	}
}
