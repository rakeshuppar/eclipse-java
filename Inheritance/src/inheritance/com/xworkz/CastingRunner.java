package inheritance.com.xworkz;

import inheritance.com.xworkz.Casting.Bangle;
import inheritance.com.xworkz.Casting.GoldBangle;
import inheritance.com.xworkz.Casting.SilverBangle;

public class CastingRunner {

	public static void main(String[] args) {

		Bangle bangle1 = new GoldBangle();

		Bangle bangle2 = new SilverBangle();

		GoldBangle bangle3 = new GoldBangle();
		double gram = bangle3.getGram();
		bangle3.getGram();
		System.out.println("gram:" + gram);
		bangle3.getShape();

		SilverBangle bangle4 = new SilverBangle();
		double price = bangle4.getPrice();
		bangle4.getPrice();
		System.out.println("price:" + price);
		bangle4.getShape();

		GoldBangle bangle5 = (GoldBangle) bangle1;
		bangle5.getShape();
		bangle5.getGram();

		SilverBangle bangle6 = (SilverBangle) bangle2;
		bangle6.getPrice();
		bangle6.getShape();

	}

}
