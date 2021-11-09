package bai9;

public class GiaiPTB2 implements GiaiPTInterface {
	private double a;
	private double b;
	private double c;
	private double x1;
	private double x2;
	private String ketqua;

	public GiaiPTB2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaiPTB2(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void giaiPhuongtrinh() {
		// TODO Auto-generated method stub
		if (a == 0) {
			GiaiPTB1 ptb1 = new GiaiPTB1(b, c);
			ptb1.giaiPhuongtrinh();
			ketqua = ptb1.getKetqua();
		} else {
			double delta = b * b - 4 * a * c;
			double d = Math.sqrt(delta);
			if (delta > 0) {
				x1 = (-b + d) / (2 * a);
				x2 = (-b - d) / (2 * a);
				ketqua = "Phương trình có 2 nghiệm phân biệt:\n" + "x1 = " + x1 + "\nx2 = " + x2;
			} else if (delta == 0) {
				x1 = (-b) / (2 * a);
				ketqua = "Phương trình có nghiệm kép\n" + "x1 = x2 = " + x1;
			} else {
				ketqua = "Phương trình vô nghiệm";
			}
		}
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

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public String getKetqua() {
		return ketqua;
	}

	public void setKetqua(String ketqua) {
		this.ketqua = ketqua;
	}

	@Override
	public String toString() {
		if (ketqua == null || ketqua.isEmpty()) {
			giaiPhuongtrinh();
		}
		return ketqua;
	}

}
