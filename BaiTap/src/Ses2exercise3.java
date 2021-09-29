import java.util.Scanner;

public class Ses2exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		System.out.println((isLeapYear) ? year + " is a leap year" : "not a leap year");
	}

}
