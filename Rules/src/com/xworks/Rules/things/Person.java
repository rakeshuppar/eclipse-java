package com.xworks.Rules.things;

public class Person implements PassportRule, DubaiVisaRule {

	public Person() {
		System.out.println("calling person with no arg constructor");
	}

	@Override
	public String citizen() {
		return "indian";
	}

	@Override
	public String criminalRecord() {
		return "few";
	}

	@Override
	public String jail() {
		return "Ballari";
	}

	@Override
	public double minAmount() {
		return 50000;
	}

	@Override
	public boolean stayingHotel() {
		return true;
	}

	@Override
	public int maxgoldLimit() {
		return 50;

	}

	public boolean followStandards() {
		return true;
	}

	public boolean understandingConcepts() {
		return true;
	}

}
