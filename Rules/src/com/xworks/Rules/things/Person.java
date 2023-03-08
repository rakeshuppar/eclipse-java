package com.xworks.Rules.things;

public class Person extends AbstractInfo implements PassportRule, Developer, DubaiVisaRule {

	public Person() {
		System.out.println("calling person with no arg constructor");
	}

	@Override
	public boolean followStandards() {
		return true;
	}

	@Override
	public boolean understandingConcepts() {
		return true;
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

}
