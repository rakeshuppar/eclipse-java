package com.xworkz.override.boot;

public class DigitalClock extends Clock {

	public DigitalClock() {
		System.out.println("calling with no arg constrctor in DigitalClock");
	}

	@Override
	public String type() {

		return "Handwatch";
	}

}
