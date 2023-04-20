package com.xworkz.application.service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.InvalidFestivalException;

public interface DesertService {
	
  
	public boolean validThensave(DesertDTO dto) throws InvalidFestivalException;
	
	public boolean isExist(DesertDTO dto) throws InvalidFestivalException; 
	
	public DesertDTO find(DesertDTO dto) throws InvalidFestivalException;
	
	public DesertDTO findByName(String name);
	
	public double findAreaByName(String name);
	
	public DesertDTO findByNameAndCountryAndArea(String name,String country,double area);

	int total();
	
	
	

}
