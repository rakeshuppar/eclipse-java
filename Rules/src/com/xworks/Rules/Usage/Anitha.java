package com.xworks.Rules.Usage;

import com.xworks.Rules.Game.GoldSeller;

public class Anitha {

	private GoldSeller goldseller;

	public Anitha(GoldSeller goldseller) {
		this.goldseller = goldseller;
	}

	public void buyGold() {
		System.out.println("running  buyGold in Anitha");

		double sell = goldseller.pricePerGram();
		System.out.println("GoldPrice pergram:" + sell);
		String gst = goldseller.getGstNo();
		System.out.println("GSTNumber:" + gst);
		String loca = goldseller.getLocation();
		System.out.println("location:" + loca);

		if (sell < 5000) {
			System.out.println("Anitha will buy gold");
		} else {
			System.out.println("Anitha will not buy gold");
		}

	}

}
