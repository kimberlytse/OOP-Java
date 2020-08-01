
public class Automobile extends Vehicle {
	protected String licensePlate;
	protected String make;

	public Automobile() {

	}

	public Automobile(int year, double weight, String licensePlate, String make) {
		super();
		this.year = year;
		this.weight = weight;
		this.licensePlate = licensePlate;
		this.make = make;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String toString() {
		return "Automobile: Year: " + year + " weight: " + weight + " License Plate: " + licensePlate + " Make: " + make;
	}
}
