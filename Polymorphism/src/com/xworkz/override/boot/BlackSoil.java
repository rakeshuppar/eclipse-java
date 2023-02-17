package com.xworkz.override.boot;

public class BlackSoil extends Soil {

	public BlackSoil() {
		System.out.println("calling with no arg constructor in Blacksoil");
	}

	@Override
	public String Colour() {

		return "black";
	}

}
