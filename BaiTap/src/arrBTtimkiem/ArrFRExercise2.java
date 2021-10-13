package arrBTtimkiem;

import java.util.Random;
import java.util.Scanner;

public class ArrFRExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào độ dài mảng: ");
		int l = input.nextInt();
		int arr[] = new int[l];
		rdArr(arr, l);
		System.out.print("Nhập phần tử cần tìm: ");
		int n = input.nextInt();
		findN(arr, n);
	}

	public static void rdArr(int[] arr, int l) {
		Random rd = new Random();

		for (int i = 0; i < l; i++) {
			arr[i] = rd.nextInt(l);
		}

		System.out.println("Mảng vừa tạo: ");
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void findN(int[] arr, int n) {
		System.out.println("Các vị trí xuất hiện: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.print(n + " xuất hiện tại vị trí " + i + "\n");
			} else {
				System.out.print("");
			}
		}
	}
}
