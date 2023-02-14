package inheritance.com.xworkz.boot;

public class Sports {

	private String name;

	public Sports() {
		System.out.println("calling sports with no arg constructor");
	}

	public void name(String name) {
		this.name = name;
	}

	public String getname() {
		return this.name;
	}

}
