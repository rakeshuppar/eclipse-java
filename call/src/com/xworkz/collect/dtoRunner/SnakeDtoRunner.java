package com.xworkz.collect.dtoRunner;

import com.xworkz.collect.dto.SnakeDTO;
import com.xworkz.collect.constants.snake.Type;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.collect.dtorepository.SnakeRepository;
import com.xworkz.collect.dtorepository.SnakeRepositoryImp;
import com.xworkz.collect.dtoservice.SnakeService;
import com.xworkz.collect.dtoservice.SnakeServiceImp;

public class SnakeDtoRunner {

	public static void main(String[] args) {

		SnakeDTO snake = new SnakeDTO(1, "Cobra", "Bangalore", Type.NONPOISIONOUS);
		SnakeDTO snake1 = new SnakeDTO(2, "Anakonda", "Mysore", Type.POISIONUS);
		SnakeDTO snake2 = new SnakeDTO(3, "Wiper", "Tumkur", Type.POISIONUS);
		SnakeDTO snake3 = new SnakeDTO(4, "King ", "Dharawad", Type.NONPOISIONOUS);
		SnakeDTO snake4 = new SnakeDTO(5, "Phython", "Hubli", Type.POISIONUS);

		SnakeRepository repo = new SnakeRepositoryImp();

		SnakeService service = new SnakeServiceImp(repo);
		service.validThenSave(snake);
		service.validThenSave(snake1);
		service.validThenSave(snake2);
		service.validThenSave(snake3);
		service.validThenSave(snake4);

		System.out.println("----------------find by id------------------");

		Optional<SnakeDTO> ref1 = service.findById(4);
		if (ref1.isPresent()) {
			System.out.println("snake dto is present:" + ref1.get());
		} else {
			System.err.println("snake dto is not present");
		}

		System.out.println("----------------find by name----------------");

		Optional<SnakeDTO> ref2 = service.findbyName("Cobra");
		if (ref2.isPresent()) {
			System.out.println("snake dto is present:" + ref2.get());
		} else {
			System.err.println("snake dto is not present");
		}

		System.out.println("----------find by place and name----------");

		Optional<SnakeDTO> ref3 = service.findbyNameAndPlace("Cobra", "Bangalore");
		if (ref3.isPresent()) {
			System.out.println("snake dto is present:" + ref3.get());

		} else {
			System.err.println("snake dto is not present");
		}

		System.out.println("----------find by Type Poisionus----------");

		Optional<Collection<SnakeDTO>> optlist = service.findbyType(Type.POISIONUS);

		if (optlist.isPresent()) {
			System.out.println("dto is present");
			Collection<SnakeDTO> ref = optlist.get();
			for (SnakeDTO snakeDTO : ref) {
				System.out.println(snakeDTO);
			}

		} else {
			System.err.println("dto is not present");
		}

	}
}
