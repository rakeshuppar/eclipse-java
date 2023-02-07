package xworkz.com.boot;

public class Engine {
	
	public String cylinder;
	public int stroke;
	public String type;
	
	
	
	
	public void initialVariable(String cylinder, int stroke, String type) {
		
		this.cylinder=cylinder;
		this.stroke=stroke;
		this.type=type;
	}
	
	public void display() {
		
		
		System.out.println("cylinder:"+this.cylinder);
		System.out.println("stroke:"+this.stroke);
		System.out.println("type:"+this.type);
	}
	

}
