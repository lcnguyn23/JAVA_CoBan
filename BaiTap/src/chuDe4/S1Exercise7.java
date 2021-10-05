package chuDe4;

public class S1Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;

		int f0 = 0;
		int f1 = 1;
		int fn;

		System.out.print(f0 + " " + f1 + " ");
		for (int i = 2; i < n; i++) {
			fn = f0 + f1;
			System.out.print(fn + " ");
			f0 = f1;
			f1 = fn;
		}
	}
}
