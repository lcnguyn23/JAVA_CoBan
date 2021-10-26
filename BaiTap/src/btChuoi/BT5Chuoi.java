package btChuoi;

import java.util.Scanner;

public class BT5Chuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chuỗi: ");
		String string = scanner.nextLine();
		int len = string.length();
		int count[] = new int[500];
		char s[] = new char[len];
		for (int i = 0; i < len; i++) {
			count[string.charAt(i)]++;
		}
		for (int i = 0; i < len; i++) {
			s[i] = string.charAt(i);
			int countCharacter = 0;
			for (int j = 0; j <= i; j++) {
				if (string.charAt(i) == s[j]) {
					countCharacter++;
				}
			}
			if (countCharacter == 1) {
				System.out.println(
						"Số lần xuất hiện của ký tự " + string.charAt(i) + " là " + count[string.charAt(i)]);
			}

		}
	}

}
