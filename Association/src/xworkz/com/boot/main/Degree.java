package xworkz.com.boot.main;

public class Degree {
	
	public String name;
	public int duration;
	public boolean pursuing;
	public double percentage;
	public String branch;

	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDuration(int duration) {
		this.duration=duration;
	}
	
	public void setPursuing(boolean pursuing) {
		this.pursuing=pursuing;
	}
	
	public void setPercentage(double percentage) {
		this.percentage=percentage;
	}
	
	public void setBranch(String branch){
		this.branch=branch;
	}
	
	
	public void display() {
		System.out.println("degree name:"+this.name);
		System.out.println("degree duration:"+this.duration);
		System.out.println("degree pursuing:"+this.pursuing);
		System.out.println("degree percentage:"+this.percentage);
		System.out.println("degree branch:"+this.branch);
	}
		
	}

