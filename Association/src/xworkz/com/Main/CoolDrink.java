package xworkz.com.Main;

public class CoolDrink {

	public String brand;
	public String flavour;
	public String company;

	public CoolDrink() {

		System.out.println("calling with no arguements");
	}

	public CoolDrink(String brand, String flavour, String company) {
		this.brand = brand;
		this.flavour = flavour;
		this.company = company;
		System.out.println("String,String and String constructors");
	}

	public void init(String brand, String flavour, String company) {
		System.out.println("initialing Varaibles");
		this.brand = brand;
		this.flavour = flavour;
		this.company = company;
	}

	public void display() {
		System.out.println("displaying START");
		System.out.println("brand:" + this.brand);
		System.out.println("flavour:" + this.flavour);
		System.out.println("company:" + this.company);
		System.out.println("Displaying END");
	}
}