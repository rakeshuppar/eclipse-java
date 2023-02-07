package xworkz.com.thing;

import xworkz.com.boot.Xworks;
import xworkz.com.boot.JavaBike;
import xworkz.com.boot.Phone;
import xworkz.com.boot.Shirt;
import xworkz.com.boot.Temple;


public class PhoneRunner {

	public static void main(String[] args) {

		Phone ca = new Phone();
		ca.display();
		
		System.out.println("-----------------------");
		
		
		Xworks pr=new Xworks();
		pr.display();
		
		System.out.println("------------------");
		
		Shirt Bt = new Shirt();
		Bt.display();
		
		System.out.println("--------------------");
		
		
		JavaBike en=new JavaBike();
		en.display();
		
		System.out.println("------------------------");
		
		
		Temple tp=new Temple();
		tp.display();

	}

}
