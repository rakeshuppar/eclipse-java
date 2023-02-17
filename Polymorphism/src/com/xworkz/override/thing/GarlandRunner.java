package com.xworkz.override.thing;

import com.xworkz.override.boot.FlowerGarland;
import com.xworkz.override.boot.Garland;

public class GarlandRunner {

	public static void main(String[] args) {

		Garland garland = new FlowerGarland();
		double Price = garland.price();
		System.out.println("Price:" + Price);

	}

}
