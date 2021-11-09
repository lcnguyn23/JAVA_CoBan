package bai10;

import java.awt.EventQueue;
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
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import bai6.Student;

public class Quanly extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoten;
	private JTextField txtTruong;
	private JTable tbStudent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Quanly frame = new Quanly();
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
	public Quanly() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tbPane = new JTabbedPane(JTabbedPane.TOP);
		tbPane.setBounds(10, 11, 616, 447);
		contentPane.add(tbPane);

		JPanel pStudent = new JPanel();
		tbPane.addTab("Student", null, pStudent, null);
		pStudent.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ho\u0323 t\u00EAn");
		lblNewLabel.setBounds(10, 11, 55, 14);
		pStudent.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Tr\u01B0\u01A1\u0300ng ho\u0323c");
		lblNewLabel_1.setBounds(10, 46, 67, 14);
		pStudent.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nga\u0300y sinh");
		lblNewLabel_2.setBounds(10, 81, 67, 14);
		pStudent.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Gi\u01A1\u0301i ti\u0301nh");
		lblNewLabel_3.setBounds(371, 16, 55, 14);
		pStudent.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Ho\u0323c l\u01B0\u0323c");
		lblNewLabel_4.setBounds(371, 51, 55, 14);
		pStudent.add(lblNewLabel_4);

		txtHoten = new JTextField();
		txtHoten.setBounds(87, 13, 158, 20);
		pStudent.add(txtHoten);
		txtHoten.setColumns(10);

		txtTruong = new JTextField();
		txtTruong.setBounds(87, 48, 158, 20);
		pStudent.add(txtTruong);
		txtTruong.setColumns(10);

		JDateChooser dNgaysinhSV = new JDateChooser();
		dNgaysinhSV.setBounds(87, 81, 158, 20);
		pStudent.add(dNgaysinhSV);

		JComboBox bGioitinh = new JComboBox();
		bGioitinh.setModel(new DefaultComboBoxModel(new String[] { "N\u01B0\u0303", "Nam" }));
		bGioitinh.setSelectedIndex(0);
		bGioitinh.setBounds(425, 17, 47, 20);
		pStudent.add(bGioitinh);

		JComboBox bHocluc = new JComboBox();
		bHocluc.setModel(new DefaultComboBoxModel(new String[] { "Xu\u00E2\u0301t s\u0103\u0301c", "Gio\u0309i",
				"Kha\u0301", "Trung bi\u0300nh", "Y\u00EA\u0301u" }));
		bHocluc.setSelectedIndex(0);
		bHocluc.setBounds(425, 52, 77, 20);
		pStudent.add(bHocluc);

		tbStudent = new JTable();
		tbStudent.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "STT", "Hoten", "Ngaysinh", "Truong", "Hocluc", "Hocbong" }));
		tbStudent.setBounds(10, 133, 591, 275);
		pStudent.add(tbStudent);

		JButton btnNhap = new JButton("Nh\u00E2\u0323p");
		btnNhap.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Student s = new Student(txtTruong.getText(), bHocluc.getSelectedItem().toString(), txtHoten.getText(),
						bGioitinh.getSelectedIndex(), dNgaysinhSV.getDate());

				switch (s.getHocluc()) {
				case "Xuất sắc":
					s.setHocbong(1000);
					break;
				case "Giỏi":
					s.setHocbong(500);
					break;
				default:
					s.setHocbong(0);
					break;
				}

				SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
				DefaultTableModel model = (DefaultTableModel) tbStudent.getModel();
				model.insertRow(model.getRowCount(), new Object[] { model.getRowCount() + 1, s.getHoten(),
						df.format(s.getNgaysinh()), s.getTruonghoc(), s.getHocluc(), s.getHocbong() });
			}
		});
		btnNhap.setBounds(371, 77, 170, 23);
		pStudent.add(btnNhap);

		JPanel pWorker = new JPanel();
		tbPane.addTab("Worker", null, pWorker, null);
		pWorker.setLayout(null);
	}
}
