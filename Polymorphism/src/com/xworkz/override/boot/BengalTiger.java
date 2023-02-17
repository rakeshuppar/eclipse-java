package com.xworkz.override.boot;

public class BengalTiger extends Tiger {

	public BengalTiger() {

		System.out.println("calling with no arg constructor in BengalTiger");
	}

	@Override
	public String Hunt() {

		return "Cow";
	}

}
