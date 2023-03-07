package com.xworkz.boot.mondayRunner;

import com.xworkz.things.monday.Adike;

public class AdikeRunner {

	public static void main(String[] args) {

		Adike adike = new Adike();
		adike.setColor("Red");
		adike.setCost(5);
		adike.setShape("Round");
		adike.setDry(true);
		System.out.println(adike);

		Adike adike1 = new Adike();
		adike1.setColor("DarkRed");
		adike1.setCost(6);
		adike1.setShape("Oval");
		adike1.setDry(false);
		System.out.println(adike1);

		System.out.println("HashCode of adike is:" + adike.hashCode() + "  Original HashCode of adike is:"
				+ System.identityHashCode(adike));

		System.out.println(adike.equals(adike1));

	}

}
