import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();

		int day = num / 7;
		switch (day) {
		case 0:
			System.out.print("Monday");
			break;
		case 1:
			System.out.print("Tuesday");
			break;
		case 2:
			System.out.print("Wednesday");
			break;
		case 3:
			System.out.print("Thursday");
			break;
		case 4:
			System.out.print("Friday");
			break;
		case 5:
			System.out.print("Saturday");
			break;
		case 6:
			System.out.print("Sunday");
			break;
		default:
			System.out.print("Invalid day");
			break;
		}
	}

}
