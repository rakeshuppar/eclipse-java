package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.AmbulanceDTO;

public class AmbulanceRepositoryImp implements AmbulanceRepository {

	private Collection<AmbulanceDTO> ambulance=new ArrayList<>();
	@Override
	public boolean save(AmbulanceDTO dto) {
		System.out.println("Running save Method in AmbulanceRepository Imp");
		return this.ambulance.add(dto);
	}

}
