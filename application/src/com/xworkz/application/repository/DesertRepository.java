package com.xworkz.application.repository;

import com.xworkz.application.dto.DesertDTO;

public interface DesertRepository {

	public boolean save(DesertDTO dto);
	
	public boolean isExist(DesertDTO dto);

	public DesertDTO find(DesertDTO dto);

	public DesertDTO findByName(String name);

	public double findAreaByName(String name);

	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area);

	int total();

}
