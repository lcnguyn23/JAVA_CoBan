package chuDe4;

import java.util.Scanner;

public class S1Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();

		int tmpn = num;
		int digit = 0;
		while (tmpn != 0) {
			tmpn /= 10;
			digit++;
		}

		System.out.print("Total number of digits: " + digit);
	}

}
