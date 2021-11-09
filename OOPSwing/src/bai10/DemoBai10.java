package bai10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import bai6.Student;

public class DemoBai10 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		String input = "11-09-2002";
		Date ngaysinh = df.parse(input);
		Student s = new Student("HUSC", "Xuat xac", "Nguyen Van A", 1, ngaysinh);
		switch (s.getHocluc()) {
		case "Xuat xac":
			s.setHocbong(1000);
			break;
		case "Gioi":
			s.setHocbong(500);
			break;
		default:
			s.setHocbong(0);
			break;
		}
		System.out.println(s);

	}

}
