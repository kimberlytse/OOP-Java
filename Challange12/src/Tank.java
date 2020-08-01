
public class Tank extends Vehicle {
	private double armorWidth;

	public Tank() {

	}

	public Tank(int year, double weight, double armorWidth) {
		super();
		this.year = year;
		this.weight = weight;
		this.setArmorWidth(armorWidth);

	}

	public double getArmorWidth() {
		return armorWidth;
	}

	public void setArmorWidth(double armorWidth) {
		this.armorWidth = armorWidth;
	}

	public String toString() {
		return "Tank: Year: " + year + " weight: " + weight + " Armor width: " + armorWidth;
	}
}
