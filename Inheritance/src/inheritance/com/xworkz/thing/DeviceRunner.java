package inheritance.com.xworkz.thing;

import inheritance.com.xworkz.boot.Camera;
import inheritance.com.xworkz.boot.Device;

public class DeviceRunner {

	public static void main(String[] args) {

		Camera camera = new Camera();
		camera.name("Sony");
		String Name = camera.getName();
		System.out.println("name:" + Name);
		camera.capture();

		Device device = new Camera();
		device.name("Sony");
		String name = device.getName();
		System.out.println("name1:" + name);

		Camera casted = (Camera) device;
		casted.capture();

	}

}
