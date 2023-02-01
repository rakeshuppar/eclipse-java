package com.xworkz.mainRunner;
import com.xworkz.main.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		
		Satellite ref=new Satellite();
		
		ref.name="aryabhata";
		ref.missionType="atrophysics";
		ref.operator="isro";
	    ref.weight=360;
		ref.power=46;
		ref.rocket="kosmos-3m";
		ref.launchSite="kapustinyar";
		ref.referanceSystem="grocentric";
        ref.regime="lowEarth";
		ref.perigeeAttitude=563;
	    ref.apogeeAttitude=619;
	    ref.inclination=50.7f;
	    ref.period=96.46f;
		ref.launchBy="sovi";
	    ref.launchYear=1975;
	    ref.lastcontactYear=1981;
		ref.spacecraftDiameter=1.4f;
		ref.decayYear=1992;
		
		Satellite ref1=new Satellite();
		ref.display();
	
		
	}

}
