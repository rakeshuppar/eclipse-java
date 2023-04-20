package com.xworkz.application.service;

import com.xworkz.application.dto.HeadphoneDTO;
import com.xworkz.application.exception.InvalidFestivalException;

public interface HeadphoneService {

	public boolean validThenSave(HeadphoneDTO head) throws InvalidFestivalException;

}
