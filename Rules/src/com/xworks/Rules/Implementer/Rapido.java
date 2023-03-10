package com.xworks.Rules.Implementer;

import com.xworks.Rules.Game.Delivery;

public class Rapido implements Delivery {

	@Override
	public double charges() {
		return 80;
	}

	@Override
	public double timeTaken() {
		return 40;
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
