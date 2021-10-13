package arrayBT;

import java.util.Random;
import java.util.Scanner;

public class ArrExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Nhập vào độ dài mảng: ");
		int n = input.nextInt();

		int array[] = new int[n];

		rdArr(array, n);
		trungbinhcong(array, n);
	}

	public static void rdArr(int[] array, int n) {
		Scanner input = new Scanner(System.in);

		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			array[i] = rd.nextInt(n);
		}

		System.out.println("\nMảng vừa tạo: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static void trungbinhcong(int[] array, int n) {
		double avg = 0;
		for (int i = 0; i < n; i++) {
			avg += array[i];
		}
		System.out.print("\nTrung binh cong = " + (double) Math.round((avg / n) * 100) / 100);
	}

}
