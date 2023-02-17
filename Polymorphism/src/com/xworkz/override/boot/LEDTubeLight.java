package com.xworkz.override.boot;

public class LEDTubeLight extends TubeLight {

	public LEDTubeLight() {
		System.out.println("calling with no arg constructor in LEDTubeLight");
	}

	@Override
	public double price() {

		return 1000;

	}

}
