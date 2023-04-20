package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.ApplicationDTO1;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.Application1Repository;
import com.xworkz.application.constants.application1.LangaugeUsed;
import com.xworkz.application.constants.application1.OsTypeSupported;
import com.xworkz.application.constants.application1.Type;

public class ApplicationServiceImp1 implements ApplicationService1 {

	private Application1Repository repo;

	public ApplicationServiceImp1(Application1Repository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(ApplicationDTO1 dto) throws InvalidFestivalException {

		if (dto != null) {
			System.out.println("dto is not null will,valid the properties");

			String name = dto.getName();
			double ver = dto.getVersion();
			LocalDate date = dto.getCreateDate();
			int si = dto.getSize();
			Type type = dto.getType();
			String develop = dto.getDevelopedBy();
			double pri = dto.getPrice();
			LocalDate date1 = dto.getFirstVersionReleaseDate();
			LocalDate date2 = dto.getCurrentVersionReleaseDate();
			LocalDate date3 = dto.getNextVersionReleaseDate();
			int days = dto.getTrailDays();
			LangaugeUsed used = dto.getLanguageUsed();
			double minp = dto.getMinProcessorSpeed();
			double minr = dto.getMinRamSpeedRequired();
			boolean inter = dto.isInternetNeeded();
			int age = dto.getAgeLimit();
			double down = dto.getNumDownloads();
			float rate = dto.getRatings();
			OsTypeSupported os = dto.getOsTypeSupported();

			boolean validName = false;
			boolean validVersion = false;
			boolean validCreateDate = false;
			boolean validSize = false;
			boolean validDevelopedBy = false;
			boolean validType = false;
			boolean validPrice = false;
			boolean validFirstVersionReleaseDate = false;
			boolean validCurrentVersionReleaseDate = false;
			boolean validNextVersionReleaseDate = false;
			boolean validTrailDays = false;
			boolean validLanguageUsed = false;
			boolean validMinProcessorSpeed = false;
			boolean validMinramSpeedRequired = false;
			boolean validInternetNeeded = false;
			boolean validAgeLimit = false;
			boolean validNumDownloads = false;
			boolean validRatings = false;
			boolean validOsTypeSupported = false;

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("name is valid");
				validName = true;

			} else {
				System.err.println("name is invalid");
			}

			if (ver > 0 && ver < 100) {
				System.out.println("version is valid");
				validVersion = true;
			} else {
				System.err.println("version is invalid");
			}

			LocalDate today = LocalDate.now();
			LocalDate past = LocalDate.of(2002, 6, 6);

			if (date != null && date.isBefore(today) && date.isAfter(past)) {
				System.out.println("Created Date is Valid");
				validCreateDate = true;
			} else {
				System.err.println("Created Date is Invalid");
			}

			if (si > 0 && si < 100) {
				System.out.println("size is valid");
				validSize = true;
			} else {
				System.err.println("size is invalid");
			}

			if (type != null) {
				System.out.println("Type is valid");
				validType = true;

			} else {
				System.err.println("Type is invalid");
			}

			if (develop != null && !develop.isEmpty() && develop.length() > 3 && develop.length() < 30) {
				System.out.println("Developed By is valid");
				validDevelopedBy = true;

			} else {
				System.err.println("Developed By is invalid");
			}

			if (pri > 0 && pri < 100) {
				System.out.println("Price is valid");
				validPrice = true;
			} else {
				System.err.println("Price is invalid");
			}

			LocalDate today1 = LocalDate.now();
			LocalDate past1 = LocalDate.of(2005, 5, 6);

			if (date1 != null && date1.isBefore(today1) && date1.isAfter(past1)) {
				System.out.println("First Version Release Date is valid ");
				validFirstVersionReleaseDate = true;
			} else {
				System.err.println("First Version Release Date is invalid ");
			}

			LocalDate today2 = LocalDate.now();
			LocalDate startDate2 = LocalDate.of(2016, 2, 21);

			if (date2 != null && date2.isBefore(today2) && date2.isAfter(startDate2)) {
				System.out.println("Current Version Release Date is valid");
				validCurrentVersionReleaseDate = true;
			} else {
				System.err.println("Current Version Release Date is invalid ");
			}
			LocalDate today3 = LocalDate.now();
			LocalDate startDate3 = LocalDate.of(2025, 2, 21);

			if (date3 != null && date3.isBefore(startDate3) && date3.isAfter(today3)) {
				System.out.println("Next Version Release Date is valid ");
				validNextVersionReleaseDate = true;
			} else {
				System.err.println("Next Version Release Date is invalid ");
			}

			if (days > 0 && days < 100) {
				System.out.println("Trial days is valid");
				validTrailDays = true;
			} else {
				System.err.println("Trial days  is invalid");
			}

			if (used != null) {
				System.out.println("Langauge Used is valid");
				validLanguageUsed = true;

			} else {
				System.err.println("Langauge Used is invalid");
			}

			if (minp > 0 && minp < 100) {
				System.out.println("Minimum Processor Speed is valid");
				validMinProcessorSpeed = true;
			} else {
				System.err.println("Minimum Processor Speed is invalid");
			}

			if (minr > 0 && minr < 100) {
				System.out.println("Minimum Ram Speed Required is valid");
				validMinramSpeedRequired = true;
			} else {
				System.err.println("Minimum Ram Speed Required is invalid");
			}

			if (inter = true) {
				System.out.println("InternetNeeded is valid");
				validInternetNeeded = true;

			} else {
				System.err.println("InternetNeeded is invalid");
			}

			if (age > 0 && age < 100) {
				System.out.println("Age is valid");
				validAgeLimit = true;
			} else {
				System.err.println("Age is invalid");
			}

			if (down > 0 && down < 100) {
				System.out.println("Number of Download is valid");
				validNumDownloads = true;
			} else {
				System.err.println("Number of Download is invalid");
			}

			if (rate > 0 && rate < 100) {
				System.out.println("Ratings is valid");
				validRatings = true;
			} else {
				System.err.println("Ratings is invalid");
			}

			if (os != null) {
				System.out.println("Operating System Supported is valid");
				validOsTypeSupported = true;

			} else {
				System.err.println("Os Type Supported  is invalid");
			}

			if (validName && validVersion && validCreateDate && validSize && validDevelopedBy && validType && validPrice
					&& validFirstVersionReleaseDate && validCurrentVersionReleaseDate && validNextVersionReleaseDate
					&& validTrailDays && validLanguageUsed && validMinProcessorSpeed && validMinramSpeedRequired
					&& validInternetNeeded && validAgeLimit && validNumDownloads && validRatings
					&& validOsTypeSupported) {
				boolean save = this.repo.save(dto);
				return save;
			} else {
				System.err.println("not valid data");
				throw new InvalidFestivalException("Invalid Exception is by InvalidFestivalException, Data terminate");
			}
		}
		return false;
	}
}
