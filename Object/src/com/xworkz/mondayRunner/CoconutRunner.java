package com.xworkz.mondayRunner;

import com.xworkz.monday.Coconut;

public class CoconutRunner {

	public static void main(String[] args) {

		Coconut coconut = new Coconut();

		String shape = coconut.getShape();
		System.out.println(" shape:" + shape);

		boolean kobbari = coconut.isKobbari();
		System.out.println(" kobbari:" + kobbari);

		String type = coconut.getType();
		System.out.println(" type:" + type);

		String location = coconut.getLocation();
		System.out.println(" location:" + location);

		Coconut coconut1 = new Coconut();

		String shape1 = coconut1.getShape();
		System.out.println(" shape:" + shape1);

		boolean kobbari1 = coconut1.isKobbari();
		System.out.println(" kobbari:" + kobbari1);

		String type1 = coconut1.getType();
		System.out.println(" type:" + type1);

		String location1 = coconut1.getLocation();
		System.out.println("location:" + location1);

		System.out.println("HashCode of Coconut is :" + coconut.hashCode() + " Original Hashcode of Coconut is:"
				+ System.identityHashCode(location));

		System.out.println(coconut.equals(coconut1));

	}

}
