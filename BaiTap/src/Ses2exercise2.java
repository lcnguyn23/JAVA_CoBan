import java.util.Scanner;

public class Ses2exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an alphabet: ");
		char al = input.next().charAt(0);

		int vowel;

		switch (al) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			vowel = 1;
			break;
		default:
			vowel = 0;
			break;
		}

		if (vowel == 1) {
			System.out.print(al + " is Vowel");
		} else {
			if (al >= 'a' && al <= 'z' || al >= 'A' && al <= 'Z') {
				System.out.print(al + " is Consonant");
			} else {
				System.out.println("Error");
			}
		}
	}

}
