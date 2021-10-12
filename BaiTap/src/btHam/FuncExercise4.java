package btHam;

import java.util.Scanner;

public class FuncExercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số a = ");
		int a = input.nextInt();

		System.out.print("Nhập số b = ");
		int b = input.nextInt();

		giaiptb1(a, b);
	}

	public static void giaiptb1(int a, int b) {
		if (a == 0 && b == 0) {
			System.out.print("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.print("Phương trình vô nghiệm");
		} else if (a != 0) {
			System.out.print("Phương trình có nghiệm duy nhất x = " + (-b / a));
		}
	}
}
