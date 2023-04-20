package com.xworkz.call.boot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NameRunner {

	public static void main(String[] args) {
		// it allows duplicate elements
		// it is ordered
		// access based on index
		System.out.println("---------using list-------------");
		List<String> names = new ArrayList<>();
		names.add("Rakesh");
		names.add("Shreehari");
		names.add("Basu");
		names.add("Pradeepkumar");
		names.add("Shrishail");
		names.add("Sagar");
		names.add("Deepa");
		names.add("Rakesh");
		names.add(3, "Sangli");
		names.remove(3);
		names.set(3, "Sangli");
		names.remove(3);
		names.stream().collect(Collectors.toList()).forEach(e -> System.out.println(e));

		System.out.println("------------using set--------------");

		// it doesnot allow duplicate value
		// it is unordered
		// does not access based on index
		Set<String> names1 = new HashSet<>();

		names1.add("Rakesh");
		names1.add("Shreehari");
		names1.add("Basu");
		names1.add("Pradeepkumar");
		names1.add("Shrishail");
		names1.add("Sagar");
		names1.add("Deepa");
		names1.add("Rakesh");
		names1.size();
		names1.stream().collect(Collectors.toList()).forEach(e -> System.out.println(e));

	}

}
