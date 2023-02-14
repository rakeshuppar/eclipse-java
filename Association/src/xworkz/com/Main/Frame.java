package xworkz.com.Main;

public class Frame {

	public String shape;
	public boolean transperancy;
	public float thickness;

	public Frame() {
		System.out.println("calling with no arg constructor");
	}

	public Frame(String shape, boolean transperancy, float thickness) {
		this.shape = shape;
		this.transperancy = transperancy;
		this.thickness = thickness;
	}

	public void initialVariables(String shape, boolean transperancy, float thickness) {
		this.shape = shape;
		this.transperancy = transperancy;
		this.thickness = thickness;
	}

	public void display() {
		System.out.println("display START");
		System.out.println(this.shape);
		System.out.println(this.transperancy);
		System.out.println(this.thickness);
		System.out.println("display END");
	}

}
