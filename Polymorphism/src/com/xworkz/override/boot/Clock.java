package com.xworkz.override.boot;

public class Clock {

	public Clock() {
		System.out.println("calling with no arg constructor in Clock");
	}

	public String type() {

		return "Wallclock";
	}

	public double price() {

		return 1500;
	}

}
