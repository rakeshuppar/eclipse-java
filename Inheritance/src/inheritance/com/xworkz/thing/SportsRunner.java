package inheritance.com.xworkz.thing;

import inheritance.com.xworkz.boot.Cricket;
import inheritance.com.xworkz.boot.Sports;

public class SportsRunner {

	public static void main(String[] args) {

		Cricket cricket = new Cricket();
		cricket.name("Cricket");
		String name = cricket.getname();
		System.out.println("name:" + name);
		cricket.team();

		Sports sports = new Cricket();
		sports.name("Cricket");
		String name1 = sports.getname();
		System.out.println("name1:" + name1);

		Cricket casted = (Cricket) sports;
		casted.team();

	}

}
