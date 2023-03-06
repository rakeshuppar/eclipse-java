package com.xworks.Rules.boot;

import com.xworks.Rules.link.People;
import com.xworks.Rules.link.PubRules;

public class PubRunner {

	public static void main(String[] args) {

		PubRules rules = new People();
		int age = rules.age();
		System.out.println("age:" + age);
		boolean alone = rules.alone();
		System.out.println("alone:" + alone);
		double time = rules.closingTime();
		System.out.println("closingTime:" + time);
		boolean code = rules.dressCode();
		System.out.println("dresscode:" + code);
		boolean tip = rules.tips();
		System.out.println("tips:" + tip);

		System.out.println("-------------------------");

		People p = new People();
		int age1 = p.age();
		System.out.println(age1);
		boolean alone1 = p.alone();
		System.out.println(alone1);
		double time1 = p.closingTime();
		System.out.println(time1);
		boolean code1 = p.dressCode();
		System.out.println(code1);
		boolean tip1 = p.tips();
		System.out.println(tip1);

		System.out.println(rules.equals(p));
		System.out.println(rules.hashCode());

	}

}
