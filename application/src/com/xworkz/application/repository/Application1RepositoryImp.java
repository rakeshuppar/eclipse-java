package com.xworkz.application.repository;

import com.xworkz.application.dto.ApplicationDTO1;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class Application1RepositoryImp implements Application1Repository {

	private ApplicationDTO1[] apps = new ApplicationDTO1[5];
	private int appsindex = 0;

	@Override
	public boolean save(ApplicationDTO1 dto) {
		System.out.println("Running save in Application1 Repository Implementation");

		if (this.appsindex < this.apps.length) {
			this.apps[appsindex] = dto;
			System.out.println("repo is saved at index:" + this.appsindex + " " + dto);
			this.appsindex++;
			return true;
		} else {
			System.err.println("Memory is full,cannot add more files");
			throw new FestivalMemoryFullException("Memory Full Exception is Handled by FestivalMemoryFullException, Will terminate");
		}

	}
}
