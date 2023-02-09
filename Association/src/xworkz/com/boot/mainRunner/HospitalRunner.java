package xworkz.com.boot.mainRunner;

import xworkz.com.boot.main.Doctor;
import xworkz.com.boot.main.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();
		hospital.setName("Manipal");

		Doctor doctor1 = new Doctor();
		
		
		String[] special = { "orthopedics", "dermatology", "radiology" };
		doctor1.setSpecialization(special);

		doctor1.setName("tejas");
		doctor1.setSpecialization(special);
		doctor1.setExperiance(15.0d);
		
		Doctor doctor2 = new Doctor();
		
		String[] special1 = { "orthopedics", "radiology" };
		doctor2.setSpecialization(special1);

		doctor2.setName("ravishankar");
		doctor2.setSpecialization(special1);
		doctor2.setExperiance(16.0d);

		Doctor[] doctors = { doctor1, doctor2 };
		hospital.setDoctor(doctors);
		hospital.display();

	}

}
