package bai14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

public class DemoCoffeeShop {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		CoffeeShop[] shops = new CoffeeShop[] { new CoffeeShop("Cong coffee", "12 Nguyen Hue"),
				new CoffeeShop("Kha coffee", "54 Nguyen Trai") };
		Manager2[] mana = new Manager2[] { new Manager2(shops, 1000, "Nguyen van a", 0, df.parse("11-05-2018")),
				new Manager2(new CoffeeShop[] { new CoffeeShop("K coffee", "11 tran thai tong") }, 2000, "Le thi b", 1,
						df.parse("12-09-2016")) };
		System.out.println(Arrays.toString(mana));
	}

}
