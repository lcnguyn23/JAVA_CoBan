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

		double km = met / 1000;
		double mile = met / 1609;
		double time = (hour * 3600) + (minute * 60) + second;
		double ms = met / time;
		double kmh = km / (time / 60);
		double mih = mile / (time / 60);

		System.out.print("Your speed in meters/second is " + (double) Math.round(ms * 10000000) / 10000000 + "\n");
		System.out.print("Your speed in km/h is " + (double) Math.round(kmh * 10000000) / 10000000 + "\n");
		System.out.print("Your speed in miles/h is " + (double) Math.round(mih * 10000000) / 10000000 + "\n");
	}

}
