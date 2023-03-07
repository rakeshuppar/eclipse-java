package inheritance.com.xworkz.thing;

import inheritance.com.xworkz.boot.Alcohol;
import inheritance.com.xworkz.boot.Whiskey;

public class AlcoholRunner {

	public static void main(String[] args) {

		Whiskey whiskey = new Whiskey();
		whiskey.name("Wine");
		String name = whiskey.getName();
		System.out.println("name:" + name);
		whiskey.hard();
		

		Alcohol alcohol = new Whiskey();
		alcohol.name("wine");
		String name1 = alcohol.getName();
		System.out.println("name1:" + name1);

		Whiskey casted = (Whiskey) alcohol;
		casted.hard();

	}

}
