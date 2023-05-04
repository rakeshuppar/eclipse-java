package com.xworkz.showRoom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.SockDTO;
import com.xworkz.showRoom.repository.SockRepository;

@Component
public class SockServiceImp implements SockService {

	@Autowired
	private Validator validator;
	private SockRepository repo;

	public SockServiceImp(SockRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(SockDTO dto) {
		System.out.println("Running validThenSave method in SockServiceImp");

		if (dto != null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<SockDTO>> cv = validator.validate(dto);

			if (cv != null && !cv.isEmpty()) {
				System.err.println("number of constraints:" + cv.size());
				cv.forEach(con -> System.out.println(con.getPropertyPath() + " " + con.getMessage()));
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