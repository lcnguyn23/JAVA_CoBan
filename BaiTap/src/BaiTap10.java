import java.util.Scanner;

public class BaiTap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String username = new String("HuyHoang");
		String password = new String("2021");

		System.out.print("Nhập username: ");
		String u = input.nextLine();
		System.out.print("Nhập password: ");
		String p = input.nextLine();

		if (u.equals(username) && p.equals(password)) {
			System.out.print("Đã nhập đúng username và password " + "(" + username + ", " + password + ")");
		} else {
			System.out.print("Đã nhập sai username và password");
		}

	}

}
