package com.xworkz.showRoom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showRoom.dto.SalesManagerDTO;

@Component
public class SalesMangerRepositoryImp implements SalesManagerRepository {

	private Collection<SalesManagerDTO> coll = new ArrayList<SalesManagerDTO>();

	@Override
	public boolean save(SalesManagerDTO dto) {
		System.out.println("Running save method in SalesMangerRepositoryImp ");
		return this.coll.add(dto);
	}

}
