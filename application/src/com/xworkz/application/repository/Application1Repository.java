package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDTO1;
import com.xworkz.application.exception.InvalidFestivalException;

public interface Application1Repository {
	
	public boolean save(ApplicationDTO1 dto) throws InvalidFestivalException;

}
