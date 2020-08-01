
public class Truck extends Automobile {
	private double towCapacity;

	public Truck() {

	}

	public Truck(int year, double weight, String licensePlate, String make, double towCapacity) {
		super();
		this.year = year;
		this.weight = weight;
		this.licensePlate = licensePlate;
		this.make = make;
		this.towCapacity = towCapacity;
	}

	public double getTowCapacity() {
		return towCapacity;
	}

	public void setTowCapacity(double towCapacity) {
		this.towCapacity = towCapacity;
	}

	public String toString() {
		return make + ": Year: " + year + " weight: " + "License Plate: " + licensePlate + " Make: " + make
				+ " Tow Capacity: " + towCapacity;
	}
}
