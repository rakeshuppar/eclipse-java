package com.xworkz.thingRunner;

import com.xworkz.thing.Biryani;

public class BiryaniRunner {

	public static void main(String[] args) {
		
		Biryani biryani=new Biryani();
		biryani.display();
		
		Biryani biryani1=new Biryani("chicken Biryani");
		biryani1.display();
		
		Biryani biryani2=new Biryani(false);
		biryani2.display();
		
		Biryani biryani3=new Biryani("chicken Biryani",false);
		biryani3.display();
		
		Biryani biryani4=new Biryani(318,3.7f,14.0f);
		biryani4.display();
		
		Biryani biryani5=new Biryani(4.6f,14.0f,3.7f);
	    biryani5.display();
		
		Biryani biryani6=new Biryani(true,true,false);
		biryani6.display();
		
		Biryani biryani7=new Biryani(100,202,318);
		biryani7.display();
		
		Biryani biryani8=new Biryani("chicken Biryani",100);
		biryani8.display();
		
		Biryani biryani9=new Biryani(100,"chicken Biryani");
		biryani9.display();
		
		Biryani biryani10=new Biryani(4.6f,3.7f,202);
		biryani10.display();
		
		Biryani biryani11=new Biryani(4.6f,3.7f);
		biryani11.display();
		
		Biryani biryani12=new Biryani(100,4.6f);
		biryani12.display();
		
		Biryani biryani13=new Biryani(4.6f,100);
		biryani13.display();
		
		Biryani biryani14=new Biryani(100,202);
		biryani14.display();
		
		Biryani biryani15=new Biryani("chicken Biryani","iran");
		biryani15.display();
		
	}

}
