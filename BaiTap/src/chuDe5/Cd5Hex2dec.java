package chuDe5;

import java.util.Scanner;

public class Cd5Hex2dec {

	public static int hex2dec(String hex) {

		String hexstring = "0123456789ABCDEF";

		hex = hex.toUpperCase();

		int num = 0;
		for (int i = 0; i < hex.length(); i++) {
			char ch = hex.charAt(i);
			int n = hexstring.indexOf(ch);
			num = 16 * num + n;
		}
		return num;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter hex number: ");
		String hex = input.nextLine();

		System.out.print("Hex number " + hex + " to dec number is: " + hex2dec(hex));
	}

}
