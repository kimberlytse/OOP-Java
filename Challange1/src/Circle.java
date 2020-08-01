//Kimberly Tse
//Circle

public class Circle {
	
	public static void main(String[]args) {
		
		int radiusCircle = 5; // Given radius
		double pi = Math.PI;
		int diameterCircle = 2*radiusCircle; // Convert radius to diameter
		double areaOfCircle = pi*radiusCircle*radiusCircle; // Finds area of circle given radius
		
		System.out.printf("The circle\'s radius is %d, the area is %.4f\n", radiusCircle, areaOfCircle); // Prints radius, area, and diameter of circle
		System.out.printf("The diameter is %d", diameterCircle);
		
	}
	
}
