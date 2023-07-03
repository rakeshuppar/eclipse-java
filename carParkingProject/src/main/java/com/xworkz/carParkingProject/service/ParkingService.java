package com.xworkz.carParkingProject.service;

import com.xworkz.carParkingProject.dto.ParkingDTO;

public interface ParkingService {

//	public boolean validate(ParkingDTO dto);
	
	public ParkingDTO signIn(String email,String password);
	
	

}
