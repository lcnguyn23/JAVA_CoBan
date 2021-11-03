package luuTruCacDToop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectOutputStreamCar {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = null;
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập tên xe: ");
		String name = input.nextLine();
		System.out.print("Nhập tên động cơ: ");
		String engine = input.nextLine();
		System.out.print("Nhập ngày sản xuất: ");
		String production_date = input.nextLine();
		System.out.print("Nhập số ghế ngồi: ");
		int seats = input.nextInt();

		try {
			oos = new ObjectOutputStream(new FileOutputStream("D:/carfile.txt"));

			Car cars = new Car(name, engine, seats, production_date);

			oos.writeObject(cars);
			System.out.println("Thành công");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			oos.close();
		}
	}
}
