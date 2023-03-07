package inheritance.com.xworkz.boot;

public class Alcohol {

	 String name;

	public Alcohol() {
		System.out.println("calling Alcohol with no arg constructor");
	}

	public void name(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;

	}

}
