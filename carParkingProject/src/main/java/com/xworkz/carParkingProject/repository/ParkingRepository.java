package com.xworkz.carParkingProject.repository;

import com.xworkz.carParkingProject.entity.ParkingEntity;

public interface ParkingRepository {


	ParkingEntity findByEmail(String email);
	
	public boolean updateLoginTime(ParkingEntity entity);

	
}
