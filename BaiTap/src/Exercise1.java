import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = input.nextInt();

		System.out.print("Number " + number + " is " + ((number > 0) ? "Positive" : "Negative"));
	}

}
