package xworkz.com.boot.main;

public class Engineer {
	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degrees;

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	public void setDegree(Degree[]degrees) {
		this.degrees=degrees;
		
	}

	public void display() {

	System.out.println("name:"+this.name);
	System.out.println("salary:"+this.salary);
	

		if (this.skills != null) {
			for (int seq = 0; seq < this.skills.length; seq++) {
				String element = this.skills[seq];
				System.out.println(element + "  at index " + seq );
				
			}
		} else
			System.out.println();
		

		
		
		if (this.degrees!=null) {
			for (int seq =0;seq<this.degrees.length;seq++) {
				Degree degree=this.degrees[seq];
				System.out.println(seq);
				degree.display();
			}
		}
		else
			System.out.println();
	}
}


