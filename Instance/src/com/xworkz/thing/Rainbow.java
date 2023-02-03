package com.xworkz.thing;

public class Rainbow {
	
	public int numColours;
	public String occure;
    public String shape;
    public String types;
    public boolean natural;
    public String rareRainbow;
    public String oldestColour;
    
    
    
    public Rainbow(int numColours,String occure,String shape,String types,boolean natural,String rareRainbow,String oldestColour) {
    	
    	this.numColours=numColours;
    	this.occure=occure;
    	this.shape=shape;
    	this.types=types;
    	this.natural=natural;
    	this.rareRainbow=rareRainbow;
    	this.oldestColour=oldestColour;
    }
    
    
    public void display() {
    	
    	System.out.println("numColours:"+this.numColours);
    	System.out.println("occure:"+this.occure);
    	System.out.println("shape:"+this.shape);
    	System.out.println("type:"+this.types);
    	System.out.println("natural:"+this.natural);
    	System.out.println("rareRainbow:"+this.rareRainbow);
    	System.out.println("oldestColur:"+this.oldestColour);
    }
    
    
}
