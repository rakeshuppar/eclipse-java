package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.PoliceStationDTO;

public class PoliceStationRepositoryImp implements PoliceStationRepository {

	private Collection<PoliceStationDTO> police = new ArrayList<PoliceStationDTO>();

	@Override
	public boolean save(PoliceStationDTO repo) {
		System.out.println("Running save Method in policestationRepo Impl");
		return this.police.add(repo);
	}

}
