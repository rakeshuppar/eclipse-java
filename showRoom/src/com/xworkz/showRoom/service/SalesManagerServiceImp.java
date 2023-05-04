package com.xworkz.showRoom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.SalesManagerDTO;
import com.xworkz.showRoom.repository.SalesManagerRepository;

@Component
public class SalesManagerServiceImp implements SalesManagerService {

	@Autowired
	private Validator validator;
	private SalesManagerRepository repo;

	public SalesManagerServiceImp(SalesManagerRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(SalesManagerDTO dto) {
		System.out.println("Running validThenSave in SalesManagerServiceImp");

		if (dto != null) {
			System.out.println("dto is not null");

			Set<ConstraintViolation<SalesManagerDTO>> constraintViolation = validator.validate(dto);
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
