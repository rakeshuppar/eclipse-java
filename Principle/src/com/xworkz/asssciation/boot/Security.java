package com.xworkz.asssciation.boot;

public class Security {

	public String deptName;
	public double totalStaff;
	public String headStaff;
	public Company company;

	
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
		System.out.println("deptName:" + this.deptName);
		System.out.println("totalStaff" + this.totalStaff);
		System.out.println("headStaff:+" + this.headStaff);
		if (this.company != null) {
			this.company.display();
			System.out.println("");
			company.display();
		} else {
			System.out.println("this.company is null");
			company.display();
		}

	}

}
