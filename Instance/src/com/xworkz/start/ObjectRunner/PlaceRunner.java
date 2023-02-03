package com.xworkz.start.ObjectRunner;

import com.xworkz.start.Object.Place;

public class PlaceRunner {

	public static void main(String[] args) {

		Place place = new Place();
		place.show();
		System.out.println("-------------------");

		Place place1 = new Place("Hungund", 50000, "Bagalkot", "Karnataka", "India");
		place1.show();
	}

}
