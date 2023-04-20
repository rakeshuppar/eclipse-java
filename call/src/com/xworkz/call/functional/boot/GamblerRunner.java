package com.xworkz.call.functional.boot;

import com.xworkz.call.functional.interfaces.Gambler;
import com.xworkz.call.functional.util.GamblerUtil;

public class GamblerRunner {

	public static void main(String[] args) {

		Gambler gambler = (arg) -> {
			System.out.println("running functional method by explicit:" + arg);
			if (arg > 500 && arg < 1000) {
				return 0;
			} else if (arg > 1000) {
				return 100;
			}
			return arg;

		};
		System.out.println(GamblerUtil.test(gambler));

		System.out.println("-------------------------------------");

		GamblerUtil.test((arg1) -> {
			System.out.println("running functional method by implicit:" + arg1);
			if (arg1 > 500 && arg1 < 1000) {
				return 0;
			} else if (arg1 > 1000) {
				return 100;
			}
			return arg1;
		});
	}
}