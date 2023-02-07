package xworkz.com.boot;

public class Phone {

	public String Camera;
	public boolean fingerprint;
	public float battery;
	public Camera ca = new Camera();

	public void initialVariable(String Camera, boolean fingerprint, float battery) {

		this.Camera = Camera;
		this.fingerprint = fingerprint;
		this.battery = battery;

	}

	public void display() {

		System.out.println("phone has a:" + this.Camera);
		System.out.println("phone has a:" + this.fingerprint);
		System.out.println("phone has a:" + this.battery);
		this.ca.display();
	}
}
