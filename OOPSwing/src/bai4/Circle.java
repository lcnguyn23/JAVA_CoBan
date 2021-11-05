package bai4;

import bai7.Shape;

public class Circle extends Shape {
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

	@Override
	public double calcPerimeter() {
		double result = 2 * Math.PI * this.radius;
		return result;
	}

	@Override
	public double calcArea() {
		double result = Math.PI * (Math.pow(radius, 2));
		return result;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + ", calcPerimeter()=" + calcPerimeter()
				+ ", calcArea()=" + calcArea() + "]";
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
