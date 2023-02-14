package xworkz.com.Main;

public class Sunglass {

	public String Brand;
	public boolean frame;
	public String material;
	public Frame fr;

	public Sunglass() {
		System.out.println("calling with no arg Constructor");
	}

	public Sunglass(String material) {
		this.material = material;
	}

	public void initialVariables(String Brand, boolean frame, String material) {
		this.Brand = Brand;
		this.frame = frame;
		this.material = material;

	}

	public void display() {
		System.out.println("Display Start");
		System.out.println(this.Brand);
		System.out.println(this.frame);
		System.out.println(this.material);
		if (fr != null) {
			System.out.println("");
		}
		System.out.println("");
        this.fr.display();
		System.out.println("Display End");
	}

}
