package com.xworkz.asssciation.boot;

public class Security {

	public String deptName;
	public double totalStaff;
	public String headStaff;
	public Company company;

	public Security() {
		System.out.println("calling with no arg constructor");
	}

	public Security(String deptName, double totalStaff, String headStaff, Company company) {
		this.deptName = deptName;
		this.totalStaff = totalStaff;
		this.headStaff = headStaff;
		this.company = company;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void SettotalStaff(double totalStaff) {
		this.totalStaff = totalStaff;
	}

	public void setHeadStaff(String headStaff) {
		this.headStaff = headStaff;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void display() {
		System.out.println("display of Security");
		System.out.println("Security deptName:" + this.deptName);
		System.out.println("totalStaff in the dept" + this.totalStaff);
		System.out.println("headStaff of the security:+" + this.headStaff);
		if (this.company != null) {
			this.company.display();
			System.out.println("");

		} else {
			System.out.println("this.company is null");
			company.display();
		}

	}

}
