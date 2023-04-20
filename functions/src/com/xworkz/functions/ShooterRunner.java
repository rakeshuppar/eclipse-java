package com.xworkz.functions;

public class ShooterRunner {
	
	public static void main(String[] args) {
		Shooter shooter=(arg)->{
			System.out.println("running function method by exiplicit :" + arg);
			return false;
		};
		ShooterUtil.tests(shooter);
		
		System.out.println("------------
	}

}
