package com.xworkz.boot.equalRunner;

import com.xworkz.boot.equal.Cake;

public class CakeRunner {

	public static void main(String[] args) {

		Cake cake = new Cake("Chocalate", 1, "square", "shop");
		System.out.println(cake.toString());
		System.out.println(cake.equals(cake));

		Cake cake1 = new Cake("Vanilla", 2, "rectangle", "restaurant");
		System.out.println(cake1.toString());
		System.out.println(cake.equals(cake1));

	}

}
