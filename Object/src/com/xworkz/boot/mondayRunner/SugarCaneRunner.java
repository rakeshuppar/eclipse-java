package com.xworkz.boot.mondayRunner;

import com.xworkz.things.monday.SugarCane;

public class SugarCaneRunner {

	public static void main(String[] args) {

		SugarCane cane = new SugarCane();
		cane.setHeight(6);
		cane.setTaste(true);
		cane.setGrown("field");
		cane.setDiameter(3);
		System.out.println(cane);

		SugarCane cane1 = new SugarCane();
		cane1.setHeight(5);
		cane1.setTaste(true);
		cane1.setGrown("Tota");
		cane1.setDiameter(4);
		System.out.println(cane1);

		System.out.println("HashCode of SugarCane is:" + cane.hashCode() + " Original HashCode of SugarCane is:"
				+ System.identityHashCode(cane));

		System.out.println(cane.equals(cane1));
	}

}
