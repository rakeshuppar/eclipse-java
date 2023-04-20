package com.xworkz.application.repository;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class DesertRepositoryImp implements DesertRepository {

	private DesertDTO[] desert = new DesertDTO[14];
	private int desertIndex = 0;

	@Override
	public boolean save(DesertDTO repo) {
		System.out.println("Running save in Desert Repository implementation");

		if (this.desertIndex < this.desert.length) {
			this.desert[desertIndex] = repo;
			System.out.println("repo is saved at index:" + this.desertIndex + " " + repo);
			this.desertIndex++;
			return true;
		} else {
			System.err.println("memory is full,cannot add more files,maximum allow");
			throw new FestivalMemoryFullException(
					"Memory Full Exception is Handled by FestivalMemoryFullException, Will terminate");

		}
	}

	@Override
	public DesertDTO find(DesertDTO dto) {
		for (int i = 0; i < this.desertIndex; i++) {
			DesertDTO temp = this.desert[i];
			if (temp.equals(dto)) {
				System.out.println("dto is present:" + dto);
				return temp;
			}
		}

		return null;
	}

	@Override
	public DesertDTO findByName(String name) {
		for (int i = 0; i < this.desertIndex; i++) {
			DesertDTO temp = this.desert[i];
			if (temp.getName().equals(name)) {
				System.out.println("dto is present:" + name);
				return temp;
			}
		}
		return null;
	}

	@Override
	public double findAreaByName(String name) {
		for (int i = 0; i < this.desertIndex; i++) {
			DesertDTO temp = this.desert[i];
			if (temp.getName().equals(name)) {
				System.out.println("dto is present:" + name);
				return desert[i].getArea();
			}
		}
		return 0;
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area) {
		for (int i = 0; i < this.desertIndex; i++) {
			DesertDTO temp = this.desert[i];
			if (temp.getName().equals(name) && temp.getCountry().equals(country) && temp.getArea() == area) {
				System.out.println("dto is present:" + name);
				return temp;
			}
		}
		return null;

	}

	@Override
	public int total() {
		return this.desertIndex;
	}

	@Override
	public boolean isExist(DesertDTO dto) {
		if (this.desertIndex == 0) {
			System.out.println("first element will not check");
			return false;
		} else {
			System.err.println("second elements will onwards check");
			for (int i = 0; i < desertIndex; i++) {
				DesertDTO temp = desert[i];
				if (temp.equals(dto)) {
					System.out.println("dto is aleady exists");
					return true;
				}

			}
		}
		return false;
	}

}
