package bai14;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyMainForm extends JFrame {

	private JPanel contentPane;
	XuatDuLieu frm;
	MyCoffee frmCf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MyMainForm frame = new MyMainForm();
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
	public MyMainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 501);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem itemnExit = new JMenuItem("Exit");
		itemnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(itemnExit);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JDesktopPane desktop = new JDesktopPane();
		desktop.setBounds(10, 11, 588, 418);
		contentPane.add(desktop);

		JMenu mnMang = new JMenu("Mang");
		menuBar.add(mnMang);

		JMenuItem itemnMang1 = new JMenuItem("Mang 1 chieu");
		itemnMang1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frm = new XuatDuLieu();
				desktop.add(frm);
				frm.setVisible(true);
			}
		});
		mnMang.add(itemnMang1);

		JMenuItem itemnCoffee = new JMenuItem("Coffee");
		itemnCoffee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					frmCf = new MyCoffee();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				desktop.add(frmCf);
				frmCf.setVisible(true);
			}
		});
		mnMang.add(itemnCoffee);

	}
}
