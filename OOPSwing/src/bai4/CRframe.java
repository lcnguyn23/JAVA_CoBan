package bai4;

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

public class CRframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtUpperX;
	private JTextField txtLowerX;
	private JTextField txtUpperY;
	private JTextField txtLowerY;
	private JTextField txtRadius;
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtKetquaC;
	private JTextField txtKetQuaR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CRframe frame = new CRframe();
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
	public CRframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ti\u0301nh di\u00EA\u0323n ti\u0301ch va\u0300 chu vi");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 11, 542, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Hi\u0300nh tro\u0300n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 36, 253, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Hi\u0300nh ch\u01B0\u0303 nh\u00E2\u0323t");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(299, 36, 253, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("upper_x");
		lblNewLabel_3.setBounds(309, 61, 59, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("upper_y");
		lblNewLabel_3_1.setBounds(309, 111, 46, 14);
		contentPane.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_2 = new JLabel("lower_x");
		lblNewLabel_3_2.setBounds(309, 86, 46, 14);
		contentPane.add(lblNewLabel_3_2);

		JLabel lblNewLabel_3_3 = new JLabel("lower_y");
		lblNewLabel_3_3.setBounds(309, 136, 46, 14);
		contentPane.add(lblNewLabel_3_3);

		JLabel lblNewLabel_3_4 = new JLabel("radius");
		lblNewLabel_3_4.setBounds(20, 61, 46, 14);
		contentPane.add(lblNewLabel_3_4);

		JLabel lblNewLabel_3_5 = new JLabel("x");
		lblNewLabel_3_5.setBounds(20, 86, 46, 14);
		contentPane.add(lblNewLabel_3_5);

		JLabel lblNewLabel_3_6 = new JLabel("y");
		lblNewLabel_3_6.setBounds(20, 110, 46, 14);
		contentPane.add(lblNewLabel_3_6);

		txtUpperX = new JTextField();
		txtUpperX.setBounds(390, 61, 86, 20);
		contentPane.add(txtUpperX);
		txtUpperX.setColumns(10);

		txtLowerX = new JTextField();
		txtLowerX.setBounds(390, 83, 86, 20);
		contentPane.add(txtLowerX);
		txtLowerX.setColumns(10);

		txtUpperY = new JTextField();
		txtUpperY.setBounds(390, 108, 86, 20);
		contentPane.add(txtUpperY);
		txtUpperY.setColumns(10);

		txtLowerY = new JTextField();
		txtLowerY.setBounds(390, 133, 86, 20);
		contentPane.add(txtLowerY);
		txtLowerY.setColumns(10);

		txtRadius = new JTextField();
		txtRadius.setBounds(76, 61, 86, 20);
		contentPane.add(txtRadius);
		txtRadius.setColumns(10);

		txtX = new JTextField();
		txtX.setBounds(76, 83, 86, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);

		txtY = new JTextField();
		txtY.setBounds(76, 108, 86, 20);
		contentPane.add(txtY);
		txtY.setColumns(10);

		JButton btnCircle = new JButton("Ti\u0301nh hi\u0300nh tro\u0300n");
		btnCircle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Circle c = new Circle(Integer.parseInt(txtRadius.getText()), Integer.parseInt(txtX.getText()),
						Integer.parseInt(txtY.getText()));
				String result = "Dien tich = " + c.calcArea() + " ; Chu vi = " + c.calcPerimeter();
				txtKetquaC.setText(result);
			}
		});
		btnCircle.setBounds(62, 174, 119, 39);
		contentPane.add(btnCircle);

		JButton btnRectangle = new JButton("Ti\u0301nh hi\u0300nh ch\u01B0\u0303 nh\u00E2\u0323t");
		btnRectangle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Rectangle r = new Rectangle(Integer.parseInt(txtUpperX.getText()),
						Integer.parseInt(txtUpperY.getText()), Integer.parseInt(txtLowerX.getText()),
						Integer.parseInt(txtLowerY.getText()));
				String result = "Dien tich = " + r.calcArea() + " ; Chu vi = " + r.calcPerimeter();
				txtKetQuaR.setText(result);
			}
		});
		btnRectangle.setBounds(315, 174, 161, 39);
		contentPane.add(btnRectangle);

		txtKetquaC = new JTextField();
		txtKetquaC.setBounds(20, 224, 243, 160);
		contentPane.add(txtKetquaC);
		txtKetquaC.setColumns(10);

		txtKetQuaR = new JTextField();
		txtKetQuaR.setBounds(273, 224, 279, 160);
		contentPane.add(txtKetQuaR);
		txtKetQuaR.setColumns(10);
	}
}
