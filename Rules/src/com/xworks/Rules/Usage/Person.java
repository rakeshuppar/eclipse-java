package com.xworks.Rules.Usage;

import com.xworks.Rules.Game.Delivery;

public class Person {

	private Delivery delivery;

	public Person(Delivery delivery) {
		this.delivery = delivery;
	}

	public void checkDelivery() {
		String agent = this.delivery.agentName(1);

		double charge = this.delivery.charges();
		System.out.println("charges:" + charge);

		if (charge < 60) {
			System.out.println("charges are ok");
		} else {
			System.out.println("charges are expensive");
		}

		double time = this.delivery.timeTaken();
		System.out.println("Time taken:" + time);

		if (time <= 30) {
			System.out.println("ontime Delivery");
		} else {
			System.out.println("delayed Delivery");
		}
		System.out.println("Agent Name:" + agent);

	}

}
