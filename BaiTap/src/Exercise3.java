import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		double num = input.nextDouble();

		if (num == 0) {
			System.out.print("0");
		} else if (num > 0) {
			if (Math.abs(num) < 1) {
				System.out.print(num + " is " + "small " + "Positive number");
			} else if (Math.abs(num) > 1000000) {
				System.out.print(num + " is " + "large " + "Positive number");
			} else {
				System.out.print(num + " is Positive number");
			}
		} else {
			if (Math.abs(num) < 1) {
				System.out.print(num + " is " + "small " + "Negative number");
			} else if (Math.abs(num) > 1000000) {
				System.out.print(num + " is " + "large " + "Negative number");
			} else {
				System.out.print(num + " is Negative number");
			}
		}
	}

}
