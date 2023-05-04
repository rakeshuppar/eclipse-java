package com.xworkz.showRoom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.showRoom.dto.ShowRoomDTO;
import com.xworkz.showRoom.repository.ShowRoomRepository;

@Component
public class ShowRoomServiceImp implements ShowRoomService {

	@Autowired
	private Validator validator;
	private ShowRoomRepository repo;

	public ShowRoomServiceImp(ShowRoomRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(ShowRoomDTO dto) {
		System.out.println("Running validThenSave method in ShowRoomServiceImp");

		if (dto != null) {
			System.out.println("dto is not null");

			Set<ConstraintViolation<Object>> con = validator.validate(dto);
			if (con != null && !con.isEmpty()) {
				System.err.println("num of constraints:" + con.size());
				con.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
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
