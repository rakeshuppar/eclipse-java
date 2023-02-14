package inheritance.com.xworkz.boot;

public class Game {

	private String name;

	public Game() {
		System.out.println("calling Game with no arg constructor");
	}

	public void name(String Name) {
		this.name = Name;
	}

	public String getName() {
		return this.name;
	}

}
