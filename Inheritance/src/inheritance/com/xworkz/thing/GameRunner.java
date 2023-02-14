package inheritance.com.xworkz.thing;

import inheritance.com.xworkz.boot.CandyCrush;
import inheritance.com.xworkz.boot.Game;

public class GameRunner {

	public static void main(String[] args) {

		CandyCrush candy = new CandyCrush();
		candy.name("CandyCrush");
		String name = candy.getName();
		System.out.println("name:" + name);
		candy.play();

		Game game = new CandyCrush();
		game.name("Candycrush");
		String name1 = candy.getName();
		System.out.println("name1:" + name1);

		CandyCrush casted = (CandyCrush) game;
		casted.play();

	}

}
