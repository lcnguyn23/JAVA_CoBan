import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter second: ");
		int second = input.nextInt();
		int minute = second / 60;
		int remainSecond = second % 60;

		System.out.println(minute + " minute and remain second is " + remainSecond);

	}

}
