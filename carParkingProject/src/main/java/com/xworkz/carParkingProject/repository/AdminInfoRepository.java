package com.xworkz.carParkingProject.repository;

import java.util.Collections;
import java.util.List;
import com.xworkz.carParkingProject.entity.AdminInfoEntity;

public interface AdminInfoRepository {

	public boolean save(AdminInfoEntity entity);

	default public List<AdminInfoEntity> findByLocation(String location) {
		return Collections.emptyList();
	}

	AdminInfoEntity findByLocationTypeClassficationDays(String location, String type, String classfication, int days);

}
