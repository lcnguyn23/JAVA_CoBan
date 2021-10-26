package btChuoi;

import java.util.Scanner;

public class BT1Chuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String str = scanner.nextLine();
		str = str.replaceAll("\s+", "");
		System.out.println("Chuỗi không có khoảng trắng: " + str);
		scanner.close();
	}

}
