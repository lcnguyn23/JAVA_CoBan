package chuDe4;

public class S2Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10001; i < 99999; i += 2) {
			if (primeNumber(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean primeNumber(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
