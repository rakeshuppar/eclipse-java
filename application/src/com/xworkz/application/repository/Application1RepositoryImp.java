package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDTO1;

public class Application1RepositoryImp implements Application1Repository {

	private ApplicationDTO1[] apps = new ApplicationDTO1[5];
	private int appsindex = 0;

	@Override
	public boolean save(ApplicationDTO1 dto) {
		System.out.println("Running save in Application1 Repository Implementation:" + dto);

		if (this.appsindex < this.apps.length) {
			this.apps[appsindex] = dto;
			this.appsindex++;
			return true;
		} else {
			System.err.println("Memory is full,cannot add more files");
			return false;
		}

	}
}
