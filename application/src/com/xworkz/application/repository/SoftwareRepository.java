package com.xworkz.application.repository;

import com.xworkz.application.dto.SoftwareDTO;

public interface SoftwareRepository {
	
	public boolean save(SoftwareDTO repo);
	
	default boolean isExist(SoftwareDTO repo) {
		
		return false;
		
	}
	
	default int totalSaved() {
		return 0;
		
	}

	default boolean isExist() {
		return false;
	}
	
	default SoftwareDTO findById(int id) {
		
		return null;
		
	}
	
	default SoftwareDTO findByName(String name) {
		return null;
		
	}
	
	default SoftwareDTO findByNameAndId(String name, int id) {
		return null;
		
	}
	
	
}
