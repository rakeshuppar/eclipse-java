package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.PoliceStationDTO;
import com.xworkz.electricity.repository.PoliceStationRepository;
import com.xworkz.electricity.util.ValidationUtil;

public class PoliceStationServiceImp implements PoliceStationService {

	private PoliceStationRepository repo;
	private ValidationUtil<PoliceStationDTO> police = new ValidationUtil<>();

	public PoliceStationServiceImp(PoliceStationRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(PoliceStationDTO dto) {
		System.out.println("Running validthen save in police station service impl:" + dto);

		if (dto != null) {
			System.out.println("dto is not null");

			if (!police.validationUtil(dto)) {
				return false;
			} else {
				return this.repo.save(dto);
			}

		} else {
			System.out.println("dto is null");
		}

		return false;
	}

}
