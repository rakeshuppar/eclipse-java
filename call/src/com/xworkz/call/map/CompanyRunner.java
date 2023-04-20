package com.xworkz.call.map;

import java.util.HashMap;
import java.util.Map;

public class CompanyRunner {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "TCS");
		map.put(2, "Infosys");
		map.put(3, "Wipro");
		map.put(4, "HCL");
		map.put(5, "Tech Mahindra");
		map.put(6, "L&T");
		map.put(7, "MindTree");
		map.put(8, "Mphasis");
		map.put(9, "Oracle");
		map.put(10, "Cognizant");

		System.out.println("get value of index 1");
		System.out.println(map.get(1));

		System.out.println("get keys only");
		System.out.println(map.keySet());

		System.out.println("get values only");
		System.out.println(map.values());

		System.out.println("remove Mphasis at index 8 ");

		map.remove(8, "Mphasis");
		System.out.println(map);

		System.out.println("replace MindTree to Larsen&Toubro at index 7 ");

		map.replace(7, "Larsen&Toubro");
		System.out.println(map);

		System.out.println("replace old value Oracle  to Cyient at Iindex 9");

		map.replace(9, "Oracle", "Cyient");
		System.out.println(map);

	}

}
