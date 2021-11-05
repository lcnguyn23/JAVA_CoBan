package bai6;

import java.util.Date;

public class Worker extends Person {
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

}
