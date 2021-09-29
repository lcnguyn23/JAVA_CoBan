import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three number: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		int max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3 ? num2 : num3);

		System.out.print("The greatest number is " + max);
	}

}
