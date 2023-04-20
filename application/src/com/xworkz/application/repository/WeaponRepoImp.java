package com.xworkz.application.repository;

import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class WeaponRepoImp implements WeaponRepository {

	private WeaponDTO[] wea = new WeaponDTO[5];
	private int weaindex = 0;

	@Override
	public boolean save(WeaponDTO dto) {
		System.out.println("Running save in Weapon Repository implementation");

		if (this.weaindex < this.wea.length) {
			this.wea[weaindex] = dto;
			System.out.println("repo is saved at index:" + this.weaindex + " " + dto);
			weaindex++;
			return true;
		} else {
			System.err.println("memory is full,cannot add more files,maximum allow");
			throw new FestivalMemoryFullException("Memory Full Exception is Handled by FestivalMemoryFullException, Will terminate");
		}

	}
}
