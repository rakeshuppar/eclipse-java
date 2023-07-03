package com.xworkz.carParkingProject.repository;

import com.xworkz.carParkingProject.entity.UserEntity;
import com.xworkz.carParkingProject.entity.UserInfoEntity;

public interface UserRepository {
	
	default UserEntity findByUserEmail(String email) {
		return null;
	}
	
	default boolean save(UserEntity entity) {
		return false;
	}
	
	default boolean saveUserParkingInfo(UserInfoEntity entity) {
		return false;
	}
	
	

}
