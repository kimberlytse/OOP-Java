
public class TestCat {
	public static void main(String[] args) {
		
		Cat c = new Cat();
		Cat d = new Cat();
		
		c.color = "Black";
		c.fixed = true;
		c.name = "Nolan";
		c.weight = 14.5;
		
		d.color = "grey";
		d.fixed = false;
		d.name = "Nohelia";
		d.weight = 14.5;
		
		c.makeSound();
		System.out.println(c.getWeight());
		System.out.println(c.toString());
		
		c.setColor("Orange");
		System.out.println(c.toString());
		System.out.println(d.toString());
		
	}
}
