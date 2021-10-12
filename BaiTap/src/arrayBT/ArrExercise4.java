package arrayBT;

import java.util.Random;
import java.util.Scanner;

public class ArrExercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào độ dài mảng: ");
		int n = input.nextInt();
		int a[] = new int[n];

		rdArr(a, n);
		inArr(a, n);
		inArrRev(a, n);
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

	public static void inArr(int[] array, int n) {
		System.out.println("In mảng theo chiều từ trái sang phải: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public static void inArrRev(int[] array, int n) {
		System.out.println("In mảng theo chiều từ phải sang trái: ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}
}
