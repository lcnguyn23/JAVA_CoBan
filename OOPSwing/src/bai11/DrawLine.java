package bai11;

import java.awt.Graphics2D;

public class DrawLine {
	private Graphics2D gr;
	private Line line;

	public DrawLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DrawLine(Graphics2D gr, Line line) {
		super();
		this.gr = gr;
		this.line = line;
	}

	public Graphics2D getGr() {
		return gr;
	}

	public void setGr(Graphics2D gr) {
		this.gr = gr;
	}

	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	public void veDuongthang() {
		gr.drawLine(line.getBegin_x(), line.getBegin_y(), line.getEnd_x(), line.getEnd_y());
	}
}
