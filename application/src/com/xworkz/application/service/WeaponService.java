package com.xworkz.application.service;

import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.exception.InvalidFestivalException;

public interface WeaponService {

	boolean validAndSave(WeaponDTO dto) throws InvalidFestivalException;

}
