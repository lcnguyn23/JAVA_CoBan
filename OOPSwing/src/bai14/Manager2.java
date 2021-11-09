package bai14;

import java.util.Arrays;
import java.util.Date;

import bai6.Person;

public class Manager2 extends Person {
	private CoffeeShop[] shops;
	private double income;

	public Manager2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager2(String hoten, int gioitinh, Date ngaysinh) {
		super(hoten, gioitinh, ngaysinh);
		// TODO Auto-generated constructor stub
	}

	public Manager2(CoffeeShop[] shops, double income, String hoten, int gioitinh, Date ngaysinh) {
		super(hoten, gioitinh, ngaysinh);
		this.shops = shops;
		this.income = income;
	}

	public CoffeeShop[] getShops() {
		return shops;
	}

	public void setShops(CoffeeShop[] shops) {
		this.shops = shops;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		String ketqua = super.toString();
		ketqua += "; Manager2 [shops=" + Arrays.toString(shops) + ", income=" + income + "]";
		return ketqua;
	}

}
