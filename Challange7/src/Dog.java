
public class Dog {
	String name;
	int size;
	String breed;
	
	public void bark() {
		System.out.println("Dog barks");
	}
	
	public int getSize() {
		return size;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public String getName() {
		return name;
	}
	
	public String getInfo() {
		return name + "\n" + size + "\n" + breed;
	}
}
