package bai4;

public class Circle {
	private int radius;
	private int x, y;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius, int x, int y) {
		super();
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	public double calcPerimeter() {
		double result = 2 * Math.PI * this.radius;
		return result;
	}

	public double calcArea() {
		double result = Math.PI * (Math.pow(radius, 2));
		return result;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
