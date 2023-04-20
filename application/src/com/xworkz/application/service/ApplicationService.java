package com.xworkz.application.service;

import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.exception.InvalidFestivalException;

public interface ApplicationService {

	boolean validThenSave(ApplicationDTO app) throws InvalidFestivalException;

}
