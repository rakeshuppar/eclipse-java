package com.xworkz.call.boot;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class AttendanceSheet {

	public static void main(String[] args) {

		Collection<String> attendances = new ArrayList<>();
		attendances.add("Annesh");
		attendances.add("Basavaraj");
		attendances.add("Sanket");
		attendances.add("Kavan");
		attendances.add("Rakesh");
		attendances.add("Jayanth");
		attendances.add("Dinakar");
		attendances.add("Shivu");
		attendances.add("Irfan");
		attendances.add(null);
		attendances.add(" ");

		System.out.println("before using foreach:" + attendances.size());
		System.out.println("By Using For-------------------------------------");

		// For loop is used to read only
		System.out.println("-----------------After Using For---------");
		for (String att : attendances) {
			if (Objects.nonNull(att)) {
				System.out.println(att);
			}
		}
		System.out.println("after using foreach:" + attendances.size());

		System.out.println("----------------After Using Iterator--------");

		Iterator<String> itr = attendances.iterator();

		while (itr.hasNext()) {
			System.out.println("element has exists");
			String ref = itr.next();
			System.out.println(ref);
			if (Objects.isNull(ref) || ref.isEmpty()) {
				itr.remove();
				System.out.println(ref);

			}

		}
		System.out.println("After using iterator:" + attendances.size());
		System.out.println(attendances);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<String> brands = new ArrayList<>();
		brands.add("IB");
		brands.add("Glenmorangie Signet");
		brands.add("Haywards Cheers");
		brands.add("Raja");
		brands.add("Bangalore");
		brands.add("Old Travern");
		brands.add("Mysore Lancer");
		brands.add("Wellington Blended Malt");
		brands.add("Bagpiper Deluxe");
		brands.add(null);

		System.out.println(brands);

		System.out.println("By Using For-------------------------------------");
		System.out.println("-----------------After Using For---------");

		for (String brand : brands) {
			if (Objects.nonNull(brand)) {
				System.out.println(brand);
			}
		}
		System.out.println("size is:" + attendances.size());

		System.out.println("by Using Iteartor--------------------------------");
		System.out.println("----------------After Using Iterator--------");

		Iterator<String> whi = brands.iterator();

		while (whi.hasNext()) {
			System.out.println("Element Exist");
			String obj = whi.next();
			System.out.println(obj);
		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<String> weeks = new LinkedList<>();
		weeks.add("Monday");
		weeks.add("Wednesday");
		weeks.add("Friday");
		weeks.add("Tuesday");
		weeks.add("Thursday");
		weeks.add("Saturaday");
		weeks.add("Monday");
		weeks.add("Wednesday");
		weeks.add("Friday");
		weeks.add(null);

		System.out.println(weeks);

		System.out.println("By Using For-------------------------------------");
		System.out.println("-----------------After Using For---------");
		for (String week : weeks) {
			if (Objects.nonNull(week)) {
				System.out.println(week);
			}
		}
		System.out.println("size is:" + attendances.size());

		System.out.println("by Using Iteartor--------------------------------");
		System.out.println("----------------After Using Iterator--------");
		Iterator<String> ref = weeks.iterator();

		while (ref.hasNext()) {
			System.out.println("Element exist");
			String obj = ref.next();
			System.out.println(obj);
		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<String> cast = new ArrayList<>();
		cast.add("Shivarajkumar");
		cast.add("Bharath Sagar");
		cast.add("Ganvi");
		cast.add("Shwetha");
		cast.add("Umashree");
		cast.add("AditiSagar");
		cast.add("Veena");
		cast.add("Raghu");
		cast.add("Lasya");
		cast.add(null);

		System.out.println(cast);

		System.out.println("By Using For-------------------------------------");
		System.out.println("-----------------After Using For---------");

		for (String cas : cast) {
			if (Objects.nonNull(cas)) {
				System.out.println(cas);
			}

		}
		System.out.println("size is:" + attendances.size());

		System.out.println("by Using Iteartor--------------------------------");
		System.out.println("----------------After Using Iterator--------");

		Iterator<String> ref1 = cast.iterator();

		while (ref1.hasNext()) {
			System.out.println("Elements exist");
			String obj = ref1.next();
			System.out.println(obj);

		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<Double> costs = new LinkedList<>();
		costs.add(50.0);
		costs.add(70.0);
		costs.add(60.0);
		costs.add(55.0);
		costs.add(40.0);
		costs.add(45.0);
		costs.add(62.0);
		costs.add(88.0);
		costs.add(100.0);
		costs.add(null);

		System.out.println(costs);

		System.out.println("By Using For-------------------------------------");
		System.out.println("-----------------After Using For---------");

		for (Double cost : costs) {
			if (Objects.nonNull(cost)) {
				System.out.println(cost);
			}
		}
		System.out.println("size is:" + attendances.size());

		System.out.println("by Using Iteartor--------------------------------");
		System.out.println("----------------After Using Iterator--------");
		Iterator<String> ref2 = cast.iterator();

		while (ref2.hasNext()) {
			System.out.println("Elements exist");
			String obj = ref2.next();
			System.out.println(obj);

		}

	}

}
