package com.xworkz.call.functional.boot;

import com.xworkz.call.functional.interfaces.Shooter;
import com.xworkz.call.functional.util.ShooterUtil;

public class ShooterRunner {
	public static void main(String[] args) {

		Shooter shooter = (arg) -> {
			System.out.println("running function method by exiplicit :" + arg);
			return false;
		};
		ShooterUtil.tests(shooter);

		System.out.println("---------------------------------------");

		ShooterUtil.tests((arg1) -> {
			System.out.println("running fuction method by implicit:" + arg1);
			return false;
		});
	}
}