package bai14;

import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class XuatDuLieu extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					XuatDuLieu frame = new XuatDuLieu();
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
	public XuatDuLieu() {
		setTitle("Xuat du lieu");
		setBounds(1, 1, 469, 344);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 433, 258);
		getContentPane().add(panel);

		JButton btnVe = new JButton("Ve du lieu mang ra man hinh");
		btnVe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics2D gr = (Graphics2D) panel.getGraphics();
				int max_x = panel.getWidth();
				int max_y = panel.getHeight();
				int step = 5;
				int n = max_x / step;
				int[] a = new int[n];
				Random rd = new Random();
				for (int i = 0; i < n; i++) {
					a[i] = rd.nextInt(max_y);
				}
				int begin_x = 0, begin_y = 0;
				for (int i = 0; i < n; i++) {
					gr.drawRect(begin_x, begin_y, step, a[i]);
					begin_x += step;
				}
			}
		});
		btnVe.setBounds(10, 280, 433, 23);
		getContentPane().add(btnVe);

	}

}
