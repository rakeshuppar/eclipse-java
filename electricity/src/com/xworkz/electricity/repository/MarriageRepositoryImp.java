package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.MarriageDTO;

public class MarriageRepositoryImp implements MarriageRepository {

	private Collection<MarriageDTO> marriage = new ArrayList<MarriageDTO>();

	@Override
	public boolean save(MarriageDTO repo) {
		System.out.println("Running save method in marriage Repository imp");
		return this.marriage.add(repo);
	}

}
