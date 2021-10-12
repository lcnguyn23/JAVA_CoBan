package btHam;

import java.util.Scanner;

public class FuncExercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		choseFunc();
	}

	public static void choseFunc() {
		Scanner input = new Scanner(System.in);

		System.out.print("  Chức năng: \t1 - Giải phương trình bậc 1\n \t\t2 - Giải phương trình bậc 2\n");
		System.out.print("Chọn chức năng: ");
		int func = input.nextInt();
		while (func < 1 || func > 2) {
			System.out.println("Không có chức năng này - mời nhập lại!");
			System.out.print("Chọn chức năng: ");
			func = input.nextInt();
		}
		int a, b, c;
		if (func == 1) {
			System.out.print("Nhập số a = ");
			a = input.nextInt();
			System.out.print("Nhập số b = ");
			b = input.nextInt();

			giaiptb1(a, b);
			// FuncExercise4.giaiptb1(a, b);
		} else {
			System.out.print("Nhập số a = ");
			a = input.nextInt();
			System.out.print("Nhập số b = ");
			b = input.nextInt();
			System.out.print("Nhập số c = ");
			c = input.nextInt();

			giaiptb2(a, b, c);
			// FuncExercise5.giaiptb2(a, b, c);
		}

	}

	public static void giaiptb1(int a, int b) {
		if (a == 0 && b == 0) {
			System.out.print("Phương trình vô số nghiệm\n");
		} else if (a == 0 && b != 0) {
			System.out.print("Phương trình vô nghiệm\n");
		} else if (a != 0) {
			System.out.print("Phương trình có nghiệm duy nhất x = " + (-b / a) + "\n");
		}
	}

	public static void giaiptb2(int a, int b, int c) {
		if (a == 0) {
			if (b == 0) {
				System.out.print("Phương trình vô nghiệm\n");
			} else {
				System.out.print("Phương trình có 1 nghiệm x = " + (-c) / b + "\n");
			}
		} else {
			double delta = (b * b) - (4 * a * c);
			double d = Math.sqrt(delta);
			if (delta > 0) {
				System.out.print("Phương trình có 2 nghiệm phân biệt:\n");
				System.out.print("x1 = " + (-b + d) / (2 * a) + "\nx2 = " + (-b - d) / (2 * a) + "\n");
			} else if (delta == 0) {
				System.out.print("Phương trình có nghiệm kép\n");
				System.out.print("x1 = x2 = " + (-b) / (2 * a));
			} else {
				System.out.print("Phương trình vô nghiệm\n");
			}
		}
	}
}
