package com.xworkz.start.ObjectRunner;

import com.xworkz.start.Object.Bag;

public class BagRunner {

	public static void main(String[] args) {

		Bag bag = new Bag();
		bag.display();

		System.out.println("-------------");

		Bag bag1 = new Bag("hp", "black", 3, 500, "backpack", 45);
		bag1.display();

	}

}
