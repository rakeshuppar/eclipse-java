package com.xworks.Rules.boot;

import com.xworks.Rules.link.OfficeRules;
import com.xworks.Rules.link.Rakesh;

public class OfficeRunner {

	public static void main(String[] args) {

		OfficeRules rules = new Rakesh();
		double rule = rules.loginTime();
		System.out.println("logintime:" + rule);

		boolean code = rules.dressCode();
		System.out.println("dresscode:" + code);

		boolean hours = rules.minHours();
		System.out.println("minimumhours:" + hours);
		System.out.println(".......................................");

		Rakesh rakesh = new Rakesh();
		double rule1 = rakesh.loginTime();
		System.out.println(rule1);

		boolean code1 = rakesh.dressCode();
		System.out.println(code1);

		boolean hours1 = rakesh.minHours();
		System.out.println(hours1);

		System.out.println(rules.equals(rakesh));
		System.out.println(rakesh.hashCode());

	}

}
