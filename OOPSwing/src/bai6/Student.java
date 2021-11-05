package bai6;

import java.util.Date;

import bai8.TaxInterface;

public class Student extends Person implements TaxInterface {
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

	@Override
	public double calcTax(double income) {
		// TODO Auto-generated method stub
		double tax = 0.01 * income;
		return tax;
	}

}
