package com.xworks.Rules.Usage;

import com.xworks.Rules.Game.Delivery;

public class Person {

	private Delivery delivery;

	public Person(Delivery delivery) {
		this.delivery = delivery;
	}

	public void checkDelivery() {
		String agent = this.delivery.agentName(3);
		double time = this.delivery.timeTaken();
		double charge = this.delivery.charges();

		if (charge < 60) {
			System.out.println("charges are ok");
		} else {
			System.out.println("charges are expensive");
		}
		if (time <= 30) {
			System.out.println("ontime Delivery");
		} else {
			System.out.println("delayed delivery");
		}
		System.out.println("agentname:" + agent);

	}

}
