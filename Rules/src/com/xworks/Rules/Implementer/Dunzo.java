package com.xworks.Rules.Implementer;

import com.xworks.Rules.Game.Delivery;

public class Dunzo implements Delivery {

	@Override
	public double charges() {

		return 31;
	}

	@Override
	public double timeTaken() {

		return 28;
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
			return "Shivu";
		}

		return null;
	}

}
