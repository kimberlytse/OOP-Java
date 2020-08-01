/*
 * Kimberly Tse
 * Quiz Make-up 4/24/2019
 * 
 */

public class MyRectangle2D {
	double x = 0;
	double y = 0;
	double width = 1;
	double height = 1;

	public MyRectangle2D() {
	}

	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
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

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}

	public boolean contains(double x, double y) { // contains is inclusive; if the point is on the edge of the
													// rectangle, it is considered contained
		if ((x >= this.x && x <= this.x + getWidth()) && (y >= this.y && y <= this.y + getHeight())) {
			return true;
		} else {
			return false;
		}
	}

	public boolean contains(MyRectangle2D r) { // contains is inclusive with rectangles that are on edge
		if (r.x >= x && r.x + r.getWidth() <= x + getWidth() && r.y >= y && r.y + r.getHeight() <= y + getHeight()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean overlaps(MyRectangle2D r) { // Assume overlap means that the whole rectangle or parts of rectangle is
												// overlapped
		if (contains(r.x, r.y) || contains(r.x + r.width, r.y) || contains(r.x + r.width, r.y + r.height)
				|| contains(r.x, r.y + r.height)) {
			return true;
		} else {
			return false;
		}
	}
}