package com.xworkz.collect.dtorepository;

import com.xworkz.collect.constants.snake.Type;
import com.xworkz.collect.dto.SnakeDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class SnakeRepositoryImp implements SnakeRepository {

	private Collection<SnakeDTO> snake = new ArrayList<>();

	@Override
	public boolean save(SnakeDTO snakeDto) {
		System.out.println("Running savemethod in snakeDTO Repository Imp");
		return this.snake.add(snakeDto);
	}

	@Override
	public Optional<SnakeDTO> findById(int id) {
		for (SnakeDTO snakeDto : snake) {
			if (snakeDto.getId() == id) {
				return Optional.of(snakeDto);
			}
		}
		return Optional.empty();
	}

	@Override
	public Optional<SnakeDTO> findbyName(String name) {
		for (SnakeDTO snakeDto : snake) {
			if (snakeDto.getName().equals(name)) {
				return Optional.of(snakeDto);
			}

		}

		return Optional.empty();
	}

	@Override
	public Optional<SnakeDTO> findbyNameAndPlace(String name, String place) {
		for (SnakeDTO snakeDto : snake) {
			if (snakeDto.getName().equals(name) && snakeDto.getPlace().equals(place)) {
				return Optional.of(snakeDto);
			}

		}
		return Optional.empty();
	}

	@Override
	public Optional<Collection<SnakeDTO>> findbyType(Type type) {
		if (!snake.isEmpty()) {
			Collection<SnakeDTO> list = snake.stream().filter(e -> e.getType().equals(type))
					.collect(Collectors.toList());
			return Optional.of(list);
		}

		return Optional.empty();
	}

}