package com.xworks.Rules.things;

public abstract class AbstractInfo extends Developer {

	private String createdBy;

	private String updatedBy;

	public String setCreatedBy(String createdBy) {
		return "SunMicrosystem";
	}

	public String setUpdatedBy(String updatedBy) {
		return "Oracle";
	}

	@Override
	boolean followStandards() {
		return true;
	}

	@Override
	boolean understandingConcepts() {
		return true;
	}
}
