package arrayBT;

import java.util.Scanner;

public class ArrExercise1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Nhập vào số phần tử của mảng: ");
		int n = input.nextInt();

		int array[] = new int[n];

		nhapArr(array, n);
		trungbinhcong(array, n);
	}

	public static void nhapArr(int[] array, int n) {
		Scanner input = new Scanner(System.in);

		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("\nMảng vừa nhập: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void trungbinhcong(int[] array, int n) {
		int avg = 0;
		for (int i = 0; i < n; i++) {
			avg += array[i];
		}
		System.out.print("\nTrung binh cong = " + avg);
	}
}
