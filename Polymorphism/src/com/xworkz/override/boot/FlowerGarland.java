package com.xworkz.override.boot;

public class FlowerGarland extends Garland {

	public FlowerGarland() {
		System.out.println("calling with no arg constructor in FlowerGarland");
	}

	@Override
	public double price() {

		return 150;
	}

}
