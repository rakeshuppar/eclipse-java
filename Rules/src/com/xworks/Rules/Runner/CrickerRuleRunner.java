package com.xworks.Rules.Runner;

import com.xworks.Rules.Game.CricketRule;
import com.xworks.Rules.Implementer.Player;
import com.xworks.Rules.Usage.StreetCricket;

public class CrickerRuleRunner {

	public static void main(String[] args) {

		CricketRule rule = new Player();
		System.out.println("should be Captain:" + rule.shouldbeCaptain());
		System.out.println("Number of players:" + rule.numPlayersshouldbe());

		StreetCricket street = new StreetCricket(rule);
		System.out.println("should be Captain:" + street.cricketRule.shouldbeCaptain());
		System.out.println("Number of players:" + street.cricketRule.numPlayersshouldbe());

	}

}
