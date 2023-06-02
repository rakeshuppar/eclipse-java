package com.xworkz.isckon.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.isckon.dto.IsckonDTO;
import com.xworkz.isckon.repository.IsckonRepository;

public class IsckonServiceImp implements IsckonService {

	private IsckonRepository repo;

	public IsckonServiceImp(IsckonRepository repo) {
		this.repo = repo;
	}
	@Override
	public boolean validateThenSave(IsckonDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<IsckonDTO>> cv = validator.validate(dto);
			if (cv != null & !cv.isEmpty()) {
				System.out.println("no of violations:" + cv.size());
				cv.forEach(c -> System.out.println(c.getPropertyPath() + " " + c.getMessage()));
				return false;
			} else {
				return this.repo.save(dto);
			}
		} else {
			System.out.println("dto is null");
		}
		return false;
	}
	@Override
	public boolean findByGodName(String godName) {
		return this.repo.findByGodName(godName);
	}
	@Override
	public boolean update(String godName) {
		return this.repo.update(godName);
	}
}