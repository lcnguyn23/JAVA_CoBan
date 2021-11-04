package bai3;

public class Bai3 {
	public static void main(String[] args) {
		int a = 23, b = 8, c;
		c = a + b;
		System.out.println("Phep cong: " + a + " + " + b + " = " + c);
		c = a - b;
		System.out.println("Phep tru: " + a + " - " + b + " = " + c);
		c = a * b;
		System.out.println("Phep nhan: " + a + " * " + b + " = " + c);
		c = a / b;
		System.out.println("Phep chia lay phan nguyen: " + a + " / " + b + " = " + c);
		c = a % b;
		System.out.println("Phep chia lay phan du: " + a + " % " + b + " = " + c);

		boolean flag1 = true, flag2 = false, flag3 = true;
		System.out.println("Phep AND: " + (flag1 && flag2));
		System.out.println("Phep OR: " + (flag1 || flag2));
		System.out.println("Phep NOT: " + (!flag1));
		System.out.println("Phep XOR: " + (flag1 ^ flag3));

		String s1 = "Hello World";
		String s2 = "hello";
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.contains(s2));
		System.out.println(s1.toLowerCase().contains(s2));

	}
}
