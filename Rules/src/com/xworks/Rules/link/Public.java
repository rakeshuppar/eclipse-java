package com.xworks.Rules.link;

public class Public implements HospitalRules {

	public Public() {
		System.out.println("calling Public with no arg constructor");
	}

	@Override
	public String noise() {
		System.out.println("running noise");
		return "avoid noise in Hospital";
	}

	@Override
	public String stay() {
		System.out.println("running stay");
		return "one member stay with Patient";
	}

	@Override
	public String park() {
		System.out.println("running park");
		return "park at parking area only";
	}

	@Override
	public int visitor() {
		System.out.println("running visitors");
		return 2;
	}

	@Override
	public int RestrictCallat() {
		System.out.println("running restrictCalls");
		return 9;
	}

	@Override
	public boolean smoke() {
		System.out.println("running smoke");
		return false;
	}

	@Override
	public boolean mask() {
		System.out.println("running mask");
		return true;
	}

	@Override
	public String spill() {
		System.out.println("running spill");
		return "Dont spill any liquid on floor";
	}

	@Override
	public double doctorRoundstime() {
		System.out.println("running doctorRounds");
		return 10.00;
	}

	@Override
	public String bags() {
		System.out.println("running noise");
		return "Plastic bags are not allowed";
	}

	@Override
	public String toString() {
		System.out.println("running to string in public");
		return "avoid noise in Hospital" + "one member stay with Patient" + "park at parking area only" + 2 + 9 + false
				+ true + "Dont spill any liquid on floor" + 10.00d + "Plastic bags are not allowed";
	}

}
