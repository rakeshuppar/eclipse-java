package com.xworkz.interview.boot.overrideRunner;

import com.xworkz.interview.boot.override.IcelandResort;
import com.xworkz.interview.boot.override.Resort;

public class ResortRunner {

	public static void main(String[] args) {

		Resort resort = new IcelandResort();
		String name = resort.Name();
		String id = resort.Id();
		String ownerName = resort.OwnerName();
		long mobileNumber = resort.MobileNumber();

		System.out.println("ResortName is:" + name);
		System.out.println("id is:" + id);
		System.out.println("ownerName is:" + ownerName);
		System.out.println("mobile number is: " + mobileNumber);

	}

}
