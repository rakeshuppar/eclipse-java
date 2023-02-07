package xworkz.com.boot;

public class Buttons {

	public String shape;
	public String size;
	public int holes;

	public void initialVariable(String shape, String size, int holes) {

		this.shape = shape;
		this.size = size;
		this.holes = holes;
	}

	public void display() {

		System.out.println("shape:" + this.shape);
		System.out.println("size:" + this.size);
		System.out.println("holes:" + this.holes);

	}
}
