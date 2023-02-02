package com.xworkz.thing;

public class Message {
	
	public String type;
	public int numCharacter;
	public double from;
	public String sent;
	public float sizeBit;
	
	
	public Message() {
		System.out.println("Message with no arguements");
		}
	
	public Message(String arg) {
		type=arg;
	}
	
	public Message(int arg) {
		numCharacter=arg;
		
	}
	
	public Message(String arg1,float arg2) {
		type=arg1;
		sizeBit=arg2;
		}
	 
	public Message(String arg1,int arg2) {
		
		type=arg1;
		numCharacter=arg2;
	}
	
	public Message(String arg1,int arg2,float arg3) {
		
       type=arg1;
       numCharacter=arg2;
       sizeBit=arg3;
	}
	
	
	public void display() {
		
		System.out.println("type:"+type);
		System.out.println("numCharacter:"+numCharacter);
		System.out.println("from:"+from);
		System.out.println("sent:"+sent);
		System.out.println("sizeBit:"+sizeBit);
		
	}

}
