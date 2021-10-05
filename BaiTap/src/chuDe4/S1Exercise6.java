package chuDe4;

import java.util.Scanner;

public class S1Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter range: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			int m = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					m++;
				}
			}
			if (m == 0 && i != 1) {
				System.out.print(i + " ");
			}
		}
	}

}
