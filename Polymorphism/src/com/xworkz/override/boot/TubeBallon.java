package com.xworkz.override.boot;

public class TubeBallon extends Ballon {

	public TubeBallon() {
		System.out.println("calling with no arg constructor in TubeBallon");

	}

	@Override
	public double ExpandInCm() {

		return 2;
	}

}
