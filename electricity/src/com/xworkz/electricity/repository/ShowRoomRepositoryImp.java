package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.ShowRoomDTO;

public class ShowRoomRepositoryImp implements ShowRoomRepository {

	private Collection<ShowRoomDTO> show = new ArrayList<>();

	@Override
	public boolean save(ShowRoomDTO repo) {
		System.out.println("Running save method in ShowRoomRepositoryImp");
		return this.show.add(repo);
	}

}
