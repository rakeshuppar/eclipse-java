package com.xworkz.thingRunner;
import com.xworkz.thing.Frenchfry;

public class FrenchfryRunner {

	public static void main(String[] args) {
		
	 Frenchfry frenchfry=new Frenchfry();
	 frenchfry.display();

	 Frenchfry frenchfry1=new Frenchfry("frenchfry");
	 frenchfry1.display();
	  
	 Frenchfry frenchfry2=new Frenchfry(100);
	 frenchfry2.display();
	  
	 Frenchfry frenchfry3=new Frenchfry("frenchfry",100);
	 frenchfry3.display();
	 
	 Frenchfry frenchfry4=new Frenchfry(100,"frenchfry");
	 frenchfry4.display();
	 
	 Frenchfry frenchfry5=new Frenchfry("hot","air fried fries","finger chips");
	 frenchfry5.display();
	 
	 Frenchfry frenchfry6=new Frenchfry("air fried fries","finger chips",'m');
	 frenchfry6.display();
	 
	 Frenchfry frenchfry7=new Frenchfry("finger chips",'m',"10*10");
	 frenchfry7.display();
	 
	 Frenchfry frenchfry8=new Frenchfry('m',"10*10",114);
	 frenchfry8.display();
	 
	 Frenchfry frenchfry9=new Frenchfry("belgium","snack",114);
	 frenchfry9.display();
	 
	 Frenchfry frenchfry10=new Frenchfry(114,100);
	 frenchfry10.display();
	}
	
}
