package com.xworkz.mondayRunner;

import com.xworkz.monday.Gold;

public class GoldRunner {

	public static void main(String[] args) {

		Gold gold = new Gold();
		gold.setType("Chain");
		gold.setCost(48000);
		gold.setCostly(true);
		gold.setCarat(24);
		System.out.println(gold);

		Gold gold1 = new Gold();
		gold1.setType("Bracelet");
		gold1.setCost(49000);
		gold1.setCostly(true);
		gold1.setCarat(22);
		System.out.println(gold1);

		System.out.println("HashCode of gold is:" + gold.hashCode() + "  Original HashCode of gold is:"
				+ System.identityHashCode(gold));

		System.out.println(gold.equals(gold1));

	}

}
