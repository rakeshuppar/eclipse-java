package com.xworks.Rules.Runner;

import com.xworks.Rules.Game.Delivery;
import com.xworks.Rules.Implementer.Dunzo;
import com.xworks.Rules.Implementer.Rapido;
import com.xworks.Rules.Usage.Person;

public class DeliveryRunner {

	public static void main(String[] args) {

		Delivery delivery = new Dunzo();

		Person person = new Person(delivery);
		person.checkDelivery();

		System.out.println("------------------------");

		Delivery delivery1 = new Rapido();

		Person person2 = new Person(delivery1);
		person2.checkDelivery();

	}
}
