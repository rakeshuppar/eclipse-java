package com.xworkz.boot;

import com.xworkz.things.Cricket;
import com.xworkz.things.ODICricket;
import com.xworkz.things.Sport;
import com.xworkz.things.T20Cricket;
import com.xworkz.things.TestCrickt;

public class SportRunner {

	public static void main(String[] args) {

		Sport sport = new Sport();
		int total = sport.gettotal();
		System.out.println("total sports:" + total);

		System.out.println("-----------------------------------------------");

		Cricket cricket = new Cricket();
		cricket.gettotal();
		String team = cricket.getCountry();
		System.out.println("Country is:" + team);
		String Coach = cricket.getCoachName();
		System.out.println("Cricket Coach name is:" + Coach);

		System.out.println("------------------------------------------------");

		TestCrickt cricket1 = new TestCrickt();
		cricket1.gettotal();
		cricket1.getCountry();
		cricket1.getCoachName();
		String captain = cricket1.getCaptainName();
		System.out.println("Test Cricket captain is:" + captain);

		System.out.println("------------------------------------------------");

		ODICricket cricket3 = new ODICricket();
		cricket3.gettotal();
		cricket3.getCoachName();
		cricket3.getCountry();
		String groundName = cricket3.getGroundName();
		System.out.println("ODI Ground name is:" + groundName);

		System.out.println("-------------------------------------------------");

		T20Cricket cricket4 = new T20Cricket();
		cricket4.gettotal();
		cricket4.getCountry();
		cricket4.getCoachName();
		cricket4.getGroundName();
		String sponser = cricket4.getSponserName();
		System.out.println("Sponser for T20Cricket:" + sponser);
	}

}
