package com.xworkz.collect.dtoservice;

import com.xworkz.collect.util.SnakeUtil;

import java.util.Collection;
import java.util.Optional;
import com.xworkz.collect.constants.snake.Type;
import com.xworkz.collect.dto.SnakeDTO;
import com.xworkz.collect.dtorepository.SnakeRepository;

public class SnakeServiceImp implements SnakeService {

	private SnakeRepository repo;

	public SnakeServiceImp(SnakeRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(SnakeDTO dto) {
		System.out.println("Running validThen Save in SnakeService imp");
		if (dto != null) {
			System.out.println("dto is not null");

			int id = dto.getId();
			String name = dto.getName();
			String place = dto.getPlace();
			Type type = dto.getType();

			boolean validId = false;
			boolean validName = false;
			boolean validPlace = false;
			boolean validType = false;

			if (SnakeUtil.validint(id)) {
				System.out.println("valid id");
				validId = true;
			} else {
				System.err.println("invalid id");
			}

			if (SnakeUtil.validString(name)) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.err.println("invalid name");
			}

			if (SnakeUtil.validString(place)) {
				System.out.println("valid place");
				validPlace = true;
			} else {
				System.err.println("invalid place");
			}

			if (type != null) {
				System.out.println("valid colour");
				validType = true;
			} else {
				System.err.println("invalid colour");
			}

			if (SnakeUtil.vaildFlag(validId, validName, validPlace, validType)) {
				System.out.println("All properties are valid and Then save data");
				boolean save = this.repo.save(dto);
				return save;
			} else {
				System.err.println("not valid data");
			}

		}
		return false;
	}

	@Override
	public Optional<SnakeDTO> findById(int id) {
		if (SnakeUtil.validint(id)) {
			Optional<SnakeDTO> ref = this.repo.findById(id);
			return ref;

		}

		return null;
	}

	@Override
	public Optional<SnakeDTO> findbyName(String name) {
		if (SnakeUtil.validString(name)) {
			Optional<SnakeDTO> ref1 = this.repo.findbyName(name);
			return ref1;
		}
		return null;
	}

	@Override
	public Optional<SnakeDTO> findbyNameAndPlace(String name, String place) {
		if (SnakeUtil.validString(name) && SnakeUtil.validString(place)) {
			Optional<SnakeDTO> ref2 = this.repo.findbyNameAndPlace(name, place);
			return ref2;
		}
		return null;
	}

	@Override
	public Optional<Collection<SnakeDTO>> findbyType(Type type) {
		if (type != null) {
			Optional<Collection<SnakeDTO>> list = this.repo.findbyType(Type.POISIONUS);
			return list;
		}
		return Optional.empty();
	}

}