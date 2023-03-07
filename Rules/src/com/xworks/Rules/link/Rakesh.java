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
		return 10.30d;
	}

	@Override
	public boolean minHours() {
		System.out.println("running minhours");
		return false;
	}

	@Override
	public String toString() {
		System.out.println("running to string in Rakesh");
		return false + " 10.30d " + false;
	}
}