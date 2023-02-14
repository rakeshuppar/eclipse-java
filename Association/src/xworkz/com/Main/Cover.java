package xworkz.com.Main;

public class Cover {
	
	public String material;
	public int cost;
	public boolean shine;
	
	public Cover() {
		System.out.println("calling with no arguement constructor");
	}
	
	public Cover(String material, int cost, boolean shine) {
		
		this.material=material;
		this.cost=cost;
		this.shine=shine;
	}
	
	public void intialVariable(String material, int cost, boolean shine) {
	
		this.material=material;
		this.cost=cost;
		this.shine = shine;
	}
	
	public void display() {
		System.out.println("Display START");
		System.out.println(this.material);
		System.out.println(this.cost);
		System.out.println(this.shine);
		System.out.println("Display END");
		
	}
}
