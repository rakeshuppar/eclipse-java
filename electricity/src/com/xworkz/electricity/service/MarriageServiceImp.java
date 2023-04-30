package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.electricity.dto.MarriageDTO;
import com.xworkz.electricity.repository.MarriageRepository;

public class MarriageServiceImp implements MarriageService {

	private MarriageRepository repo;

	public MarriageServiceImp(MarriageRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(MarriageDTO dto) {
		System.out.println("Running ValidThen Save in Marriage Service IMP:" + dto);

		if (dto != null) {
			System.out.println("dto is not null");

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

			Validator validator = factory.getValidator();

			Set<ConstraintViolation<MarriageDTO>> constraintViolation = validator.validate(dto);

			if (constraintViolation != null && !constraintViolation.isEmpty()) {
				System.err.println("number of constraints:" + constraintViolation.size());
				constraintViolation.forEach(cv -> System.out.println(cv.getPropertyPath() + "" + cv.getMessage()));
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
