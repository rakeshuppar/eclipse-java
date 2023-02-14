package xworkz.com.Main;

public class Wallet {

	public int money;
	public String card;
	public boolean photo;
	public Photo pt;

	public Wallet() {

		System.out.println("calling with no constructor");

	}

	public Wallet(int money, String card, boolean photo, Photo pt) {
		this.money = money;
		this.card = card;
		this.photo = photo;
		this.pt = pt;
	}

	public void display() {

		System.out.println("Display START");
		System.out.println("money:" + this.money);
		System.out.println("card:" + this.card);
		System.out.println("photo:" + this.photo);
		if (this.pt != null) {
			
				this.pt.display();
			}
	 else {
			
	}

	}

}