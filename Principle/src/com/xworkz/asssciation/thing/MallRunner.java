package com.xworkz.asssciation.thing;

import com.xworkz.asssciation.boot.Area;
import com.xworkz.asssciation.boot.City;
import com.xworkz.asssciation.boot.Company;
import com.xworkz.asssciation.boot.Country;
import com.xworkz.asssciation.boot.Mall;
import com.xworkz.asssciation.boot.Security;
import com.xworkz.asssciation.boot.State;

public class MallRunner {

	public static void main(String[] args) {

		Area area = new Area();

		City city = new City();
		city.setArea(area);
		city.display();

		State state = new State();
		state.setCity(city);
		state.display();

		Country country = new Country();
		country.setState(state);
		country.display();

		Company company = new Company();
		company.setCountry(country);
		company.display();

		Security security = new Security();
		security.setCompany(company);
		security.display();

		Mall mall = new Mall();
		mall.setSecurity(security);
		mall.display();

	}

}
