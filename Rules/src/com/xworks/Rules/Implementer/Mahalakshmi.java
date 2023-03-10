package com.xworks.Rules.Implementer;

import com.xworks.Rules.Game.GoldSeller;

public class Mahalakshmi implements GoldSeller {

	public Mahalakshmi() {
		System.out.println("Running Mahalaksmi with no arg constructor");
	}

	@Override
	public double pricePerGram() {
		return 4600;
	}

	@Override
	public String getGstNo() {
		return "HBFD54852GF2G";
	}

	@Override
	public String getLocation() {
		return "Bijapur";
	}

}
