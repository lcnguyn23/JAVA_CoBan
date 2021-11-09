package bai14;

import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class MyCoffee extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MyCoffee frame = new MyCoffee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */
	public MyCoffee() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		CoffeeShop[] shops = new CoffeeShop[] { new CoffeeShop("Cong coffee", "12 Nguyen Hue"),
				new CoffeeShop("Kha coffee", "54 Nguyen Trai") };
		Manager2[] mana = new Manager2[] { new Manager2(shops, 1000, "Nguyen van a", 0, df.parse("11-05-2018")),
				new Manager2(new CoffeeShop[] { new CoffeeShop("K coffee", "11 tran thai tong") }, 2000, "Le thi b", 1,
						df.parse("12-09-2016")) };

		setTitle("MyCoffee");
		setBounds(100, 100, 621, 443);
		getContentPane().setLayout(null);

		JLabel lblHoten = new JLabel("Manager name");
		lblHoten.setBounds(10, 11, 85, 14);
		getContentPane().add(lblHoten);

		JComboBox comboBox = new JComboBox();
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(105, 7, 247, 22);
		getContentPane().add(comboBox);

		for (int i = 0; i < mana.length; i++) {
			comboBox.addItem(mana[i].getHoten());
		}
	}
}
