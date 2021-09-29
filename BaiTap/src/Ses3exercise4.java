import java.util.Scanner;

public class Ses3exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");
		double min = input.nextDouble();

		double minYear = 60 * 24 * 365;

		long year = (long) (min / minYear);
		int day = (int) (min / 60 / 24) % 365;

		System.out.print(min + " minutes is approximately " + year + " years and " + day + " days");
	}

}
