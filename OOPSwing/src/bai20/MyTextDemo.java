package bai20;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MyTextDemo extends JFrame {

	private JPanel contentPane;
	private JTextField txtField;
	private JFileChooser fileChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MyTextDemo frame = new MyTextDemo();
					frame.setLocationRelativeTo(null);
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
	public MyTextDemo() {
		setTitle("Ch\u01B0\u01A1ng tri\u0300nh x\u01B0\u0309 ly\u0301 v\u0103n ba\u0309n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtField = new JTextField();
		txtField.setBounds(10, 11, 392, 20);
		contentPane.add(txtField);
		txtField.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 57, 613, 336);
		contentPane.add(textArea);

		JButton btnOpen = new JButton("Open");
		btnOpen.setBounds(422, 10, 74, 23);
		contentPane.add(btnOpen);
		btnOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = fileChooser.showOpenDialog(btnOpen);
				if (value == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					txtField.setText(file.getAbsolutePath());
					FileAndDerectory fo = new FileAndDerectory();
					textArea.setText(fo.readTextFile(file.getAbsolutePath()));

				}
			}
		});

		JButton btnSavne = new JButton("Save");
		btnSavne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = fileChooser.showSaveDialog(btnSavne);
				if (value == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					FileAndDerectory fo = new FileAndDerectory();
					boolean result = fo.writeTextFile(file.getAbsolutePath(), textArea.getText());

				}
			}
		});
		btnSavne.setBounds(530, 10, 74, 23);
		contentPane.add(btnSavne);

		fileChooser = new JFileChooser();
		fileChooser.setBounds(10, 404, 582, 399);
		contentPane.add(fileChooser);

//		Toolkit toolkit = getToolkit();
//		Dimension size = toolkit.getScreenSize();
//		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
	}
}
