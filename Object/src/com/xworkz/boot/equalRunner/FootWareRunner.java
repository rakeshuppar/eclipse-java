package com.xworkz.boot.equalRunner;

import com.xworkz.boot.equal.FootWare;

public class FootWareRunner {

	public static void main(String[] args) {

		FootWare ware = new FootWare("Bata", 5, "rubber");
		System.out.println(ware.toString());
		System.out.println(ware.equals(ware));

		FootWare ware1 = new FootWare("Nike", 6, "leather");
		System.out.println(ware1.toString());
		System.out.println(ware.equals(ware1));

	}

}
