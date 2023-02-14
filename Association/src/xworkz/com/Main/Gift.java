package xworkz.com.Main;

public class Gift {

	public boolean surprise;
	public String item;
	public boolean cover;
	public Cover cr;;

	public Gift() {

		System.out.println("calling with no arguement constructor");
	}

	public Gift(boolean cover) {

		this.cover = cover;

	}

	public void initialVariables(boolean surprise, String item, boolean cover) {
		this.surprise = surprise;
		this.item = item;
		this.cover = cover;
	}

	public void display() {
		System.out.println("Display START");
		System.out.println(this.surprise);
		System.out.println(this.item);
		System.out.println(this.cover);
		if (cr != null) {
			System.out.println("");
		}
		System.out.println("");
		this.cr.display();

		System.out.println("Display END");
	}

}
