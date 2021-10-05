package chuDe4;

import java.util.Scanner;

public class S2Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = input.nextInt();

		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.print("Sum all digits = " + sum);
	}

}
