package com.xworkz.boot.equalRunner;

import com.xworkz.boot.equal.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {

		PoliceStation station = new PoliceStation("malleshwaram", 4, 2, 3, 6, 4, true, 6, 10, true);
		System.out.println(station.toString());
		System.out.println(station.equals(station));

		PoliceStation station1 = new PoliceStation("upparapete", 2, 5, 4, 4, 5, false, 4, 15, false);
		System.out.println(station1.toString());
		System.out.println(station.equals(station1));

	}

}
