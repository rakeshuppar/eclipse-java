package com.xworkz.call.functional.boot;

import com.xworkz.call.functional.interfaces.Eater;
import com.xworkz.call.functional.util.EatUtil;

public class EatRunner {

	public static void main(String[] args) {

		Eater eater = (arg1, arg2) -> {
			System.out.println("running fuctional method by explicit:" + arg1);
			return null;
		};
		System.out.println(eater);

		System.out.println("------------------------------");

		Eater eater1 = (arg1, arg2) -> {
			System.out.println("running fuctional method by explicit:" + arg1.toLowerCase());
			return null;
		};
		EatUtil.test(eater1);

		System.out.println("------------------------------");

		Eater eater2 = (arg1, arg2) -> {
			System.out.println("running fuctional method by explicit:" + arg1.toUpperCase());
			return null;
		};
		EatUtil.test(eater2);

		System.out.println("==========================================");

		EatUtil.test((arg1, arg2) -> {
			System.out.println("running functional method by implicit:" + arg1 + arg2);
			return arg1 + arg2;
		});

	}
}
