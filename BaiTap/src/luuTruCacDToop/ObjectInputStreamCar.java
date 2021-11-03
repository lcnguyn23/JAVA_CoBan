package luuTruCacDToop;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamCar {
	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("D:/carfile.txt"));
			Car cars = (Car) ois.readObject();
			System.out.println(cars.toString());
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			ois.close();
		}
	}
}
