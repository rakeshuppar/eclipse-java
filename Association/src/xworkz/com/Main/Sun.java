package xworkz.com.Main;

public class Sun {

	public String Shape;
	public boolean hot;
	public String colour;

	public Sun() {
		System.out.println("calling with no arguements");
	}

	public Sun(String Shape, boolean hot, String colour) {
		this.Shape = Shape;
		this.hot = hot;
		this.colour = colour;

	}

	public void initialVariables(String Shape, boolean hot, String colour) {
		this.Shape = Shape;
		this.hot = hot;
		this.colour = colour;

	}

	public void display() {
		System.out.println("Display START");
		System.out.println(this.Shape);
		System.out.println(this.hot);
		System.out.println(this.colour);
		System.out.println("Display END");
	}

}
