package com.xworkz.override.thing;

import com.xworkz.override.boot.Soil;

public class SoilRunner {

	public static void main(String[] args) {

		Soil soil = new Soil();
		String s1 = soil.Colour();
		System.out.println("colour:" + s1);

	}
}
