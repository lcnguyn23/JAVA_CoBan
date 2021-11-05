package bai6;

import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

public class Bai6 extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoten;
	private JTextField txtTruong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Bai6 frame = new Bai6();
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
	public Bai6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ho\u0323 t\u00EAn");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);

		txtHoten = new JTextField();
		txtHoten.setBounds(97, 8, 215, 20);
		contentPane.add(txtHoten);
		txtHoten.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Gi\u01A1\u0301i ti\u0301nh");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);

		JDateChooser dtNgaysinh = new JDateChooser();
		dtNgaysinh.setBounds(97, 58, 215, 20);
		contentPane.add(dtNgaysinh);

		JLabel lblNewLabel_2 = new JLabel("Nga\u0300y sinh");
		lblNewLabel_2.setBounds(10, 61, 54, 14);
		contentPane.add(lblNewLabel_2);

		JComboBox cbGioitinh = new JComboBox();
		cbGioitinh.setModel(new DefaultComboBoxModel(new String[] { "N\u01B0\u0303", "Nam" }));
		cbGioitinh.setSelectedIndex(0);
		cbGioitinh.setBounds(97, 32, 82, 22);
		contentPane.add(cbGioitinh);

		JLabel lblNewLabel_3 = new JLabel("Tr\u01B0\u01A1\u0300ng ho\u0323c");
		lblNewLabel_3.setBounds(10, 86, 66, 14);
		contentPane.add(lblNewLabel_3);

		txtTruong = new JTextField();
		txtTruong.setBounds(97, 83, 215, 20);
		contentPane.add(txtTruong);
		txtTruong.setColumns(10);

		TextArea txtKetqua = new TextArea();
		txtKetqua.setBounds(10, 109, 401, 142);
		contentPane.add(txtKetqua);

		JButton btnNhap = new JButton("Nh\u00E2\u0323p");
		btnNhap.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Student s = new Student();
				s.setHoten(txtHoten.getText());
				s.setGioitinh(cbGioitinh.getSelectedIndex());
				s.setNgaysinh(dtNgaysinh.getDate());
				s.setTruonghoc(txtTruong.getText());
				SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
				String output = "Họ tên: " + s.getHoten() + "\nGiới tính: " + cbGioitinh.getSelectedItem().toString()
						+ "\nNgày sinh: " + d.format(s.getNgaysinh()) + "\nTrường học: " + s.getTruonghoc();
				txtKetqua.append(output + "\n------------\n");
			}
		});
		btnNhap.setBounds(322, 7, 89, 93);
		contentPane.add(btnNhap);

	}
}
