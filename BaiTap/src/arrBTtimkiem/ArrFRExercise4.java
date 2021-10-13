package arrBTtimkiem;

import java.util.Random;
import java.util.Scanner;

public class ArrFRExercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào độ dài mảng: ");
		int l = input.nextInt();
		int arr[] = new int[l];
		rdArr(arr, l);
		inArr(arr, l);
		int temp[] = new int[l];
		for (int i = 0; i < l; i++) {
			temp[i] = arr[i];
		}
		sortASC(temp, l);
		sortDESC(temp, l);
		System.out.print("Nhập phần tử cần tìm: ");
		int n = input.nextInt();
		findN1(arr, n);
		findN2(arr, n);
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
		System.out.println("\n");
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
		System.out.println("\n");
	}

	public static void findN1(int[] arr, int n) {
		int count = 0;
		int tmpvt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				if (count == 0) {
					tmpvt = i;
					count++;
				} else {
					count += 0;
				}
			} else {
				count += 0;
			}
		}
		if (count == 1) {
			System.out.println("Vị trí xuất hiện đâu tiên: ");
			System.out.println(n + " xuất hiện tại vị trí " + tmpvt);
		} else {
			System.out.println(-1);
		}
		System.out.println("\n");
	}

	public static void findN2(int[] arr, int n) {
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
