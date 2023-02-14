package xworkz.com.MainRunner;

import xworkz.com.Main.Sweater;
import xworkz.com.boot.Buttons;

public class SweaterRunner {

	public static void main(String[] args) {

		Sweater sweater = new Sweater();
		sweater.display();

		Sweater sweater1 = new Sweater();
		sweater1.initaialVariables(4, 2, true);
		sweater1.display();

		Buttons Bt = new Buttons();
		Bt.initialVariable("Round", "small", 2);
		Bt.display();
	}

}