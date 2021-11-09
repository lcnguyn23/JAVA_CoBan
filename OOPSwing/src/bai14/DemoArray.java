package bai14;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoArray {
	public static void main(String[] args) {
		int[] a;
		a = new int[4];
		a[0] = 12;
		a[1] = 9;
		a[2] = 2;
		a[3] = 11;
		// System.out.print(a.toString());
		System.out.print(Arrays.toString(a) + "\n");

		int[] b = new int[] { 1, 3, 4, 5, 6, 7, 8, 8, 9 };
		System.out.print(Arrays.toString(b) + "\n");
		System.out.print("So luong cac phan tu trong mang: " + b.length + "\n");

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int n = Integer.parseInt(str);
		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			str = input.nextLine();
//			arr[i] = Integer.parseInt(str);
//		}
//		System.out.println("\n" + Arrays.toString(arr));
//		
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(16);
		}
		System.out.println("\n" + Arrays.toString(arr));
	}
}
