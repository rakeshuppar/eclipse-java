package com.xworks.Rules.things;

public abstract class AbstractInfo {

	private String createdBy;

	private String updatedBy;

	public AbstractInfo() {
		System.out.println("calling AbstactInfo with no arg constructor");
	}

	public AbstractInfo(String createdBy, String updatedBy) {
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		System.out.println("calling tostring in Abstact info");
		return "SunMicrosystem" + " Oracle";
	}

}
