package com.xworkz.thing;

public class Frenchfry {
	
	
	public String name;
	public int cost;
	public String servingTemperature;
	public String type;
	public String anotherName;
	public char size;
	public String standardSize;
    public int weight;
    public String course;
    public String originCountry;
  
    
    
    public Frenchfry() {
    	System.out.println("Frenchfry with no arguements");
    }
    
    public Frenchfry(String arg) {
    	name=arg;
    }
    public Frenchfry(int arg) {
    	cost=arg;
    }
    public Frenchfry(String arg1,int arg2) {
    	name=arg1;
    	cost=arg2;
    }
    public Frenchfry(int arg1,String arg2) {
    	cost=arg1;
    	name=arg2;
    }
    public Frenchfry(String arg1,String arg2,String arg3) {
    	servingTemperature=arg1;
    	type=arg2;
    	anotherName=arg3;
    }
    public Frenchfry(String arg1,String arg2,char arg3) {
    	type=arg1;
    	anotherName=arg2;
    	size=arg3;
    }
    public Frenchfry(String arg1,char arg2,String arg3) {
    	anotherName=arg1;
    	size=arg2;
    	standardSize=arg3;
    }
    
    public Frenchfry(char arg1,String arg2,int arg3) {
    	size=arg1;
    	standardSize=arg2;
    	weight=arg3;
    }
    public Frenchfry(String arg1,String arg2,int arg3) {
    	originCountry=arg1;
    	course=arg2;
    	weight=arg3;
    }
    
    public Frenchfry(int arg1,int arg2) {
    	weight=arg1;
    	cost=arg2;
    }
    
    public void display() {
    	
    	System.out.println("name:"+name);
    	System.out.println("cost:"+cost);
    	System.out.println("servingTemperature:"+servingTemperature);
    	System.out.println("type:"+type);
    	System.out.println("anotherName:"+anotherName);
    	System.out.println("size:"+size);
    	System.out.println("standardSize:"+standardSize);
    	System.out.println("weight in mg:"+weight);
    	System.out.println("course:"+course);
    	System.out.println("originCountry:"+originCountry);
    }
    
    
}
