package chuDe5;

import java.util.Scanner;

public class Cd5TestMax {

	public static int max(int a, int b) {

		int max = (a > b) ? a : b;
		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter two number: ");
		int a = input.nextInt();
		int b = input.nextInt();

		int result = max(a, b);

		System.out.print("Max = " + result);
	}

}
