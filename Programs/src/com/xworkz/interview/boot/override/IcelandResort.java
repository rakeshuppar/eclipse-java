package com.xworkz.interview.boot.override;

public class IcelandResort extends Resort {

	public IcelandResort() {
		System.out.println("calling IcelandResort with no arg constructor");
	}

	@Override
	public String Name() {
		return "Vasavi";
	}

	@Override
	public String Id() {
		return "pan";
	}

	@Override
	public String OwnerName() {
		return "Rama";
	}

	@Override
	public long MobileNumber() {
		return 789269;
	}

}
