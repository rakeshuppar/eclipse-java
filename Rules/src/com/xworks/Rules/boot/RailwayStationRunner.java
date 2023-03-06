package com.xworks.Rules.boot;

import com.xworks.Rules.link.Passenger;
import com.xworks.Rules.link.RailwayStation;

public class RailwayStationRunner {

	public static void main(String[] args) {

		RailwayStation station = new Passenger();
		boolean sound = station.loudSound();
		System.out.println("loud Sound:" + sound);
		int luggage = station.limtLuggage();
		System.out.println("limitLuggare:" + luggage);
		String sleep = station.middlebirthSleep();
		System.out.println("middlebirthSleep:" + sleep);
		boolean pulling = station.chainPulling();
		System.out.println("chainPulling:" + pulling);
		int interact = station.limitgroupInteract();
		System.out.println("limitgroupInteract:" + interact);
		boolean list = station.waitingList();
		System.out.println("waitinglist:" + list);
		boolean smoke = station.smoke();
		System.out.println("smoke:" + smoke);
		boolean alcohol = station.drinksAlcohol();
		System.out.println("drinksAlchohal:" + alcohol);

		System.out.println("---------------------------");

		Passenger pass = new Passenger();
		boolean sound1 = pass.loudSound();
		System.out.println(sound1);
		int luggage1 = pass.limtLuggage();
		System.out.println(luggage1);
		String sleep1 = pass.middlebirthSleep();
		System.out.println(sleep1);
		boolean pulling1 = pass.chainPulling();
		System.out.println(pulling1);
		int interact1 = pass.limitgroupInteract();
		System.out.println(interact1);
		boolean list1 = pass.waitingList();
		System.out.println(list1);
		boolean smoke1 = pass.smoke();
		System.out.println(smoke1);
		boolean alcohol1 = pass.drinksAlcohol();
		System.out.println(alcohol1);

		System.out.println(station.equals(pass));
		System.out.println(station.hashCode());

	}

}
