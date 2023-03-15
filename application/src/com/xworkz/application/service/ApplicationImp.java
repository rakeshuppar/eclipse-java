package com.xworkz.application.service;

import java.time.LocalDate;
import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.dto.ApplicationDTO1;
import com.xworkz.application.service.ApplicationService;

public class ApplicationImp implements ApplicationService {

	@Override
	public boolean validThenSave(ApplicationDTO dto) {
		System.out.println("Running Valid Then Save in ApplicationImp");

		if (dto != null) {
			System.out.println("dto is not null,will valid the properties");

			String name = dto.getName();
			double version = dto.getVersion();
			String devo = dto.getDevelopedBy();
			int size = dto.getSize();
			LocalDate date = dto.getCreatedDate();

			boolean validName = false;
			boolean validVersion = false;
			boolean validDevelopedby = false;
			boolean validSize = false;
			boolean validCreatedBy = false;

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.err.println("name is invalid");
			}

			if (version > 0 && version < 100) {
				System.out.println("version is valid");
				validVersion = true;
			} else {
				System.err.println("version is invalid");
			}

			if (devo != null && !devo.isEmpty() && devo.length() > 3 && devo.length() < 30) {
				System.out.println("developed By is valid");
				validDevelopedby = true;
			} else {
				System.err.println("developed By is invalid");
			}

			if (size > 0 && size < 100) {
				System.out.println("size is valid");
				validSize = true;
			} else {
				System.err.println("size is invalid");
			}

			LocalDate today = LocalDate.now();
			LocalDate startDate = LocalDate.of(2022, 2, 21);

			if (date != null && date.isBefore(today) && date.isAfter(startDate)) {
				System.out.println("valid Date");
				validCreatedBy = true;
			} else {
				System.err.println("invalid Date");
			}

			if (validName && validVersion && validDevelopedby && validSize && validCreatedBy) {
				System.out.println("valid and Save");
				return true;
			} else {
				System.err.println("not valid");
			}
			return false;
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}