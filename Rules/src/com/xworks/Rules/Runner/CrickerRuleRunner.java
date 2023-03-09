package com.xworks.Rules.Runner;

import com.xworks.Rules.Game.CricketRule;
import com.xworks.Rules.Implementer.Player;
import com.xworks.Rules.Usage.StreetCricket;

public class CrickerRuleRunner {

	public static void main(String[] args) {

		CricketRule rule = new Player();
		System.out.println("Captain:" + rule.captain());
		System.out.println("Team:" + rule.team());

		StreetCricket street = new StreetCricket(rule);
		System.out.println("Captain:" + street.cricketRule.captain());
		System.out.println("Team:" + street.cricketRule.team());

	}

}
