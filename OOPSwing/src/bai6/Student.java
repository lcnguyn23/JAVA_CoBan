package bai6;

import java.util.Date;

public class Student extends Person {
	private String truonghoc;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String hoten, int gioitinh, Date ngaysinh) {
		super(hoten, gioitinh, ngaysinh);
		// TODO Auto-generated constructor stub
	}

	public String getTruonghoc() {
		return truonghoc;
	}

	public void setTruonghoc(String truonghoc) {
		this.truonghoc = truonghoc;
	}

}
