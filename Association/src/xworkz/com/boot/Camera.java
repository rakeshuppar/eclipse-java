package xworkz.com.boot;

public class Camera {

	public int focalLength;
	public String lens;
	public String type;

	public void initialVariable(int focalLength, String lens, String type) {

		this.focalLength = focalLength;
		this.lens = lens;
		this.type = type;
	}

	public void display() {
		System.out.println("focal length:" + this.focalLength);
		System.out.println("lens:" + this.lens);
		System.out.println("type:" + this.type);

	}

}
