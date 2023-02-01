package com.xworkz.mainRunner;
import com.xworkz.main.Flight;

public class FlightRunner {

	public static void main(String[] args) {
	
		
		
		   Flight ref =new Flight(); 
		   
		   ref.name="airasiaAirlines";
		   ref.numofDestination=400;
		   ref.headQuarter="malaysia";
		   ref.numofWheels=3;
		   ref.revenue=1840000000D;
		   ref.netIncome=2850000000D;
		   ref.ceo="tony fernandes";
		   ref.capacity=200;
		   ref.cost=10000;
		   ref.type="domestic";
		   
		   
		
		   
		   Flight ref1=new Flight();
		   
		   ref.display();
		   
		   
		   
  }

}
