package arrayBT;

import java.util.Random;
import java.util.Scanner;

public class ArrExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào độ dài mảng: ");
		int n = input.nextInt();
		int a[] = new int[n];
		double b[] = new double[n];

		rdArr(a, n);
		rdFloatArr(b, n);
		trungbinhtrong(a, b, n);
	}

	public static void rdArr(int[] array, int n) {
		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			array[i] = rd.nextInt(n);
		}

		System.out.println("Mảng vừa tạo: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public static void rdFloatArr(double[] array, int n) {
		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			array[i] = (double) Math.round(rd.nextInt(11) * 0.1 * 10) / 10;
		}

		System.out.println("Mảng số thực vừa tạo: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public static void trungbinhtrong(int[] a, double[] b, int n) {
		double tbt = 0;

		for (int i = 0; i < n; i++) {
			tbt += a[i] * b[i];
		}

		System.out.print("Trung bình trọng của 2 mảng là: " + (double) Math.round((tbt / n) * 100) / 100);
	}
}
