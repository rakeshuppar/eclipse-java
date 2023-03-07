package com.xworkz.boot.equalRunner;

import com.xworkz.things.equal.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {

		Fridge fridge = new Fridge("Whirlpool", "mechanical", 2, 30000, true, 6, 6.0d, "good", true, "HFC134",
				"compressor", 22);
		System.out.println(fridge.toString());
		System.out.println(fridge.equals(fridge));

		Fridge fridge1 = new Fridge("LG", "Electrical", 1, 35000, false, 8, 5.0d, "best", false, "HFC135", "Absorption",
				20);
		System.out.println(fridge1.toString());

		System.out.println(fridge.equals(fridge1));

	}

}
