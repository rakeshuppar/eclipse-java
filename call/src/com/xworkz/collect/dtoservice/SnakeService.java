package com.xworkz.collect.dtoservice;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.collect.constants.snake.Type;
import com.xworkz.collect.dto.SnakeDTO;

public interface SnakeService {

	boolean validThenSave(SnakeDTO repo);

	Optional<SnakeDTO> findById(int id);

	default Optional<SnakeDTO> findbyName(String name) {
		return Optional.empty();
	}

	default Optional<SnakeDTO> findbyNameAndPlace(String name, String place) {
		return Optional.empty();
	}

	default Optional<Collection<SnakeDTO>> findbyType(Type type) {
		return Optional.empty();
	}

}
