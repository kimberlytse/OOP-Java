
public class Car extends Automobile {
	private int maxPassengers;

	public Car() {

	}

	public Car(int year, double weight, String licensePlate, String make, int maxPassengers) {
		super();
		this.year = year;
		this.weight = weight;
		this.licensePlate = licensePlate;
		this.make = make;
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public String toString() {
		return make + ": Year: " + year + " weight: " + "License Plate: " + licensePlate + " Make: " + make
				+ " MaxPassengers: " + maxPassengers;
	}
}
