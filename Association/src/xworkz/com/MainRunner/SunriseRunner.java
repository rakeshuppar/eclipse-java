package xworkz.com.MainRunner;

import xworkz.com.Main.Sun;
import xworkz.com.Main.Sunrise;

public class SunriseRunner {

	public static void main(String[] args) {

		Sunrise sunrise = new Sunrise();
		sunrise.display();

		Sunrise sunrise1 = new Sunrise();
		sunrise1.initialVariables("infinite", true, "red");
		sunrise1.display();

		Sun sun = new Sun();
		sun.initialVariables("round", true, "yellow");
		sun.display();

	}
}
