package com.xworkz.override.boot;

public class StreetPaniPuri extends PaniPuri {

	public StreetPaniPuri() {
		System.out.println("calling with no arg constructor in StreetPaniPuri");
	}

	@Override
	public int cost() {

		return 30;
	}

}
