package xworkz.com.MainRunner;

import xworkz.com.Main.Frame;
import xworkz.com.Main.Sunglass;

public class SunglassRunner {

	public static void main(String[] args) {

		Sunglass sunglass = new Sunglass();
		sunglass.display();

		Sunglass sunglass1 = new Sunglass();
		sunglass1.initialVariables("oakley", true, "glass");
		sunglass1.display();

		Frame fr = new Frame();
		fr.initialVariables("oval", true, 2.0f);
		fr.display();
	}

}
