package btChuoi;

import java.util.Scanner;

public class BT3Chuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chiều dài của mảng ký tự: ");
		int n = scanner.nextInt();
		char s[] = new char[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("s[%d]= ", i);
			s[i] = scanner.next().charAt(0);
		}
		// String str = String.valueOf(s);
		String str = "";
		for (int i = 0; i < s.length; i++) {
			str += Character.toString(s[i]);
		}
		System.out.println("Chuỗi: " + str);
	}

}
