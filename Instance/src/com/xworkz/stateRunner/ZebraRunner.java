package com.xworkz.stateRunner;
import com.xworkz.state.Zebra;

public class ZebraRunner {

	public static void main(String[] args) {
		
		
		Zebra ref=new Zebra();
		
		System.out.println("lifeSpan:"+ref.lifeSpan);
		System.out.println("height:"+ref.height);
		System.out.println("herbivore:"+ref.herbivore);
		
		
		ref.lifeSpan=25;
		System.out.println("lifeSpan:"+ref.lifeSpan);

		ref.height=4.9f;
		System.out.println("height:"+ref.height);
		
		ref.herbivore=true;
		System.out.println("herbivore:"+ref.herbivore);
	}

}
