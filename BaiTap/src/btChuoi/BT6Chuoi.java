package btChuoi;

import java.util.Scanner;

public class BT6Chuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chuỗi: ");
		String string = scanner.nextLine();
		String str[] = string.split("\\s+");
		System.out.print("Ký tự: ");
		String word = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(word)) {
				count++;
			}
		}
		if (count <= 0) {
			System.out.println(
					"Số lần xuất hiện của ký tự \"" + word + "\" là " + count + " - không có vị trí");
		} else {
			System.out.print(
					"Số lần xuất hiện của ký tự \"" + word + "\" là " + count + " xuất hiện tại vị trí: ");
			for (int i = 0; i < str.length; i++) {
				if (str[i].equals(word)) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
