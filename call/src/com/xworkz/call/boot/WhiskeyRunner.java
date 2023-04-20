package com.xworkz.call.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class WhiskeyRunner {

	public static void main(String[] args) {

		// use add method
		Collection<String> brands = new ArrayList<>();
		brands.add("IB");
		brands.add(null);
		brands.add("Raja");
		brands.add("Bangalore");
		brands.add("Glenmorangie Signet");
		brands.add("Wellington Blended Malt");
		brands.add("Mysore Lancer");
		brands.add("IB");
		brands.add("Glenmorangie Signet");
		brands.add("Haywards Cheers");
		brands.add("Raja");
		brands.add("Bangalore");
		brands.add("Old Travern");
		brands.add("Mysore Lancer");
		brands.add("Wellington Blended Malt");
		brands.add("Bagpiper Delux");
		brands.add("");

		System.out.println("before foreach:" + brands.size());
		System.out.println("before foreach:" + brands);

		System.out.println("---------------By using for each-----------------");

		for (String br : brands) {
			if (Objects.nonNull(br) || brands.isEmpty()) {
				System.out.println("brands are:" + br);
			}

		}
		System.out.println(brands.size());
		System.out.println(brands);
		

		System.out.println("-----------------By using Iterator---------------");

		Iterator<String> iterator = brands.iterator();

		while (iterator.hasNext()) {
			// System.out.println("element is exist");
			String whiskey = iterator.next();
			System.out.println(whiskey);
			if (Objects.isNull(whiskey) || whiskey.isEmpty()) {
				iterator.remove();

			}

		}

		System.out.println("after using iterator remove the null and empty:" + brands.size());
		System.out.println(brands);

		System.out.println("======================contains and remove===============================");

		System.out.println("Total Whiskey Brands:" + brands.size());
		String bestbrand = "Rajas";
		String badbrand = "Bangalore";

		boolean contain = brands.contains(bestbrand);
		System.out.println("bestbrand is contain:" + contain);

		boolean remove = brands.remove(badbrand);
		System.out.println("badbrand is remove:" + remove);

		System.out.println("++++++++++++++++++++frequency occurance++++++++++++++++++++++++++++");
		// set do not allow duplicate values and //list allows duplicate values
		Collection<String> set = new HashSet<String>(brands);

		for (String brand : set) {
			int occurance = Collections.frequency(brands, brand);
			System.out.println("brands:" + brand + " is occuring:" + occurance);

		}

	}
}
