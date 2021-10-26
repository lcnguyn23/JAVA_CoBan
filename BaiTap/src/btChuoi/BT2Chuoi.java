package btChuoi;

import java.util.Scanner;

public class BT2Chuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String str = scanner.nextLine();
		str = str.trim().toLowerCase();
		str = str.replaceAll("\s+", " ");
		String[] arr = str.split(" ");
		str = "";
		for (int i = 0; i < arr.length; i++) {
			str += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
			str += " ";
		}
		System.out.println("Chuỗi thay đổi: " + str);
	}

}
