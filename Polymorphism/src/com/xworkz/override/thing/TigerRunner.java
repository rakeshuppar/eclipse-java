package com.xworkz.override.thing;

import com.xworkz.override.boot.BengalTiger;
import com.xworkz.override.boot.Tiger;

public class TigerRunner {

	public static void main(String[] args) {

		Tiger tiger = new BengalTiger();
		String Tiger = tiger.Hunt();
		System.out.println("Hunt:" + Tiger);

	}

}
