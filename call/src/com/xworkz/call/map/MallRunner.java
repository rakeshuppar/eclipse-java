package com.xworkz.call.map;

import java.util.HashMap;
import java.util.Map;

public class MallRunner {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Orion Mall");
		map.put(2, "UBCity");
		map.put(3, "Phoenix Marketcity");
		map.put(4, "The Forum Koramangala Mall");
		map.put(5, "Manti Square");
		map.put(6, "Bangalore Central Mall");
		map.put(7, "Garuda Mall");
		map.put(8, "Royal Meenakshi Mall");
		map.put(9, "VR Bangalore");
		map.put(10, "Vega City Mall");

		System.out.println("get value of index 1");
		System.out.println(map.get(1));

		System.out.println("get keys only");
		System.out.println(map.keySet());

		System.out.println("get values only");
		System.out.println(map.values());

		System.out.println("remove Royal Meenakshi Mall at index 8 ");

		map.remove(8, "Royal Meenakshi Mall");
		System.out.println(map);

		System.out.println("replace Garuda Mall to Gandhi mall at index 7 ");

		map.replace(7, "Gandhi Mall");
		System.out.println(map);

		System.out.println("replace old value VR Banglore to Nehru Mall at Iindex 9");

		map.replace(9, "VR Bangalore", "Neharu Mall");
		System.out.println(map);

	}

}
