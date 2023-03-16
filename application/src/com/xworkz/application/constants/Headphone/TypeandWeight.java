package com.xworkz.application.constants.Headphone;

public enum TypeandWeight {

	OVER_EAR(3.66), ON_EAR(4.66), EARBUDS(3.66), IN_EAR(1.66);

	private final double weight;

	private TypeandWeight(double weight) {
		this.weight = weight;
	}

	double getWeight() {
		return weight;
	}

}
