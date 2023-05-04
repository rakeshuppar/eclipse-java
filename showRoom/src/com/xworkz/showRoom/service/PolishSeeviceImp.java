package com.xworkz.showRoom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.PolishDTO;
import com.xworkz.showRoom.repository.PolishRepository;

@Component
public class PolishSeeviceImp implements PolishService {

	@Autowired
	private Validator validator;
	private PolishRepository repo;

	public PolishSeeviceImp(PolishRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(PolishDTO dto) {
		System.out.println("Running valid then save in PolishSeeviceImp:" + dto);
		if (dto != null) {
			System.out.println("dto is not null");

			Set<ConstraintViolation<PolishDTO>> constraintViolation = validator.validate(dto);
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
