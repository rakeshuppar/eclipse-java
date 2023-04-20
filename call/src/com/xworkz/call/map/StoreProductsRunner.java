package com.xworkz.call.map;

import java.util.HashMap;
import java.util.Map;

public class StoreProductsRunner {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Salt");
		map.put(2, "Boost");
		map.put(3, "Surfexcel");
		map.put(4, "Pears");
		map.put(5, "Dove");
		map.put(6, "Lux");
		map.put(7, "RedLebel");
		map.put(8, "Horlicks");
		map.put(9, "TajMahal");
		map.put(10, "Rin");

		System.out.println("get value of index 1");
		System.out.println(map.get(1));

		System.out.println("get keys only");
		System.out.println(map.keySet());

		System.out.println("get values only");
		System.out.println(map.values());

		System.out.println("remove Horlicks at index 8 ");

		map.remove(8, "Horlicks");
		System.out.println(map);

		System.out.println("replace RedLebel to Maggi at index 7 ");

		map.replace(7, "Maggi");
		System.out.println(map);

		System.out.println("replace old value TajMahal to Nirma at Iindex 9");

		map.replace(9, "TajMahal", "Nirma");
		System.out.println(map);

	}

}
