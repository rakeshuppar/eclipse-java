package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationRepoImp implements ApplicationRepository {

	private ApplicationDTO[] apps = new ApplicationDTO[5];
	private int appsindex = 0;

	@Override
	public boolean save(ApplicationDTO dto) {
		System.out.println("Running save in Application Repository implementation:" + dto);

		if (this.appsindex < this.apps.length) {
			this.apps[appsindex] = dto;
			this.appsindex++;
			return true;
		} else {
			System.err.println("memory is full,cannot add more files,maximum allow");
			return false;
		}
		
	}

}
