package com.xworkz.electricity.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidationUtil<T> {

	public boolean validationUtil(T t) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validate = factory.getValidator();

		Set<ConstraintViolation<T>> constraintViolation = validate.validate(t);
		System.err.println("number of cobnstraints:" + constraintViolation.size());
		constraintViolation.forEach(cv -> System.out.println(cv.getPropertyPath() + "  " + cv.getMessage()));
		return constraintViolation.isEmpty();

	}
}
