package com.xworkz.application.repository;

import com.xworkz.application.dto.DairyDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class DairyRepositoryImp implements DairyRepository {

	private DairyDTO[] dairy = new DairyDTO[4];
	private int dairyindex = 0;

	@Override
	public boolean save(DairyDTO dto) {

		if (this.dairyindex < this.dairy.length) {
			this.dairy[dairyindex] = dto;
			System.out.println("repo is Saved at index:" + this.dairyindex + " " + dto);
			this.dairyindex++;
			return true;
		} else {
			System.err.println("memory is full cant save the data");
			throw new FestivalMemoryFullException(
					"Memory Full Exception is Handled by FestivalMemoryFullException, Will terminate");
		}
	}

	@Override
	public boolean isExist(DairyDTO dto) {
		if (this.dairyindex == 0) {
			System.out.println("first element will not check");
			return false;
		} else {
			System.err.println("second elements will onwards check");
			for (int i = 0; i < dairyindex; i++) {
				DairyDTO temp = dairy[i];
				if (temp.equals(dto)) {
					System.out.println("dto is aleady exists");
					return true;
				}

			}
		}
		return false;
	}

	@Override
	public boolean find(DairyDTO dto) {
		for (int i = 0; i < dairyindex; i++) {
			DairyDTO temp = dairy[i];
			if (temp.equals(dto)) {
				System.out.println("dto is present:" + dto);
			}

		}
		return false;
	}

	@Override
	public DairyDTO findByName(String name) {
		for (int i = 0; i < dairyindex; i++) {
			DairyDTO temp = dairy[i];
			if (temp.getName().equals(name)) {
				System.out.println("name is present:" + name);
				return temp;
			}
		}
		return null;
	}

	@Override
	public double openFindByName(String name) {

		for (int i = 0; i < dairyindex; i++) {
			DairyDTO temp = dairy[i];
			if (temp.getName().equals(name)) {
				System.out.println("Name is present:" + name);
				return dairy[i].getOpen();
			}

		}
		return 0;
	}

	@Override
	public DairyDTO findByNameorOpenorClose(String name, double open, double close) {
		for (int i = 0; i < dairyindex; i++) {
			DairyDTO temp = dairy[i];
			if (temp.getName().equals(name) || temp.getOpen() == open || temp.getClose() == close) {
				System.out.println(
						"name is present:" + name + "  open is present:" + open + "  close is present:" + close);
				return temp;
			}

		}

		return null;
	}

	@Override
	public DairyDTO[] findAll() {

		if (dairyindex != 0) {
			return dairy;
		}

		return null;
	}

	@Override
	public double openFindByNameAndClose(String name, double close) {

		for (int i = 0; i < this.dairyindex; i++) {
			DairyDTO temp = this.dairy[i];
			if (temp.getName().equals(name) && temp.getClose() == close) {
				System.out.println("name is present:" + name + " close is present:" + close);
				return dairy[i].getOpen();
			}

		}
		return 0;
	}

	@Override
	public int total() {

		return this.dairyindex;
	}

}
