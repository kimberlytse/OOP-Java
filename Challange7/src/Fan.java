
//Kimberly Tse
//updated
public class Fan {
	private int speed;
	private boolean fanStatus;
	private double radius = 5.0;
	private String color = "blue";

	public Fan() {

	}

	public void setFan(int speed, boolean fanStatus, double radius, String color) {
		this.setSpeed(speed);
		this.setFanStatus(fanStatus);
		this.setRadius(radius);
		this.setColor(color);

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isFanStatus() {
		return fanStatus;
	}

	public void setFanStatus(boolean fanStatus) {
		this.fanStatus = fanStatus;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		String s1 = "Fan speed: " + this.getSpeed();
		String s2 = "The fan is: " + this.isFanStatus();
		String s3 = "The fan radius is: " + this.getRadius();
		String s4 = "The color of the fan is: " + this.getColor();
		return s1 + "\n" + s2 + "\n" + s3 + "\n" + s4;

	}

}
