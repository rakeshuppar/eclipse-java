package com.xworkz.call.functional.boot;

import com.xworkz.call.functional.interfaces.Hunter;
import com.xworkz.call.functional.util.Util;

public class Runner {

	public static void main(String[] args) {

		// implicibe
		Util.test((arg) -> {
			System.out.println("running function method by implicit:" + arg);
			System.out.println(arg.toLowerCase());
		});

		System.out.println("--------------------------------------------");

		Util.test((arg) -> {
			System.out.println("running function method by implicit:" + arg);
			System.out.println(arg.toUpperCase());
		});

		System.out.println("--------------------------------------------");

		// explicit
		Hunter hunter1 = (arg1) -> {
			System.out.println("running functional method by explicit:" + arg1);
		};

		Util.test(hunter1);
	}

}
