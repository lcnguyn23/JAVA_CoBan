package bai6;

import java.util.Date;

import bai8.TaxInterface;

public class Worker extends Person implements TaxInterface {
	private String congty;

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String hoten, int gioitinh, Date ngaysinh) {
		super(hoten, gioitinh, ngaysinh);
		// TODO Auto-generated constructor stub
	}

	public String getCongty() {
		return congty;
	}

	public void setCongty(String congty) {
		this.congty = congty;
	}

	@Override
	public double calcTax(double income) {
		// TODO Auto-generated method stub
		double tax = 0.04 * income;
		return tax;
	}

}
