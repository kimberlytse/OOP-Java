import java.util.Date;

public class GeometricObject1 {
	protected String color = "white";
	protected boolean filled = false;
	protected Date dateCreated;

	public GeometricObject1() {
		dateCreated = new Date(System.currentTimeMillis());
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "Color: " + color + "\nFilled: " + filled + "\nDate Created: " + dateCreated;
	}
}
