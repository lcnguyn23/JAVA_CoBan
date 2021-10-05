package chuDe4;

import java.util.Scanner;

public class S1Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.print("Sum = " + sum);
	}

}
