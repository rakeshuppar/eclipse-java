package xworkz.com.boot;

public class JavaBike {
	
	public String engine;
	public String fuelType;
	public float maxPower;
	public Engine En=new Engine();

	
	
	
	public void initialVariable(String engine, String fuelType, float maxPower) {
		
		this.engine=engine;
		this.fuelType=fuelType;
		this.maxPower=maxPower;
	}
	
	
	public void display() {
		
		System.out.println("engine:"+this.engine);
		System.out.println("fuelType:"+this.fuelType);
		System.out.println("maxPower:"+this.maxPower);
		this.En.display();
	}
}
