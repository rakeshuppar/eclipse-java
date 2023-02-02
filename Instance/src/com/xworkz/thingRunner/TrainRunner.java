package com.xworkz.thingRunner;

import com.xworkz.thing.Train;

public class TrainRunner {

	public static void main(String[] args) {
		
		Train train=new Train();
		train.display();
		
		Train train1=new Train("express");
		train1.display();
		
	    Train train2=new Train(300);
		train2.display();
		
		Train train3=new Train("express",300);
		train3.display();
		
		Train train4=new Train(172,650.0d);
		train4.display();
		
		Train train5=new Train(350,172,650.0d);
		train5.display();
		
		Train train6=new Train(60000000.0d,350,172);
		train6.display();
		
		Train train7=new Train(172,60000000.0d,650.0d);
		train7.display();
		
		Train train8=new Train("iron",300,1128000.0d);
		train8.display();

	}

}
