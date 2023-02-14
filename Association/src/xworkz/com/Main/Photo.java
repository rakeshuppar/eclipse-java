package xworkz.com.Main;

public class Photo {

	public char size;
	public boolean colour;
	public String type;

	public Photo() {
		System.out.println("calling with no constructor");
	}

	public Photo(char size, boolean colour, String type) {

		this.size = size;
		this.colour = colour;
		this.type = type;

	}

	public void display() {
		System.out.println(this.size);
        System.out.println(this.colour);
        System.out.println(this.type);

}
}