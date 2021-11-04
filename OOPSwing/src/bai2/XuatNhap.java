package bai2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class XuatNhap extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoten;
	private JTextField txtSonguyen;
	private JTextField txtSothuc;
	private JTextField txtXuat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					XuatNhap frame = new XuatNhap();
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
	public XuatNhap() {
		setTitle("Xu\u00E2\u0301t Nh\u00E2\u0323p");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ho\u0323 t\u00EAn:");
		lblNewLabel.setBounds(15, 11, 57, 14);
		contentPane.add(lblNewLabel);

		txtHoten = new JTextField();
		txtHoten.setBounds(82, 5, 325, 27);
		contentPane.add(txtHoten);
		txtHoten.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("S\u00F4\u0301 nguy\u00EAn:");
		lblNewLabel_1.setBounds(15, 49, 69, 14);
		contentPane.add(lblNewLabel_1);

		txtSonguyen = new JTextField();
		txtSonguyen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSonguyen.setBounds(82, 43, 184, 27);
		contentPane.add(txtSonguyen);
		txtSonguyen.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("S\u00F4\u0301 th\u01B0\u0323c:");
		lblNewLabel_2.setBounds(15, 91, 46, 14);
		contentPane.add(lblNewLabel_2);

		txtSothuc = new JTextField();
		txtSothuc.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSothuc.setBounds(82, 85, 184, 27);
		contentPane.add(txtSothuc);
		txtSothuc.setColumns(10);

		JButton btnNhap = new JButton("Nh\u00E2\u0323p");
		btnNhap.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String result = txtHoten.getText();
				int a = Integer.parseInt(txtSonguyen.getText());
				double b = Double.parseDouble(txtSothuc.getText());
				result = "Họ tên: " + result + "; Số nguyên = " + a + " ; Số thực = " + b;
				txtXuat.setText(result);
			}
		});
		btnNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNhap.setBounds(298, 43, 109, 66);
		contentPane.add(btnNhap);

		txtXuat = new JTextField();
		txtXuat.setBounds(15, 123, 392, 127);
		contentPane.add(txtXuat);
		txtXuat.setColumns(10);
	}
}
