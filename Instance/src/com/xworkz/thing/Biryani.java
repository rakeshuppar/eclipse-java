package com.xworkz.thing;

public class Biryani{
	
	public String type;
	public boolean veg;
	public int cost;
	public String course;
	public String servingTemperature;
	public boolean spicy;
	public boolean taste;
	public String from;
    public boolean goodforHealth;
    public String popularIn;
    public int calories;
    public float fat;
    public int sodium;
    public float sugar;
    public float protein;
    
    public Biryani() {
    	System.out.println("Biriyani with no arguements");
    }
    
    public Biryani(String arg){
      type=arg;
    }
    
    public Biryani(boolean arg) {
      veg=arg;
    }
    
    public Biryani(String arg1,boolean arg2) {
     type=arg1;
     veg=arg2;
    }
    
    public Biryani(int arg1,float arg2,float arg3) {
     sodium=arg1;
     sugar=arg2;
     protein=arg3;
     }
    
    public Biryani(float arg1,float arg2,float arg3) {
    	fat=arg1;
    	protein=arg2;
    	sugar=arg3;
      }
    public Biryani(boolean arg1,boolean arg2,boolean arg3) {
    	spicy=arg1;
    	taste=arg2;
    	goodforHealth=arg3;
    }
    public Biryani(int arg1,int arg2,int arg3) {
    	cost=arg1;
    	calories=arg2;
    	sodium=arg3;
    }
    
    public Biryani(String arg1,int arg2) {
    	type=arg1;
    	cost=arg2;
    }
    public Biryani(int arg1,String arg2) {
    	cost=arg1;
    	type=arg2;
    }
    
    public Biryani(float arg1,float arg2,int arg3) {
    	fat=arg1;
    	sugar=arg2;
    	calories=arg3;
    }
    public Biryani(float arg1,float arg2) {
    	fat=arg1;
    	sugar=arg2;
    }
    public Biryani(int arg1,float arg2) {
    	cost=arg1;
    	fat=arg2;
    }
    public Biryani(float arg1,int arg2) {
    	fat=arg1;
    	cost=arg2;
    }
    public Biryani(int arg1,int arg2) {
    	cost=arg1;
    	calories=arg2;
    }
    public Biryani(String arg1,String arg2) {
    	type=arg1;
    	from=arg2;
    }
    
    public void display() {
    	
    	System.out.println("type:"+type);
    	System.out.println("veg:"+veg);
    	System.out.println("cost:"+cost);
    	System.out.println("course:"+course);
    	System.out.println("servingTemperature:"+servingTemperature);
    	System.out.println("spicy:"+spicy);
    	System.out.println("taste:"+taste);
    	System.out.println("from:"+from);
    	System.out.println("goodforHealth:"+goodforHealth);
    	System.out.println("popularIn:"+popularIn);
    	System.out.println("calories in cal:"+calories);
    	System.out.println("fat in g:"+fat);
    	System.out.println("sodium in g:"+sodium);
    	System.out.println("sugar in g:"+sugar);
    	System.out.println("protein in g:"+protein);
    	
    }
}