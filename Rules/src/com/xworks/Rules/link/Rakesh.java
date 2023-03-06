package com.xworks.Rules.link;

public class Rakesh implements OfficeRules {

	@Override
	public boolean dressCode() {
		System.out.println("running dresscode");
		return false;
	}

	@Override
	public double loginTime() {
		System.out.println("running logintime");
		return 10.30;
	}

	@Override
	public boolean minHours() {
		System.out.println("running minhours");
		return false;
	}
}