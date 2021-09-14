import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		final int SINGLE = 1;
		final int MARRIED_JOINTLY = 2;
		final int MARRIED_SEPERATELY = 3;
		final int HEAD_OF_HOUSEHOLD = 4;

		System.out.print(" Single - 0 \n Married jointly - 1 \n Married seperately - 2 \n Head of household - 3 \n");
		System.out.print("Status: ");
		int status = input.nextInt();

		System.out.print("Income: ");
		double income = input.nextDouble();

		double tax = 0;

		if (status == SINGLE) {
			if (income < 8350) {
				tax = income * 0.1;
			} else if (income >= 8451 && income < 33950) {
				tax = income * 0.15;
			} else if (income >= 33951 && income < 82250) {
				tax = income * 0.25;
			} else if (income >= 82251 && income < 171550) {
				tax = income * 0.28;
			} else if (income >= 171551 && income < 372950) {
				tax = income * 0.33;
			} else {
				tax = income * 0.35;
			}
		} else if (status == MARRIED_JOINTLY) {
			if (income < 16700) {
				tax = income * 0.1;
			} else if (income >= 16701 && income < 67900) {
				tax = income * 0.15;
			} else if (income >= 67901 && income < 137050) {
				tax = income * 0.25;
			} else if (income >= 137051 && income < 208850) {
				tax = income * 0.28;
			} else if (income >= 208851 && income < 372950) {
				tax = income * 0.33;
			} else {
				tax = income * 0.35;
			}
		} else if (status == MARRIED_SEPERATELY) {
			if (income < 8350) {
				tax = income * 0.1;
			} else if (income >= 8351 && income < 33950) {
				tax = income * 0.15;
			} else if (income >= 33951 && income < 68525) {
				tax = income * 0.25;
			} else if (income >= 68526 && income < 104425) {
				tax = income * 0.28;
			} else if (income >= 104425 && income < 104426) {
				tax = income * 0.33;
			} else {
				tax = income * 0.35;
			}
		} else if (status == HEAD_OF_HOUSEHOLD) {
			if (income < 11950) {
				tax = income * 0.1;
			} else if (income >= 11951 && income < 45500) {
				tax = income * 0.15;
			} else if (income >= 45001 && income < 117450) {
				tax = income * 0.25;
			} else if (income >= 117451 && income < 190200) {
				tax = income * 0.28;
			} else if (income >= 190201 && income < 372950) {
				tax = income * 0.33;
			} else {
				tax = income * 0.35;
			}
		}

		System.out.print("Tax: " + (int) (tax * 100) / 100.0);
	}

}
