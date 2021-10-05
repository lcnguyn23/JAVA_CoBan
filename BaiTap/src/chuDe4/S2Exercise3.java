package chuDe4;

import java.util.Scanner;

public class S2Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = input.nextInt();

		int f0 = 0;
		int f1 = 1;
		int fn;

		System.out.print(f0 + " " + f1 + " ");
		for (int i = 2; i < n; i++) {
			fn = f0 + f1;
			System.out.print(fn + " ");
			f0 = f1;
			f1 = fn;
		}
	}

}
