package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constants.weapon.Type;
import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.WeaponRepository;

public class WeaponServiceImp implements WeaponService {
	
	private WeaponRepository repo;
	
	public WeaponServiceImp(WeaponRepository repo) {
		this.repo= repo;
	}
	@Override
	public boolean validAndSave(WeaponDTO dto) throws InvalidFestivalException {
		System.out.println("Running Valid and Save in Weapon Implementation");

		if (dto != null) {
			System.out.println("dto is not null,will valid the Properties");

			int id = dto.getId();
			String name = dto.getName();
			Type type = dto.getType();
			double cost = dto.getCost();
			String material = dto.getMaterial();
			String made = dto.getMadeBy();
			String manufacture = dto.getManufacuredBy();
			LocalDate date = dto.getDate();
			String by = dto.getUsedBy();
			String fo = dto.getUsedFor();
			double weight = dto.getWeight();

			boolean validId = false;
			boolean validName = false;
			boolean validType = false;
			boolean validCost = false;
			boolean validMaterial = false;
			boolean validMadeBy = false;
			boolean validManufacturedBy = false;
			boolean validDate = false;
			boolean validUsedBy = false;
			boolean validUsedFor = false;
			boolean validWeight = false;

			if (id > 0) {
				System.out.println("valid id");
				validId = true;

			} else {
				System.err.println("invalid id");
			}

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("valid name");
				validName = true;

			} else {
				System.err.println("invalid name");
			}

			if (type != null) {
				System.out.println("valid Type");
				validType = true;
			} else {
				System.err.println("invaid Type");
			}

			if (cost > 100 && cost < 100000) {
				System.out.println("valid cost");
				validCost = true;
			} else {
				System.err.println("invalid cost");
			}

			if (material != null && !material.isEmpty() && material.length() > 3 && material.length() < 30) {
				System.out.println("valid material");
				validMaterial = true;
			} else {
				System.err.println("invalid material");
			}

			if (made != null && !made.isEmpty() && made.length() > 3 && made.length() < 30) {
				System.out.println("valid made by");
				validMadeBy = true;
			} else {
				System.err.println("invalid made by");
			}

			if (manufacture != null && !manufacture.isEmpty() && manufacture.length() > 3
					&& manufacture.length() < 30) {
				System.out.println("valid Manufactured By");
				validManufacturedBy = true;
			} else {
				System.err.println("invalid Manufactured By");
			}

			LocalDate today = LocalDate.now();
			LocalDate past = LocalDate.of(2000, 1, 1);

			if (date != null && date.isBefore(today) && date.isAfter(past)) {
				System.out.println("valid Date");
				validDate = true;
			} else {
				System.err.println("invalid Date");
			}

			if (by != null && !by.isEmpty() && by.length() > 3 && by.length() < 30) {
				System.out.println("valid Used By");
				validUsedBy = true;
			} else {
				System.err.println("invalid Used By");
			}

			if (fo != null && !fo.isEmpty() && fo.length() > 3 && fo.length() < 30) {
				System.out.println("valid Used For ");
				validUsedFor = true;
			} else {
				System.err.println("invalid Used For");
			}

			if (weight > 250 && weight < 1000) {
				System.out.println("valid weight");
				validWeight = true;
			} else {
				System.err.println("invalid weight");
			}

			if (validId && validName && validType && validCost && validMaterial && validMadeBy && validManufacturedBy
					&& validDate && validUsedBy && validUsedFor && validWeight) {
				System.out.println("valid And Then Save");
				boolean save=this.repo.save(dto);
				return save;
			} else {
				System.err.println("invalid");
				throw new InvalidFestivalException("Invalid Exception is by InvalidFestivalException, Data terminate");
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}
}
