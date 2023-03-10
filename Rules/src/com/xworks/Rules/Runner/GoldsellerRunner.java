package com.xworks.Rules.Runner;

import com.xworks.Rules.Game.GoldSeller;
import com.xworks.Rules.Implementer.Abharana;
import com.xworks.Rules.Implementer.DevendraSetu;
import com.xworks.Rules.Implementer.Mahalakshmi;
import com.xworks.Rules.Implementer.Malbar;
import com.xworks.Rules.Usage.Anitha;
import com.xworks.Rules.Usage.Bhairavi;
import com.xworks.Rules.Usage.Priyanka;
import com.xworks.Rules.Usage.Shruti;

public class GoldsellerRunner {

	public static void main(String[] args) {

		GoldSeller seller = new Malbar();

		Bhairavi bhairavi = new Bhairavi(seller);
		bhairavi.bangaraKaridi();

		System.out.println("--------------------------");

		GoldSeller seller1 = new DevendraSetu();

		Shruti shruti = new Shruti(seller1);
		shruti.chinnaTago();

		System.out.println("-----------------------------");

		GoldSeller seller2 = new Abharana();

		Priyanka priyanka = new Priyanka(seller2);
		priyanka.purchaseGold();

		System.out.println("--------------------------------");

		GoldSeller seller3 = new Mahalakshmi();

		Anitha anitha = new Anitha(seller3);
		anitha.buyGold();

	}

}
