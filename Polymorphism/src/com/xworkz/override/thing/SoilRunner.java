package com.xworkz.override.thing;

import com.xworkz.override.boot.BlackSoil;
import com.xworkz.override.boot.Soil;

public class SoilRunner {

	public static void main(String[] args) {

		Soil soil = new BlackSoil();
		String sl = soil.Colour();
		System.out.println("colour:" + sl);

	}

}
