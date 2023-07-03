package com.xworkz.carParkingProject.service;

import java.util.Collections;
import java.util.List;
import com.xworkz.carParkingProject.dto.AdminInfoDTO;

public interface AdminInfoService {

	public boolean validThenSave(AdminInfoDTO dto);

	default public List<AdminInfoDTO> findByLocation(String location) {
		return Collections.emptyList();
	}

	default AdminInfoDTO isExist(String location, String type, String classifiction, int days) {
		return null;
	}
}
