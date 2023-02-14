package xworkz.com.Main;

public class Buttons {

	public String shape;
	public String material;
	public int holes;

	public Buttons() {
		System.out.println("Calling with no arguement constructor");
	}

	public Buttons(String shape, String material, int holes) {

		this.shape = shape;
		this.material = material;
		this.holes = holes;

	}

	public void initialVariables(String shape, String material, int holes) {
		this.shape = shape;
		this.material = material;
		this.holes = holes;

	}

	public void display() {

		System.out.println("Display START");
		System.out.println(this.shape);
		System.out.println(this.material);
		System.out.println(this.holes);
		System.out.println("Display END");
	}

}
