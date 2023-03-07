package com.xworkz.boot.equalRunner;

import com.xworkz.things.equal.Tv;

public class Tvrunner {

	public static void main(String[] args) {

		Tv tv = new Tv("BPL", 12000, 26.0d);
		System.out.println(tv.toString());
		System.out.println(tv.equals(tv));

		Tv tv2 = new Tv("LG", 15000, 28.0d);
		System.out.println(tv2.toString());
		System.out.println(tv.equals(tv2));

	}

}
