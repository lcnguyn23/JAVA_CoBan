import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Age: ");
		int age = input.nextInt();

		if (age >= 16) {
			System.out.print("Enter weight (kg): ");
			double weight = input.nextDouble();

			System.out.print("Enter height (m): ");
			double height = input.nextDouble();

			double bmi = weight / (height * height);

			System.out.print("BMI = " + (int) (bmi * 100) / 100.0 + "\n");
			if (bmi < 18.5) {
				System.out.print("Underweight");
			} else if (bmi < 25.0 && bmi >= 18.5) {
				System.out.print("Normal");
			} else if (bmi < 30.0 && bmi >= 25.0) {
				System.out.print("Overweight");
			} else if (bmi > 30.0) {
				System.out.print("Obese");
			}
		} else {
			System.out.print("Not old enought");
		}
	}
}
