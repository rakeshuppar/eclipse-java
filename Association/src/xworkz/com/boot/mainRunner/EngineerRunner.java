package xworkz.com.boot.mainRunner;

import xworkz.com.boot.main.Degree;
import xworkz.com.boot.main.Engineer;

public class EngineerRunner {

	public static void main(String[] args) {
		
		Engineer engineer=new Engineer();
		engineer.setName("navenKumar");
		engineer.setSalary(50000);
		
		String[]skill={"leadership","creativity","communication"};
		engineer.setSkills(skill);
		
		
		Degree degree1=new Degree();
		Degree degree2=new Degree();
		
		degree1.setName("BE");
		degree1.setDuration(4);
		degree1.setPursuing(false);
		degree1.setPercentage(75.0d);
		degree1.setBranch("civil");
		
		degree2.setName("BE");
		degree2.setDuration(4);
		degree2.setPursuing(false);
		degree2.setPercentage(85.0d);
		degree2.setBranch("mechanical");
		
		
		Degree[] degree= {degree1,degree2};
		engineer.setDegree(degree);
		engineer.display();
		
		
		
	}

	}
