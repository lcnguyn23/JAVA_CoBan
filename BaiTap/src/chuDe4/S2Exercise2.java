package chuDe4;

import java.util.Scanner;

public class S2Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = input.nextInt();

		long f = 1;

		for (int i = 1; i <= n; i++) {
			f *= i;
		}

		System.out.print("Factorial = " + f);
	}

}
