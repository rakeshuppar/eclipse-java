package com.xworkz.carParkingProject.service;

import com.xworkz.carParkingProject.dto.UserDTO;
import com.xworkz.carParkingProject.dto.UserInfoDTO;

public interface UserService {

	default boolean validThanSave(UserDTO dto,UserInfoDTO infodto) {
		return false;
	}

	default boolean isUserExist(String email) {
		return false;
	}
	
	

}
