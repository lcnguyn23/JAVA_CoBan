package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Nhập 1 chuỗi: ");
		String str = input.nextLine();

		try {
			FileWriter myWriter = new FileWriter("D:/stringfile.txt");
			myWriter.write(str);
			myWriter.close();
			System.out.println("Thành công - Đã viết vào file.");
		} catch (IOException e) {
			System.out.println("Có lỗi đã xảy ra!");
			e.printStackTrace();
		}

		try {
			File myObj = new File("D:/stringfile.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.print("Dữ liệu có trong file: ");
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
