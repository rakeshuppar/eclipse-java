package com.xworkz.boot.equalRunner;

import com.xworkz.things.equal.Park;

public class ParkRunner {

	public static void main(String[] args) {

		Park park = new Park("MariyappanapalyaPark", 2, true, true, true, 60);
		System.out.println(park.toString());
		System.out.println(park.equals(park));

		Park park1 = new Park("RajajinagarPark", 3, false, false, false, 100);
		System.out.println(park1.toString());
		System.out.println(park.equals(park1));

	}

}
