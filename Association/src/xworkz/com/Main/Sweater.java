package xworkz.com.Main;

public class Sweater {

	public int Zips;
	public int Buttons;
	public boolean cap;
	public Buttons Bt;

	public Sweater() {
		System.out.println("calling with no arguement constructor");
	}

	public Sweater(int Buttons) {
		this.Buttons = Buttons;

	}

	public void initaialVariables(int Zips, int Buttons, boolean cap) {

		this.Zips = Zips;
		this.Buttons = Buttons;
		this.cap = cap;
	}

	public void display() {
		System.out.println("Display START");
		System.out.println(this.Zips);
		System.out.println(this.Buttons);
		System.out.println(this.cap);
		if (Bt != null) {
			System.out.println("");
		}
		System.out.println("");
		this.Bt.display();

		System.out.println("Display End");
	}

}
