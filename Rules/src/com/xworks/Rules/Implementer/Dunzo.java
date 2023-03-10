package com.xworks.Rules.Implementer;

import com.xworks.Rules.Game.Delivery;

public class Dunzo implements Delivery {
	public Dunzo() {
		System.out.println("Running Dunzo with no arg constructor");
	}

	@Override
	public double charges() {

		return 50;
	}

	@Override
	public double timeTaken() {

		return 30;
	}

	@Override
	public String agentName(int rating) {

		if (rating == 1) {
			return "Basavaraj";
		}
		if (rating == 2) {
			return "Dinakara";
		}
		if (rating == 3) {
			return "Kavan";
		}

		return null;
	}

}
