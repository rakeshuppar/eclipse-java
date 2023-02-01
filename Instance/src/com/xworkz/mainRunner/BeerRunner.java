package com.xworkz.mainRunner;

import com.xworkz.main.Beer;

public class BeerRunner {

	public static void main(String[] args) {
		
		
		Beer ref=new Beer();
	
		ref.brand="Kingfisher";
		ref.manufactureBy="united Breweries Group";
		ref.introduceYear=1857;
		ref.relaunchedYear=1978;
		ref.relaunchedBy="vijay malya";
		ref.availableCountries=52;
		ref.type="large";
		ref.countryofOrigin="india";
		ref.volumeofAlcohol%=4.8f;
		ref.availableFormates=4;
		ref.costof330ml=100;
		ref.bottleheightinch=9.09f;
		ref.bottleDiameterinch=2.4f;
		ref.taste="Strong";
		ref.color="dark";
		ref.size=330;
		ref.waterinBeer=91.96f;
		ref.energyinBeer=43;
		ref.proteininBeer=0.46f;
		ref.carbohydrateinBeer=3.55f;
		ref.calciuminBeer=4;
		ref.ironinBeer=0.02f;
		ref.magnesiuminBeer=6;
		ref.sodiuminBeer=4;
		ref.zincinBeer=0.01f;
		ref.copperinBeer=0.005f;
	    ref.glycineinBeer=0.013f;
		ref.prolineinBeer=0.035f;
		
		Beer ref1=new Beer();
		
		ref.display();

	}

}
