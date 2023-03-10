package com.xworks.Rules.Implementer;

import com.xworks.Rules.Game.GoldSeller;

public class Abharana implements GoldSeller {
	
	public Abharana() {
		System.out.println("Running Abharana with no arg constructor");
	}

	@Override
	public double pricePerGram() {
		return 6000;
	}

	@Override
	public String getGstNo() {
		return "551HDD54D";
	}

	@Override
	public String getLocation() {
		return "Mudhol";
	}

}
