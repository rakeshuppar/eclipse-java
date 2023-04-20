package com.xworkz.call.map;

import java.util.HashMap;
import java.util.Map;

public class SoftwareDetailsRunner {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("Name", "Notepad++");
		map.put("Type", "Shortcut");
		map.put("Folder Path", "C-ProgramaData");
		map.put("Size", "877bytes");
		map.put("Date Created", "06/01/2023");
		map.put("Date Modified", "06/01/2023");
		map.put("Attributes", "A");
		map.put("Availablity", "Available Offline");
		map.put("Owner", "Administrators");
		map.put("Computer", "DESKTOP-N9IC6S4(this PC)");

		System.out.println("get value of index 1");
		System.out.println(map.get("Name"));

		System.out.println("get keys only");
		System.out.println(map.keySet());

		System.out.println("get values only");
		System.out.println(map.values());

		System.out.println("remove Available Offline at index Availablity ");

		map.remove("Availablity", "Available Offline");
		System.out.println(map);

		System.out.println("replace 877bytes to 4kb at index size ");

		map.replace("size", "4kb");
		System.out.println(map);

		System.out.println("replace old value TajMahal to Nirma at Iindex Owner");

		map.replace("Owner", "Administrators", "Admin");
		System.out.println(map);
	}

}
