import java.util.Scanner;

public class Ses3exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Fahrenheit degree: ");
		double fah = input.nextDouble();

		double cel = (fah - 32) * (5 / 9);

		System.out.print(fah + " degree Fahrenheit is equal to " + cel + " in Celsius");
	}

}
