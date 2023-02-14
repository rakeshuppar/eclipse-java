package xworkz.com.MainRunner;

import xworkz.com.Main.Photo;
import xworkz.com.Main.Wallet;

public class WalletRunner {

	public static void main(String[] args) {

		Photo pt = new Photo('M',true,"Passport");

		Wallet wallet = new Wallet(5000, "ID", true, pt);
		wallet.display();

	}
}
