import java.util.Scanner;

public class Ses3exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter distance in meters: ");
		double met = input.nextDouble();
		System.out.print("Enter hour: ");
		int hour = input.nextInt();
		System.out.print("Enter minutes: ");
		int minute = input.nextInt();
		System.out.print("Enter seconds: ");
		int second = input.nextInt();

		double s = (hour * 3600) + (minute * 60) + second;
		double mps, kph, mph;
		mps = met / s;
		kph = (met / 1000.0) / (s / 3600.0);
		mph = kph / 1.609;

		System.out.println("Your speed in meters/second is " + mps);
		System.out.println("Your speed in km/h is " + kph);
		System.out.println("Your speed in miles/h is " + mph);
	}

}
