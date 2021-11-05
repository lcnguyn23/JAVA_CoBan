package bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class KieuDate {
	public static void main(String[] args) throws ParseException {
		// Chuyển kiểu dữ liệu date sang string
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		Date currentDate = new Date();
		String output = df.format(currentDate);
		System.out.println(currentDate);

		// Chuyển kiểu dữ liệu string sang date
		String input = "15-05-2020";
		Date ngay = df.parse(input);
		System.out.println(ngay);
		System.out.println(df.format(ngay));
	}
}
