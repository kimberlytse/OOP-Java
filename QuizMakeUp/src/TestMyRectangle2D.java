public class TestMyRectangle2D {
	public static void main(String[] args) {
		
		/*
		 * Dr. Aktunc,
		 * 
		 * This challenge did not specify how to do my coordinates. The way I set my coordinates are as follows.
		 *  y
		 *  |	*Origin + height
		 *  |
		 *  |	*Origin point 		*Origin + width
		 *  |______________________________________ x
		 * 0
		 * 
		 * Thanks,
		 * Kim Tse
		 * 
		 */
		
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 2, 2);
		MyRectangle2D r2 = new MyRectangle2D(3, 3, .5, .5);
		MyRectangle2D r3 = new MyRectangle2D(4, 3, 1, 1);
		MyRectangle2D r4 = new MyRectangle2D(7, 7, 1, 1);
		
		// Area and perimeter of Rectangle r1
		System.out.println("Area of r1: " + r1.getArea());
		System.out.println("Perimeter of r1: " + r1.getPerimeter());
		
		//Point that is contained in Rectangle r1
		System.out.println("r1 contains point (3, 3): " + r1.contains(3, 3));
		//Point that is NOT contained in Rectangle r1
		System.out.println("r1 contains point (10, 10): " + r1.contains(10, 10));
		
		//Rectangle r1 is contained & overlaps r2
		System.out.println("r1 contains r2: " + r1.contains(r2));
		System.out.println("r1 overlaps r2: " + r1.overlaps(r2));
		
		//Rectangle r1 is overlapped but does NOT contain r3
		System.out.println("r1 contains r3: " + r1.contains(r3));
		System.out.println("r1 overlaps r3: " + r1.overlaps(r3));
		
		//Rectangle r1 doesn't overlap or contain r4
		System.out.println("r1 contains r4: " + r1.contains(r4));
		System.out.println("r1 overlaps r4: " + r1.overlaps(r4));
		
	}
}
