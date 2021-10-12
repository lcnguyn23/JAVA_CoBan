package btHam;

import java.util.Scanner;

public class FuncExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputC();
	}

	public static void inputC() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = input.nextInt();
		while (n < 0) {
			System.out.print("Error!\n");
			System.out.print("Enter again: ");
			n = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			func();
			// FuncExercise2.func();
		}
	}

	public static void func() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		String str = input.nextLine();

		System.out.println("Print string: " + str + "\n");

	}
}
