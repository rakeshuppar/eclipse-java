package com.xworkz.override.thing;

import com.xworkz.override.boot.Ballon;
import com.xworkz.override.boot.TubeBallon;

public class BallonRunner {

	public static void main(String[] args) {

		Ballon ballon = new TubeBallon();
		double expand = ballon.ExpandInCm();
		System.out.println("ExpandInCm:" + expand);

	}

}
