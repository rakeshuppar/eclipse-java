package com.xworks.Rules.link;

public class People implements PubRules {

	public People() {
		System.out.println("no arg constructor in people");
	}

	@Override
	public boolean dressCode() {
		System.out.println("running dresscode");
		return true;
	}

	@Override
	public double closingTime() {
		System.out.println("running Closing Time");
		return 11.30d;
	}

	@Override
	public boolean tips() {
		System.out.println("running tips");

		return true;
	}

	@Override
	public int age() {
		System.out.println("running age");
		return 18;
	}

	@Override
	public boolean alone() {
		System.out.println("running alone");
		return false;
	}

	@Override
	public String toString() {
		System.out.println("running to string in people");
		return true + "11.30d" + true + 18 + false;
	}

}
