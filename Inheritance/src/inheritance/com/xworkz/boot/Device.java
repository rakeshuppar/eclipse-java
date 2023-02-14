package inheritance.com.xworkz.boot;

public class Device {

	private String name;

	public Device() {
		System.out.println("calling Device with no arg constructor");
	}

	public void name(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
