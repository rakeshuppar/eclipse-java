package xworkz.com.MainRunner;

import xworkz.com.Main.Cover;
import xworkz.com.Main.Gift;

public class GiftRunner {

	public static void main(String[] args) {

		Gift gift = new Gift();
		gift.display();

		Gift gift1 = new Gift();
		gift1.initialVariables(true, "idol", true);
		gift1.display();

		Cover cover = new Cover();
		cover.intialVariable("wrapper", 50, true);
		cover.display();
	}
}
