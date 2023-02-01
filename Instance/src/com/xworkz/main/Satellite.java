package com.xworkz.main;

public class Satellite {
	
	
	public String name;
	public String missionType;
	public String operator;
	public int weight;
	public int power;
	public String rocket;
	public String launchSite;
	public String referanceSystem;
	public String regime;
	public int perigeeAttitude;
	public int apogeeAttitude;
	public float inclination;
	public float period;
	public String launchBy;
	public int launchYear;
	public int lastcontactYear;
	public float spacecraftDiameter;
	public int decayYear;
	
	public void display() {
		

		System.out.println("Starting Display");
		System.out.println(name);
		System.out.println(missionType);
		System.out.println(operator);
		System.out.println(weight);
		System.out.println(power);
		System.out.println(rocket);
		System.out.println(launchSite);
		System.out.println(referanceSystem);
		System.out.println(regime);
		System.out.println(perigeeAttitude);
		System.out.println(apogeeAttitude);
		System.out.println(inclination);
		System.out.println(period);
		System.out.println(launchBy);
		System.out.println(launchYear);
		System.out.println(lastcontactYear);
		System.out.println(spacecraftDiameter);
		System.out.println(decayYear);
		System.out.println("Ending Display");
	}

}
