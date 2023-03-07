package com.xworkz.boot.equalRunner;

import com.xworkz.things.equal.Alcohal;

public class AlcohalRunner {

	public static void main(String[] args) {

		Alcohal alcohal = new Alcohal("kingfisher", 60.0d, 90, "Beer");
		System.out.println(alcohal.toString());
		System.out.println(alcohal.equals(alcohal));

		Alcohal alcohal1 = new Alcohal("OldMonk", 42.5d, 250, "Rum");
		System.out.println(alcohal1.toString());
		System.out.println(alcohal.equals(alcohal1));

	}

}
