package com.xworkz.boot.equalRunner;

import com.xworkz.things.equal.Fish;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish = new Fish("lean", 500, "iron", 'm', 25);
		System.out.println(fish.toString());
		System.out.println(fish.equals(fish));

		Fish fish1 = new Fish("fatty", 450, "zinc", 'l', 20);
		System.out.println(fish1.toString());
        System.out.println(fish.equals(fish1));

	}

}
