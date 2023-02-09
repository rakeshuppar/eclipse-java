package xworkz.com.boot.main;

public class Hospital {

	public String name;
	public Doctor[] doctors;
	
	
	public Hospital() {
		System.out.println("calling with no arg constructor");
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDoctor(Doctor[] doctors) {
		this.doctors = doctors;
	}

	public void display() {

		System.out.println("Hospitalname:" + this.name);

		if (this.doctors != null) {
			for (int seq = 0; seq < this.doctors.length; seq++) {
				Doctor doctors = this.doctors[seq];
				System.out.println(seq);
				doctors.display();
			}
		} else
			System.out.println();
	}

}
