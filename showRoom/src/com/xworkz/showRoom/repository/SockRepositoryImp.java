package com.xworkz.showRoom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.SockDTO;

@Component
public class SockRepositoryImp implements SockRepository {

	private Collection<SockDTO> soc = new ArrayList<>();

	@Override
	public boolean save(SockDTO dto) {
		System.out.println("Running save method in SockRepositoryImp");
		return this.soc.add(dto);
	}

}
