package chuDe4;

import java.util.Scanner;

public class S2Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int i = 0;
		while (fibonacci(i) < n) {
			int fi = fibonacci(i);
			if (primeNumber(fi)) {
				System.out.print(fi + " ");
			}
			i++;
		}
	}

	public static int fibonacci(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static boolean primeNumber(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
