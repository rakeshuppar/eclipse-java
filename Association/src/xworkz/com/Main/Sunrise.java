package xworkz.com.Main;

public class Sunrise {

	public String numRays;
	public boolean sun;
	public String colour;
	public Sun sn;

	public Sunrise() {
		System.out.println("calling with no arguements");
	}

	public Sunrise(boolean sun) {

		this.sun = sun;
	}

	public void initialVariables(String numRays, boolean sun, String colour) {

		this.numRays = numRays;
		this.sun = sun;
		this.colour = colour;
	}

	public void display() {

		System.out.println("Display START");
		System.out.println(this.numRays);
		System.out.println(this.sun);
		System.out.println(this.colour);
		if (sn != null) {
			System.out.println("");
		}
		System.out.println("");
		this.sn.display();

		System.out.println("Display END");

	}

}
