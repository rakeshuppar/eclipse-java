package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.FestivalRepository;

public class FestivalServiceImp implements FestivalService {

	private FestivalRepository repo;

	public FestivalServiceImp(FestivalRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(FestivalDTO dto) throws InvalidFestivalException {
		System.out.println("Running validThen save in Festival Service implements");

		if (dto != null) {
			System.out.println("dto is not null");

			int id = dto.getId();
			String name = dto.getName();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			String sweet = dto.getSweet();
			String god = dto.getGodName();

			boolean validId = false;
			boolean validName = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validSweet = false;
			boolean validGodName = false;

			if (id > 0) {
				System.out.println("valid Id");
				validId = true;
			} else {
				System.err.println("Invalid Id");

			}

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("Valid name");
				validName = true;
			} else {
				System.err.println("invalid Name");
			}

			LocalDate start = LocalDate.of(2023, 1, 1);

			if (startDate != null && startDate.isAfter(start)) {
				System.out.println("valid Start Date");
				validStartDate = true;
			} else {
				System.err.println("invalid start Date");
			}

			if (endDate != null && endDate.isAfter(start)) {
				System.out.println("valid End Date");
				validEndDate = true;
			} else {
				System.err.println("invalid End Date");
			}

			if (sweet != null && !sweet.isEmpty() && sweet.length() > 3 && sweet.length() < 30) {
				System.out.println("Valid sweet");
				validSweet = true;
			} else {
				System.err.println("invalid sweet");
			}

			if (god != null && !god.isEmpty() && god.length() > 3 && god.length() < 30) {
				System.out.println("Valid god");
				validGodName = true;
			} else {
				System.err.println("invalid god");

			}

			if (validId && validName && validStartDate && validEndDate && validSweet && validGodName) {
				System.out.println("valid data Then save");
				boolean save = this.repo.save(dto);
				return save;
			} else {
				System.err.println("invalid data");
				throw new InvalidFestivalException("handle the exception");
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
