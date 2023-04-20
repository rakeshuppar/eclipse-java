package com.xworkz.call.functional.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class FruitRunner {

	public static void main(String[] args) {

		Collection<String> fruit = new ArrayList<String>();

		fruit.add("Apple");
		fruit.add("Grapes");
		fruit.add("Chikku");
		fruit.add("Banana");
		fruit.add("BlackBerryy");
		fruit.add("Avocado");
		fruit.add("BlurBerry");
		fruit.add("Cherry");
		fruit.add("Guava");
		fruit.add("JackFruit");
		fruit.add("Kiwi");
		fruit.add("Lemon");
		fruit.add("Mango");
		fruit.add("Orange");
		fruit.add("PineApple");
		fruit.add("StrawBerry");
		fruit.add("Gooseberry");
		fruit.add("BilBerry");
		fruit.add("CloudBerry");
		fruit.add("HoneyBerry");
		fruit.add("Lychee");
		fruit.add("MuskMelon");
		fruit.add("Papaya");
		fruit.add("PineBerry");
		fruit.add("RaspBerry");

		Collection<String> newfruits = new ArrayList<String>();
		fruit.forEach(e -> {
			newfruits.add(e.toUpperCase());
			System.out.println(e);
		});

		System.out.println("--------------fruits in upper case------------");
		for (String string : newfruits) {

			System.out.println(string);
		}

		System.out.println("---------------fruit name is less than 5 letter------------------");
		newfruits.stream().filter(e -> e.length() < 5).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("-------------fruits name is greter 5 letter-------------------------");
		newfruits.stream().filter(e -> e.length() > 5).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("--------------fruits name is in between 10 and 15 letters------------- ");
		newfruits.stream().filter(e -> e.length() > 10 && e.length() < 15).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
	}
}