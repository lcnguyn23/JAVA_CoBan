import java.util.Scanner;

public class Ses3exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer between 0 and 1000: ");
		int num = input.nextInt();

		int tmpnum = num;
		int sum = 0;
		while (tmpnum != 0) {
			sum += tmpnum % 10;
			tmpnum /= 10;
		}

		System.out.print("The sum of all digits in " + num + " is " + sum);
	}

}
