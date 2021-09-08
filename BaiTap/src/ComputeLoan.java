import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter interest rate: ");
		double interestRate = input.nextDouble();
		double monthlyInterestRate = interestRate / 12;
		System.out.println("Enter number of year: ");
		int numberOfYear = input.nextInt();
		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12));
		double totalPayment = monthlyPayment * numberOfYear * 12;
		System.out.println("Monthly payment is " + monthlyPayment);
		System.out.println("Total payment is " + totalPayment);
	}

}
