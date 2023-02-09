package xworkz.com.boot.main;

public class Scientist {

	public String name;
	public String designation;

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.designation);
		
	}

}
