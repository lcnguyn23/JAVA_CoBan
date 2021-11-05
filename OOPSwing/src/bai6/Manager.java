package bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Manager {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		String input = "15-03-2002";
		Date ngaysinh = df.parse(input);
		Person p = new Person("Nguyễn Văn A", 1, ngaysinh);

		System.out.println("Họ tên: " + p.getHoten() + "\nGiới tính: " + p.getGioitinh() + "\nNgày sinh: "
				+ df.format(p.getNgaysinh()) + "\n");

		Student s = new Student();
		s.setHoten("Nguyễn văn B");
		s.setGioitinh(1);
		s.setNgaysinh(df.parse("11-08-2000"));
		s.setTruonghoc("HUSC");

		System.out.println("Họ tên: " + s.getHoten() + "\nGiới tính: " + s.getGioitinh() + "\nNgày sinh: "
				+ df.format(s.getNgaysinh()) + "\nTrường học: " + s.getTruonghoc());
		System.out.println(s.calcTax(1200));

		Worker w = new Worker();
		w.setHoten("Nguyễn văn C");
		w.setGioitinh(1);
		w.setNgaysinh(df.parse("09-08-1998"));
		w.setCongty("FPT");

		System.out.println("Họ tên: " + w.getHoten() + "\nGiới tính: " + w.getGioitinh() + "\nNgày sinh: "
				+ df.format(w.getNgaysinh()) + "\nCông ty: " + w.getCongty());
		System.out.println(w.calcTax(1600));

	}
}
