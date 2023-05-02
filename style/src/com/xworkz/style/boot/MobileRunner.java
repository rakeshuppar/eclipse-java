package com.xworkz.style.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.style.configuration.MobileConfiguration;
import com.xworkz.style.things.Car;
import com.xworkz.style.things.Door;
import com.xworkz.style.things.HumanBeings;
import com.xworkz.style.things.Laptop;
import com.xworkz.style.things.Library;
import com.xworkz.style.things.Mobile;
import com.xworkz.style.things.Park;
import com.xworkz.style.things.Planet;
import com.xworkz.style.things.Shoes;
import com.xworkz.style.things.Table;
import com.xworkz.style.things.Television;
import com.xworkz.style.things.Temple;
import com.xworkz.style.things.Zoo;

public class MobileRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MobileConfiguration.class);

		System.out.println("----------------------------START-------------------------------");
		System.out.println("------------------------------Mobile------------------------------");
		Mobile mobile = context.getBean(Mobile.class);
		System.out.println(mobile);
		System.out.println("-------invoke one method--------");
		String name = mobile.name();
		System.out.println(name);

		System.out.println("-------------------------------Laptop----------------------------");

		Laptop laptop = context.getBean(Laptop.class);
		System.out.println(laptop);
		System.out.println("-------invoke one method--------");
		String type = laptop.type();
		System.out.println(type);

		System.out.println("--------------------------------Park------------------------------");

		Park park = context.getBean(Park.class);
		System.out.println(park);
		System.out.println("-------invoke one method-------------");
		String rating = park.rating();
		System.out.println(rating);

		System.out.println("---------------------------------Car--------------------------------");

		Car car = context.getBean(Car.class);
		System.out.println(car);
		System.out.println("-------invoke one method-------------");
		String mirror = car.mirror();
		System.out.println(mirror);

		System.out.println("-----------------------------Door------------------------------------");

		Door door = context.getBean(Door.class);
		System.out.println(door);
		System.out.println("-----invoke one method--------");
		String feed = door.feedback();
		System.out.println(feed);

		System.out.println("---------------------------Library------------------------------------");
		Library library = context.getBean(Library.class);
		System.out.println(library);
		System.out.println("-------invoke one method------");
		String owner = library.owner();
		System.out.println(owner);

		System.out.println("-----------------------------Planet------------------------------------");

		Planet planet = context.getBean(Planet.class);
		System.out.println(planet);
		System.out.println("-------invoke one method------");
		String layer = planet.layers();
		System.out.println(layer);

		System.out.println("---------------------------------Shoes----------------------------------");

		Shoes shoes = context.getBean(Shoes.class);
		System.out.println(shoes);
		System.out.println("-------invoke one method------");
		String rate = shoes.ratings();
		System.out.println(rate);

		System.out.println("----------------------------Table-----------------------------------------");
		Table table = context.getBean(Table.class);
		System.out.println(table);
		System.out.println("-------invoke one method------");
		String weight = table.weight();
		System.out.println(weight);

		System.out.println("-------------------------------Television--------------------------------");
		Television tv = context.getBean(Television.class);
		System.out.println(tv);
		System.out.println("-------invoke one method------");
		String type1 = tv.type();
		System.out.println(type1);

		System.out.println("---------------------------------Temple-------------------------------------");

		Temple temple = context.getBean(Temple.class);
		System.out.println(temple);
		System.out.println("-------invoke one method------");
		String admin = temple.adminstrationBy();
		System.out.println(admin);

		System.out.println("-------------------------------------Zoo------------------------------------");
		Zoo zoo = context.getBean(Zoo.class);
		System.out.println(zoo);
		System.out.println("-------invoke one method------");
		String country = zoo.country();
		System.out.println(country);

		System.out.println("----------------------------HumanBeings--------------------------------------");
		HumanBeings beings = context.getBean(HumanBeings.class);
		System.out.println(beings);
		System.out.println("-------invoke one method------");
		String feet = beings.feetfingers();
		System.out.println(feet);

		System.out.println("----------------------------------END----------------------------------------");

	}

}
