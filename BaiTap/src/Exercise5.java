import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter floating-point number: ");
		double num1 = input.nextDouble();
		System.out.print("Enter floating-point another number: ");
		double num2 = input.nextDouble();

		double round1 = (double) Math.round(num1 * 1000) / 1000;
		double round2 = (double) Math.round(num2 * 1000) / 1000;

		if (round1 == round2) {
			System.out.print("They are same");
		} else {
			System.out.print("They are different");
		}
	}

}
