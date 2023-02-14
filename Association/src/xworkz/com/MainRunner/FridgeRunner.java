package xworkz.com.MainRunner;

import xworkz.com.Main.CoolDrink;
import xworkz.com.Main.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {

		Fridge fridge = new Fridge();
		fridge.display();

		Fridge fridge1 = new Fridge();
		fridge1.display();
		fridge1.inti(2, true, 20000);
		fridge1.display();

		CoolDrink cooldrink = new CoolDrink();
		cooldrink.init("sprite", "lemon", "coca-cola");
		cooldrink.display();

	}

}
