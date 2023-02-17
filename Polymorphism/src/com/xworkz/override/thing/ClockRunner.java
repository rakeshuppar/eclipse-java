package com.xworkz.override.thing;

import com.xworkz.override.boot.Clock;
import com.xworkz.override.boot.DigitalClock;

public class ClockRunner {

	public static void main(String[] args) {

		Clock clock = new DigitalClock();
		String Type = clock.type();
		System.out.println("type:" + Type);

	}

}
