package com.xworkz.call.functional.boot;

import com.xworkz.call.functional.interfaces.Runner;
import com.xworkz.call.functional.util.RunnerUtil;

public class RunRunner {

	public static void main(String[] args) {

		Runner runner = (arg) -> {
			System.out.println("running functional method by explicit:" + arg);
			return 0;
		};
		RunnerUtil.test(runner);

		System.out.println("---------------------------------------");

		RunnerUtil.test((arg) -> {
			System.out.println("running function method by implicit:" + arg);
			return arg;
		});

	}

}
