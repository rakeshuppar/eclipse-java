package xworkz.com.boot;

public class Projector {

	public String brand;
	public float height;
	public float cost;
	
	
	public void initialVariables(String brand, float height, float cost) {
		this.brand=brand;
		this.height=height;
		this.cost=cost;

	}
	
	public void display() {
		
		System.out.println("brand is:"+brand);
		System.out.println("height is:"+height);
		System.out.println("cost is:"+cost);
	}

}
