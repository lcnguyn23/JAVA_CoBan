package bai4;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(6, 1, 2);
		System.out.println("Chu vi hinh tron: " + c.calcPerimeter());
		System.out.println("Dien tich hinh tron: " + c.calcArea());

		Rectangle r = new Rectangle(3, 15, 4, 5);
		System.out.println("Chu vi hinh chu nhat: " + r.calcPerimeter());
		System.out.println("Dien tich hinh chu nhat: " + r.calcArea());

	}

}
