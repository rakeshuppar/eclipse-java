package inheritance.com.xworkz.boot;

public class ValentineDay {

	private String month;

	public ValentineDay() {
		System.out.println("calling valentinesday with no arg constructor");
	}

	public void month(String month) {
		this.month = month;

	}

	public String getMonth() {
		return this.month;
	}

}
