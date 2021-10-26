package btChuoi;

import java.util.Scanner;

public class BT4Chuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chuỗi: ");
		String string = scanner.nextLine();
		String word[] = string.split("\\s+");
		System.out.println("Các chuỗi tách được: ");
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
	}

}
