package arrBTtimkiem;

import java.util.Random;
import java.util.Scanner;

public class ArrFRExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào độ dài mảng: ");
		int l = input.nextInt();
		int arr[] = new int[l];
		rdArr(arr, l);
		inArr(arr, l);
		sortASC(arr, l);
		sortDESC(arr, l);
	}

	public static void rdArr(int[] arr, int l) {
		Random rd = new Random();

		for (int i = 0; i < l; i++) {
			arr[i] = rd.nextInt(l);
		}

		System.out.println("Mảng vừa tạo ngẫu nhiên: ");
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void inArr(int[] arr, int l) {
		Scanner input = new Scanner(System.in);

		System.out.println("Nhập các phần tử của mảng có độ dài bằng " + l + " : ");
		for (int i = 0; i < l; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void sortASC(int[] arr, int l) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Mảng sắp xếp theo chiều tăng dần: ");
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void sortDESC(int[] arr, int l) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Mảng sắp xếp theo chiều giảm dần: ");
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
