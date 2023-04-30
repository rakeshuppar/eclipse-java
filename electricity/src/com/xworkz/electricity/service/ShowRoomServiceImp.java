package com.xworkz.electricity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import com.xworkz.electricity.dto.ShowRoomDTO;
import com.xworkz.electricity.repository.ShowRoomRepository;

public class ShowRoomServiceImp implements ShowRoomService {

	private ShowRoomRepository repo;

	public ShowRoomServiceImp(ShowRoomRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(ShowRoomDTO dto) {
		System.out.println("Running validThenSave in ShowRoomServiceImp:" + dto);

		if (dto != null) {
			System.out.println("dto is not null");
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<ShowRoomDTO>> constraintViolation = validator.validate(dto);
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
