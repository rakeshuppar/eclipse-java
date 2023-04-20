package com.xworkz.call.map;

import java.util.HashMap;
import java.util.Map;

public class SoftwareCoursesRunner {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "Phython");
		map.put(3, "C");
		map.put(4, "C++");
		map.put(5, "Web Technolgy");
		map.put(6, "AI");
		map.put(7, "Data Analytics");
		map.put(8, "Devops");
		map.put(9, "DBA");
		map.put(10, "Cyber Security");

		System.out.println("get value of index 1");
		System.out.println(map.get(1));

		System.out.println("get keys only");
		System.out.println(map.keySet());

		System.out.println("get values only");
		System.out.println(map.values());

		System.out.println("remove Devops at index 8 ");

		map.remove(8, "Devops");
		System.out.println(map);

		System.out.println("replace Data Analytics to Augmentes Analytics at index 7 ");

		map.replace(7, "Augmentes Analytics");
		System.out.println(map);

		System.out.println("replace old value VR Banglore to Nehru Mall at Iindex 9");

		map.replace(9, "DBA", "SQT");
		System.out.println(map);

		
	}

}
