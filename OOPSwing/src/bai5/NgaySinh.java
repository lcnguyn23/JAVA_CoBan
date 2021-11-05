package bai5;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

public class NgaySinh extends JFrame {

	private JPanel contentPane;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					NgaySinh frame = new NgaySinh();
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
	public NgaySinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nh\u00E2\u0323p nga\u0300y sinh:");
		lblNewLabel.setBounds(10, 27, 104, 14);
		contentPane.add(lblNewLabel);

		JDateChooser dNgay = new JDateChooser();
		dNgay.setBounds(94, 21, 174, 20);
		contentPane.add(dNgay);

		JButton btnNhap = new JButton("Nh\u00E2\u0323p");
		btnNhap.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date ngay = dNgay.getDate();
				SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
				String output = df.format(ngay);
				txtKetQua.setText(output);
			}
		});
		btnNhap.setBounds(306, 23, 89, 23);
		contentPane.add(btnNhap);

		txtKetQua = new JTextField();
		txtKetQua.setBounds(10, 66, 414, 184);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);

	}
}
