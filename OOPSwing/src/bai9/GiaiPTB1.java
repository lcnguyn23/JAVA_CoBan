package bai9;

public class GiaiPTB1 implements GiaiPTInterface {
	private double a;
	private double b;
	private double nghiem_x;
	private String ketqua;

	public GiaiPTB1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaiPTB1(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void giaiPhuongtrinh() {
		// TODO Auto-generated method stub
		if (a != 0) {
			nghiem_x = -b / a;
			ketqua = "Phương trình có nghiệm duy nhất x = " + nghiem_x;
		} else {
			if (b != 0) {
				ketqua = "Phương trình vô nghiệm";
			} else {
				ketqua = "Phương trình vô số nghiệm";
			}
		}
	}

	@Override
	public String toString() {
		if (ketqua == null || ketqua.isEmpty()) {
			giaiPhuongtrinh();
		}
		return ketqua;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getNghiem_x() {
		return nghiem_x;
	}

	public void setNghiem_x(double nghiem_x) {
		this.nghiem_x = nghiem_x;
	}

	public String getKetqua() {
		return ketqua;
	}

	public void setKetqua(String ketqua) {
		this.ketqua = ketqua;
	}

}
