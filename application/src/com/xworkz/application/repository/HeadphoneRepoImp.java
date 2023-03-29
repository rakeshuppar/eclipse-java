package com.xworkz.application.repository;

import com.xworkz.application.dto.HeadphoneDTO;

public class HeadphoneRepoImp implements HeadphoneRepository {

	private HeadphoneDTO[] heads = new HeadphoneDTO[5];
	private int headsindex = 0;

	@Override
	public boolean save(HeadphoneDTO dto) {
		System.out.println("Running save in headphone repository implementation:" + dto);

		if (this.headsindex < this.heads.length) {
			this.heads[headsindex] = dto;
			this.headsindex++;
			return true;
		} else {
			System.err.println("memory is full,cannot add more files,maximum allow");
			return false;
		}

	}

}
