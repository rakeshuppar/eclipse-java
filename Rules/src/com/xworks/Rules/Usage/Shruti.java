package com.xworks.Rules.Usage;

import com.xworks.Rules.Game.GoldSeller;

public class Shruti {

	private GoldSeller goldseller;

	public Shruti(GoldSeller goldseller) {
		this.goldseller = goldseller;
	}

	public void chinnaTago() {
		System.out.println("running chinnaTago in Shruti");

		double gram = goldseller.pricePerGram();
		System.out.println("GoldPrice pergram:" + gram);
		String loc = goldseller.getLocation();
		System.out.println("location:" + loc);
		String gst = goldseller.getGstNo();
		System.out.println("GSTnumber:" + gst);

		if (gram < 4000) {
			System.out.println("Shruti will buy gold");
		} else {
			System.out.println("Shruti will not buy gold");
		}
	}

}
