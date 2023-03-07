package com.xworkz.boot.equalRunner;

import com.xworkz.things.equal.WaterFall;

public class WaterFallRunner {

	public static void main(String[] args) {

		WaterFall fall = new WaterFall("JogFalls", 488, "WesterGhats");
		System.out.println(fall.toString());
		System.out.println(fall.equals(fall));

		WaterFall fall2 = new WaterFall("GokakFalls", 52, "Gokak");
		System.out.println(fall2.toString());
		System.out.println(fall.equals(fall2));

	}

}
