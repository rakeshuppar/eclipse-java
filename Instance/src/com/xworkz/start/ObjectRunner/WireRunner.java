package com.xworkz.start.ObjectRunner;

import com.xworkz.start.Object.Wire;

public class WireRunner {

	public static void main(String[] args) {
		Wire wire = new Wire();
		wire.display();

		System.out.println("---------------");

		Wire wire2 = new Wire("Electric Wire", 1.62f, 2.05f);
		wire2.display();

		System.out.println("------------------");

		Wire wire3 = new Wire("Electric Wire", 1.62f, 2.05f, 14.05f, "Copper", 125, 20, "Good", "Red", "Finolex");
		wire3.display();
		
		System.out.println("-------------------");
	}
}
