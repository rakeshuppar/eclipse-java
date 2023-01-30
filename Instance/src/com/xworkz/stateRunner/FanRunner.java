package com.xworkz.stateRunner;
import com.xworkz.state.Fan;

public class FanRunner {

	public static void main(String[] args) {
		
		Fan ref=new Fan();
		 
		 System.out.println("numofBlades:"+ref.numofBlades);
		 System.out.println("rpm:"+ref.rpm);
		 System.out.println("technology:"+ref.technology);
		 
		 ref.numofBlades=3;
		 System.out.println("numofBlades:"+ref.numofBlades);
		 
		 ref.rpm=350;
		 System.out.println("rpm:"+ref.rpm);
		 
		 ref.technology="induction";
		 System.out.println("technolgy:"+ref.technology);
		 
		 

	}

}
