
public class TestDog {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "Nolan";
		d.breed = "bulldog";
		d.size = 40;
		
		d.bark();
		d.bark();
		
		System.out.print(d.getInfo());
		
	}
}
