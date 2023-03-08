package com.xworks.Rules.Runner;

import com.xworks.Rules.things.Person;

public class PersonRunner {

	public static void main(String[] args) {

		Person person = new Person();
		String citi = person.citizen();
		System.out.println("citizen:" + citi);

		String record = person.criminalRecord();
		System.out.println("criminal record:" + record);

		String jai = person.jail();
		System.out.println("jail:" + jai);

		double amount = person.minAmount();
		System.out.println("minimum Amount:" + amount);

		boolean hotel = person.stayingHotel();
		System.out.println("staying Hotel:" + hotel);

		int gold = person.maxgoldLimit();
		System.out.println("maximum Goldlimit:" + gold);

		boolean follow = person.followStandards();
		System.out.println("follow Standard:" + follow);

		boolean under = person.understandingConcepts();
		System.out.println("understand Concept:" + under);

		System.out.println(person.toString());

		System.out.println("=============================");

	}

}
