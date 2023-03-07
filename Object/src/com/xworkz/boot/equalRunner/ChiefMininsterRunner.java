package com.xworkz.boot.equalRunner;

import com.xworkz.things.equal.ChiefMinister;

public class ChiefMininsterRunner {

	public static void main(String[] args) {

		ChiefMinister minister = new ChiefMinister("Basavaraj Bommai", "Karnataka", 350000, "Anugraha", "CM",
				"Governor of Karnatka", 5, 25, "Head of Karnataka Government",
				"Karnataka legislature and Karnataka Council Of Minister", "Governor of Karnataka",
				"members of legislative Assembly", true);
		System.out.println(minister.toString());
		System.out.println(minister.equals(minister));

		ChiefMinister minister1 = new ChiefMinister("Ekanath Shinde", "Maharashtra", 340000, "Varsha Bungalow", "CM",
				"Governor of Maharashtra", 5, 25, "Head of Maharashtra Government", "Vidhana Sabha and VidhanParishad",
				"Governor Of Maharashtra", "Members of Vidhansabha", true);
		System.out.println(minister1.toString());
		System.out.println(minister1.equals(minister));

	}

}
