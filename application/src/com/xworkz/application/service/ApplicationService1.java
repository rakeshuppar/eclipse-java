package com.xworkz.application.service;

import com.xworkz.application.dto.ApplicationDTO1;
import com.xworkz.application.exception.InvalidFestivalException;

public interface ApplicationService1 {

	boolean validThenSave(ApplicationDTO1 dto) throws InvalidFestivalException;

}
