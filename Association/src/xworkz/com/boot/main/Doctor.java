package xworkz.com.boot.main;

public class Doctor {

	public String name;
	public String[] specialization;
	public double experiance;
	
	
	public Doctor() {
		System.out.println("calling with no arg constructor");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecialization(String[] specialization) {
		this.specialization = specialization;

	}

	public void setExperiance(double experiance) {
		this.experiance = experiance;
	}

	public void display() {
		System.out.println("DoctorName:" + this.name);
	
		if (this.specialization != null) {
			for (int seq = 0; seq < this.specialization.length; seq++) {
				String element = this.specialization[seq];
				System.out.println(element + "    at index   +seq");
				
			}
		} else {
			System.out.println("");
		}

		System.out.println("experiance year:" + this.experiance);
	}
}
