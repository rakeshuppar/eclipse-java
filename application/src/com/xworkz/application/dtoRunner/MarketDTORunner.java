package com.xworkz.application.dtoRunner;

import com.xworkz.application.dto.MarketDTO;

public class MarketDTORunner {

	public static void main(String[] args) {

		MarketDTO market = new MarketDTO();
		market.setMarket("K R Market");
		market.setLocation("Kalasipalya");
		market.setAreainSqm(47000);
		market.setNumShops(30);
		market.setNeat(false);
		System.out.println(market.equals(market));
		System.out
				.println("Hash Code:" + market.hashCode() + " FOriginal Hash Code:" + System.identityHashCode(market));
		System.out.println(market.toString());

	}

}
