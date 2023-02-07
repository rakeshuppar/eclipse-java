package xworkz.com.boot;

public class Xworks {
	
	public int chairs;
	public boolean projector;
	public int tables;
	public Projector pr=new Projector();
	
	
	
	public void initialVarible(int chairs, boolean projector, int tables) {
		this.chairs=chairs;
		this.projector=projector;
		this.tables=tables;
	}
	
	public void display() {
		
		System.out.println("xworkz has numofChairs:"+chairs);
		System.out.println("xworkz has projector:"+projector);
		System.out.println("xworks has numofTable:"+tables);
		this.pr.display();
	}
	

}
