package bai11;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class LineGUI extends JFrame {

	private JPanel DrawLineGUI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					LineGUI frame = new LineGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LineGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 474);
		DrawLineGUI = new JPanel();
		DrawLineGUI.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(DrawLineGUI);
		DrawLineGUI.setLayout(null);

		JPanel pDraw = new JPanel();
		pDraw.setBorder(new LineBorder(new Color(0, 0, 0)));
		pDraw.setBackground(Color.WHITE);
		pDraw.setBounds(10, 11, 546, 381);
		DrawLineGUI.add(pDraw);

		JButton btDraw = new JButton("Draw Line");
		btDraw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random rd = new Random();
				Graphics2D gr = (Graphics2D) pDraw.getGraphics();
				int max_x = pDraw.getWidth();
				int max_y = pDraw.getHeight();
				Line line = new Line();
				DrawLine dl = new DrawLine();
				for (int i = 0; i < 100; i++) {

					line.setBegin_x(rd.nextInt(max_x));
					line.setBegin_y(rd.nextInt(max_y));
					line.setEnd_x(rd.nextInt(max_x));
					line.setEnd_y(rd.nextInt(max_y));
					dl.setGr(gr);
					dl.setLine(line);
					dl.veDuongthang();
				}
			}
		});
		btDraw.setBounds(10, 401, 546, 23);
		DrawLineGUI.add(btDraw);
	}

}
