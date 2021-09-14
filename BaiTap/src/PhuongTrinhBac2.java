import java.util.Scanner;

public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Nhập số a = ");
		int a = input.nextInt();
		System.out.print("Nhập số b = ");
		int b = input.nextInt();
		System.out.print("Nhập số c = ");
		int c = input.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.print("Phương trình vô nghiệm");
			} else {
				System.out.print("Phương trình có 1 nghiệm x = " + (-c) / b);
			}
		} else {
			double delta = (b * b) - (4 * a * c);
			double d = Math.sqrt(delta);
			if (delta > 0) {
				System.out.print("Phương trình có 2 nghiệm phân biệt:\n");
				System.out.print("x1 = " + (-b + d) / (2 * a) + "\nx2 = " + (-b - d) / (2 * a));
			} else if (delta == 0) {
				System.out.print("Phương trình có nghiệm kép\n");
				System.out.print("x1 = x2 = " + (-b) / (2 * a));
			} else {
				System.out.print("Phương trình vô nghiệm");
			}
		}
	}

}
