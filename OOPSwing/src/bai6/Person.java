package bai6;

import java.util.Date;

public class Person {
	private String hoten;
	private int gioitinh;
	private Date ngaysinh;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String hoten, int gioitinh, Date ngaysinh) {
		super();
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(int gioitinh) {
		this.gioitinh = gioitinh;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public double calcTax(double income) {
		// TODO Auto-generated method stub
		double tax = 0.02 * income;
		return 0;
	}

	@Override
	public String toString() {
		return "Person [hoten=" + hoten + ", gioitinh=" + gioitinh + ", ngaysinh=" + ngaysinh + "]";
	}

}
