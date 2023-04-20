package com.xworkz.application.repository;

import com.xworkz.application.dto.HeadphoneDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class HeadphoneRepoImp implements HeadphoneRepository {

	private HeadphoneDTO[] heads = new HeadphoneDTO[5];
	private int headsindex = 0;

	@Override
	public boolean save(HeadphoneDTO dto) {
		System.out.println("Running save in headphone repository implementation:" + dto);

		if (this.headsindex < this.heads.length) {
			this.heads[headsindex] = dto;
			System.out.println("repo is saved at index:" + this.headsindex + " " + dto);
			this.headsindex++;
			return true;
		} else {
			System.err.println("memory is full,cannot add more files,maximum allow");
			throw new FestivalMemoryFullException("Memory Full Exception is Handled by FestivalMemoryFullException, Will terminate");
		}

	}

}
