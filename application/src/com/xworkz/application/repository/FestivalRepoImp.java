package com.xworkz.application.repository;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class FestivalRepoImp implements FestivalRepository {

	private FestivalDTO[] fest = new FestivalDTO[5];
	private int festivalindex = 0;

	@Override
	public boolean save(FestivalDTO dto) throws RuntimeException {
		System.out.println("Running save in Festival Repository Implements" + dto);

		if (this.festivalindex < this.fest.length) {
			this.fest[festivalindex] = dto;
			System.out.println("repo is saved at index:" + this.festivalindex + " " + dto);
			this.festivalindex++;
			return true;
		} else {
			System.err.println("memory is full,cannot add more files,maximum allow");
			throw new FestivalMemoryFullException("handle the exception");
		}
	}
}
