/*
 * Kimberly Tse
 * Quiz Make-up 4/24/2019
 * 
 */
public class ThePoint {
	private double x;
	private double y;

	public ThePoint() {

	}

	public ThePoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static double getDistance(double x, double y) {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
}
