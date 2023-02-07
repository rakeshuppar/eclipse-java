package xworkz.com.boot;

public class Shirt {

	public String Brand;
	public int Buttons;
	public String Material;
	public Buttons Bt = new Buttons();

	public void initialVariables(String Brand, int Buttons, String Material) {

		this.Brand = Brand;
		this.Buttons = Buttons;
		this.Material = Material;

	}

	public void display() {

		System.out.println("Brand:" + this.Brand);
		System.out.println("Buttons:" + this.Buttons);
		System.out.println("Material:" + this.Material);
		this.Bt.display();

	}

}
