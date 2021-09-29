import java.util.Scanner;

public class Ses3exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value for inch: ");
		double inch = input.nextDouble();

		double meter = inch * 0.0254;

		System.out.print(inch + " inch is " + meter + " meters");
	}

}
