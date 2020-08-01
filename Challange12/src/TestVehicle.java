
public class TestVehicle {
	public static void main(String[] args) {
		
		Vehicle myCar = new Car(2006, 2100.56, "1RT245", "Honda", 5);
		Vehicle myTruck = new Truck(2009, 2500.45, "2tu123", "Dodge", 1200);
		Vehicle myTank = new Tank(2011, 7000.56, 4.56);
		
		System.out.println(myCar.toString());
		System.out.println(myTruck.toString());
		System.out.println(myTank.toString());
	}
}
