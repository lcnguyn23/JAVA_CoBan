package chuDe4;

import java.util.Scanner;

public class S1Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter loop number: ");
		int n = input.nextInt();

		for (int i = n; i >= 1; --i) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
