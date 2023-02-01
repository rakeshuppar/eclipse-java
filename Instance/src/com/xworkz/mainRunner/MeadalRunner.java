package com.xworkz.mainRunner;

import com.xworkz.main.Medal;

public class MeadalRunner {

	public static void main(String[] args) {
		
		Medal ref=new Medal();
		
		
		ref.name="olympic";
		ref.types=3;
		ref.position=1;
		ref.size=2.5f;
	    ref.amount=50000000d;
	    ref.highestMedal="usa";
	    ref.shape="round";
		ref.thickness=3;
		ref.diameter=60;
		ref.weight=6;
		ref.colour="golden";
		ref.withTag=true;
		ref.givenBy="chiefGuest";
		ref.range="medium";
		
		Medal ref1=new Medal();
		
		ref.display();		
		
	}

}
