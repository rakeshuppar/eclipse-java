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

		Area area = new Area("Chikkadapur", 2000, "Benakandoni Road");

		City city = new City("Ilkal", "Bagalkot", "Bangalore", area);

		State state = new State("Karnataka", "Basavaraj Bommai", "Kannada", city);

		Country country = new Country("India", "Draupadi Murmu", true, state);

		Company company = new Company("infosys", "Salil Parekh", 1981, country);

		Security security = new Security("ISC", 150.0d, "Raghu Das", company);

		Mall mall = new Mall("Orion Mall", "Good", 5, security);
		mall.display();

	}

}
