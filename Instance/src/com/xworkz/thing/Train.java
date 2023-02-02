package com.xworkz.thing;

public class Train {

	
	public String type;
	public String material;
	public int capacity;
	public double cost;
	public double weight;
	public int speed;
	public int height;
	public double length;
	
	
	public Train() {
	System.out.println("Train with no arguements");
	}
	
	public Train(String arg) {
		type=arg;
	}
	
	public Train(int arg) {
		capacity=arg;
	}
	
	public Train(String arg1,int arg2) {
		type=arg1;
		capacity=arg2;		
	}
	
	public Train(int arg1,double arg2) {
		height=arg1;
		length=arg2;
	}
	
	public Train(int arg1,int arg2,double arg3) {
	    speed=arg1;
		height=arg2;
		length=arg3;
	}
	public Train(double arg1,int arg2,int arg3) {
		cost=arg1;
		speed=arg2;
		height=arg3;
	}
	
	public Train(int arg1,double arg2,double arg3) {
		height=arg1;
		cost=arg2;
		length=arg3;
	}
	
	public Train(String arg1,int arg2,double arg3) {
		material=arg1;
		capacity=arg2;
		weight=arg3;
	}
	
	public void display() {
		
		System.out.println("type:"+type);
		System.out.println("material:"+type);
		System.out.println("capacity:"+capacity);
		System.out.println("cost:"+cost);
		System.out.println("weight in kg:"+weight);
		System.out.println("speed in km/h:"+speed);
		System.out.println("heightin mm:"+height);
		System.out.println("length in m:"+length);
	}
	  
	
}
