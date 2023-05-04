package com.xworkz.showRoom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.PolishDTO;

@Component
public class PolishRepositoryImp implements PolishRepository {

	private Collection<PolishDTO> dtos = new ArrayList<>();

	public boolean save(PolishDTO dto) {
		System.out.println("Running save method in PolishRepositoryImp");
		return dtos.add(dto);
	}

}
