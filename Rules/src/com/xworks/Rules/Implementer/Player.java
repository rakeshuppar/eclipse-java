package com.xworks.Rules.Implementer;

import com.xworks.Rules.Game.CricketRule;

public class Player implements CricketRule {

	public Player() {
		System.out.println("no arg constructer in Player");
	}

@Override 
	public boolean shouldbeCaptain() {
		return true;
	}


	@Override
	public int numPlayersshouldbe() {
		return 11;
	}

	}

