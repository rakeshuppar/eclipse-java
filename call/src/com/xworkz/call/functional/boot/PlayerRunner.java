package com.xworkz.call.functional.boot;

import com.xworkz.call.functional.interfaces.Player;
import com.xworkz.call.functional.util.PlayerUtil;

public class PlayerRunner {

	public static void main(String[] args) {

		Player player = (String arg1, String arg2) -> {
			System.out.println("running functional method by excplicit:" + arg1.toUpperCase());
			System.out.println("running functional method by excplicit:" + arg2.toUpperCase());
			System.out.println("player name:" + arg1 + " and " + "player belongs to:" + arg2);
			return null;
		};
		PlayerUtil.test(player);

		System.out.println("---------------------------------------------");

		PlayerUtil.test((arg1, arg2) -> {
			System.out.println("running functional method by implicit:" + arg1 + arg2);
			return arg1 + " " + arg2;
		});

	}
}
