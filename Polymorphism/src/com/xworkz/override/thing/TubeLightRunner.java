package com.xworkz.override.thing;

import com.xworkz.override.boot.LEDTubeLight;
import com.xworkz.override.boot.TubeLight;

public class TubeLightRunner {

	public static void main(String[] args) {

		TubeLight tubelight = new LEDTubeLight();
		double Price = tubelight.price();
		System.out.println("price:" + Price);

	}
}