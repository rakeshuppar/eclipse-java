package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.AmbulanceDTO;
import com.xworkz.electricity.repository.AmbulanceRepository;

public class AmbulanceServiceImp implements AmbulanceService {

	private AmbulanceRepository repo;

	public AmbulanceServiceImp(AmbulanceRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(AmbulanceDTO dto) {
		System.out.println("Running valid then save in Ambulance Service Imp :" + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

			Validator validate = factory.getValidator();

			Set<ConstraintViolation<AmbulanceDTO>> constraintViolation = validate.validate(dto);
			if (constraintViolation != null && !constraintViolation.isEmpty()) {
				System.err.println("num of constraints:" + constraintViolation.size());
				constraintViolation.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
				return false;
			} else {
				return this.repo.save(dto);
			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
