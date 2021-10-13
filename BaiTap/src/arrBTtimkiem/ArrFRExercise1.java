package arrBTtimkiem;

import java.util.Random;
import java.util.Scanner;

public class ArrFRExercise1 {

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
	}
}
