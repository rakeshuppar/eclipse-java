package com.xworks.Rules.Usage;

import com.xworks.Rules.Game.GoldSeller;

public class Bhairavi {

	private GoldSeller goldseller;

	public Bhairavi(GoldSeller goldseller) {
		this.goldseller = goldseller;
	}

	public void bangaraKaridi() {
		System.out.println("running  bangaraKaridi in Bhairavi");

		double price = this.goldseller.pricePerGram();
		System.out.println("GoldPrice pergram:" + price);
		String gst = this.goldseller.getGstNo();
		System.out.println("GSTnumber:" + gst);
		String loc = this.goldseller.getLocation();
		System.out.println("Location:" + loc);

		if (price < 6000 && price > 4500) {
			System.out.println("Bhairavi will buy gold");
		} else {
			System.out.println("Bhairavi will not buy gold");
		}

	}

}
