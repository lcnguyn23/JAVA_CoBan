package bai6;

import java.util.Date;

import bai8.TaxInterface;

public class Student extends Person implements TaxInterface {
	private String truonghoc;
	private String hocluc;
	private double hocbong;

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

	public Student(String truonghoc, String hocluc, String hoten, int gioitinh, Date ngaysinh) {
		super(hoten, gioitinh, ngaysinh);
		this.truonghoc = truonghoc;
		this.hocluc = hocluc;

	}

	public String getHocluc() {
		return hocluc;
	}

	public void setHocluc(String hocluc) {
		this.hocluc = hocluc;
	}

	public double getHocbong() {
		return hocbong;
	}

	public void setHocbong(double hocbong) {
		this.hocbong = hocbong;
	}

	@Override
	public double calcTax(double income) {
		// TODO Auto-generated method stub
		double tax = 0.01 * income;
		return tax;
	}

	@Override
	public String toString() {
		String ketqua = super.toString();
		ketqua += "Student [truonghoc=" + truonghoc + ", hocluc=" + hocluc + ", hocbong=" + hocbong + "]";
		return ketqua;
	}

}
