package com.xworkz.interview;

import com.xworkz.interview.boot.ShivaTemple;

public class TempleRunner {

	public static void main(String[] args) {

		Temple temple = new Temple();
		temple.god();
		temple.god();

		GaneshTemple temple1 = new GaneshTemple();
		temple1.Timing();
		temple.god();

		ShivaTemple temple2 = new ShivaTemple();
		temple2.god();

}
}
