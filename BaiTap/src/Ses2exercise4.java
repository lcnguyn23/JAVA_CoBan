import java.util.Scanner;

public class Ses2exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 5 number: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();

		int sum = num1 + num2 + num3 + num4 + num5;
		double avg = sum / 5;

		System.out.print("Sum = " + sum + "\n" + "Average = " + avg);
	}

}
