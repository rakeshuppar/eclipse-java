package com.xworkz.application.repository;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class FestivalRepoImp implements FestivalRepository {

	private FestivalDTO[] fest = new FestivalDTO[3];
	private int festivalindex = 0;

	@Override
	public boolean save(FestivalDTO dto) {
		System.out.println("Running save in Festival Repository Implements" + dto);

		if (this.festivalindex < this.fest.length) {
			this.fest[festivalindex] = dto;
			System.out.println("repo is saved at index:" + this.festivalindex + " " + dto);
			this.festivalindex++;
			return true;
		} else {
			System.err.println("memory is full,cannot add more files,maximum allow");
			throw new FestivalMemoryFullException("Memory Full Exception is Handled by FestivalMemoryFullException, Will terminate");
		}

	}

	@Override
	public boolean isExist(FestivalDTO dto) {
		if (this.festivalindex == 0) {
			System.out.println("first element,will not check");
			return false;
		} else {
			System.err.println("second element onwards will check");
			for (int index = 0; index < this.festivalindex; index++) {
				FestivalDTO tempDTO = this.fest[index];
				if (tempDTO.equals(dto)) {
					System.out.println("Festival already exists:" + tempDTO);
					return true;
				}
			}
		}
		return false;

	}
}