package chuDe4;

import java.util.Scanner;

public class S1Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = input.nextInt();

		while (n > 0) {
			System.out.print(n % 10);
			n = n / 10;
		}

	}

}
