package com.xworks.Rules.link;

public class Passenger implements RailwayStation {

	public Passenger() {
		System.out.println("calling Passenger with no arguement constructor");
	}

	@Override
	public boolean loudSound() {
		System.out.println("running loudSound in Railwaystation");
		return false;
	}

	@Override
	public int limtLuggage() {
		System.out.println("running limtit to carry Luggage in Railwaystation");
		return 70;
	}

	@Override
	public String middlebirthSleep() {
		System.out.println("running middleBirth Sleeping only in Railwaystation");
		return "10pm to 6am";
	}

	@Override
	public boolean chainPulling() {
		System.out.println("running chainpulling for some reasons in Railwaystation");
		return true;
	}

	@Override
	public int limitgroupInteract() {
		System.out.println("running limit to group interact in Railwaystation");
		return 10;
	}

	@Override
	public boolean waitingList() {
		System.out.println("running waitinglist in Railwaystation");
		return true;
	}

	@Override
	public boolean smoke() {
		System.out.println("running smoke in Railwaystation");
		return false;
	}

	@Override
	public boolean drinksAlcohol() {
		System.out.println("running drinks Alcohol in Railwaystation");
		return false;
	}

}
