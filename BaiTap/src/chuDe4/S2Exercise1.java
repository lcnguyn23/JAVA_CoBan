package chuDe4;

public class S2Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dãy số chia hết cho 7 và không phải là bội số của 5:");
		for (int i = 10; i <= 200; i++) {
			if (i % 7 == 0 && i % 5 != 0) {
				System.out.print(i + " ");
			}
		}

	}

}
