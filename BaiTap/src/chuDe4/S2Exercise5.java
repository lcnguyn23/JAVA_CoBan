package chuDe4;

import java.util.Scanner;

public class S2Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = input.nextInt();

		int k = 1;
		int num = 3;

		if (n >= 1) {
			System.out.print(2 + " ");
		}

		for (int i = 2; i <= n;) {
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					k = 0;
					break;
				}
			}
			if (k != 0) {
				System.out.print(num + " ");
				i++;
			}
			k = 1;
			num++;
		}

	}
}
