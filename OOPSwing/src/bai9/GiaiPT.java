package bai9;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GiaiPT extends JFrame {

	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GiaiPT frame = new GiaiPT();
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
	public GiaiPT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("H\u00EA\u0323 s\u00F4\u0301 a =");
		lblNewLabel.setBounds(10, 11, 76, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("H\u00EA\u0323 s\u00F4\u0301 b =");
		lblNewLabel_1.setBounds(10, 36, 64, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("H\u00EA\u0323 s\u00F4\u0301 c =");
		lblNewLabel_2.setBounds(10, 61, 64, 14);
		contentPane.add(lblNewLabel_2);

		txta = new JTextField();
		txta.setBounds(69, 8, 131, 20);
		contentPane.add(txta);
		txta.setColumns(10);

		txtb = new JTextField();
		txtb.setBounds(69, 33, 131, 20);
		contentPane.add(txtb);
		txtb.setColumns(10);

		txtc = new JTextField();
		txtc.setBounds(69, 61, 131, 20);
		contentPane.add(txtc);
		txtc.setColumns(10);

		JTextArea txtKetqua = new JTextArea();
		txtKetqua.setBounds(10, 104, 414, 146);
		contentPane.add(txtKetqua);

		JButton btnGiai = new JButton("Gia\u0309i ph\u01B0\u01A1ng tri\u0300nh");
		btnGiai.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txta.getText());
				double b = Double.parseDouble(txtb.getText());
				double c = Double.parseDouble(txtc.getText());
				GiaiPTB2 pt2 = new GiaiPTB2(a, b, c);
				pt2.giaiPhuongtrinh();
				txtKetqua.append(pt2.toString() + "\n-------------\n");
			}
		});
		btnGiai.setBounds(243, 22, 155, 43);
		contentPane.add(btnGiai);
	}
}
