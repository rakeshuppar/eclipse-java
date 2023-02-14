package xworkz.com.Main;

public class Fridge {

	public int numDoors;
	public boolean coolDrink;
	public int cost;
	public CoolDrink cd=null;

	public Fridge() {
		System.out.println("calling with no constructor");
	}

	public Fridge(int numDoors, boolean coolDrink, int cost) {

		this.numDoors = numDoors;
		this.coolDrink = coolDrink;
		this.cost = cost;
	}

	public Fridge(int cost) {
		this.cost = cost;
		System.out.println("calling with int constructor");

	}

	public void inti(int numDoors, boolean coolDrink, int cost) {
		System.out.println("initialize variables");
		this.numDoors = numDoors;
		this.coolDrink = coolDrink;
		this.cost = cost;
	}

	public void display() {
		System.out.println("display START");
		System.out.println("numDoors:" + this.numDoors);
		System.out.println("coolDrink:" + this.coolDrink);
		System.out.println("cost:" + this.cost);
		if (cd != null) {
			System.out.println("");
		}
		this.cd.display();
		System.out.println("");

	}
}