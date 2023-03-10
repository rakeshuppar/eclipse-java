package com.xworks.Rules.Usage;

import com.xworks.Rules.Game.GoldSeller;

public class Priyanka {

	private GoldSeller goldseller;

	public Priyanka(GoldSeller goldseller) {
		this.goldseller = goldseller;
	}

	public void purchaseGold() {
		System.out.println("running purchaseGold in Priyanka");

		double price = goldseller.pricePerGram();
		System.out.println("GoldPrice pergram:" + price);
		String seller = goldseller.getGstNo();
		System.out.println("GstNumber:" + seller);
		String loca = goldseller.getLocation();
		System.out.println("Location:" + loca);

		if (price < 4500) {
			System.out.println("Priyanka will buy gold");
		} else {
			System.out.println("Priyanka will not buy gold");
		}
	}

}
