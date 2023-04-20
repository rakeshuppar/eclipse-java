package com.xworkz.application.service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.DesertRepository;
import static com.xworkz.application.util.DesertUtil.*;

public class DesertServiceImp implements DesertService {

	private DesertRepository repo;

	public DesertServiceImp(DesertRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThensave(DesertDTO dto) throws InvalidFestivalException {
		System.out.println("running valid ThenSave in DesertDTO");

		if (dto != null) {
			System.out.println("dto is not null");

			int id = dto.getId();
			String name = dto.getName();
			String country = dto.getCountry();
			double area = dto.getArea();
			double minTemp = dto.getMinTemp();
			double maxTemp = dto.getMaxTemp();

			boolean validId = false;
			boolean validName = false;
			boolean validCountry = false;
			boolean validArea = false;
			boolean validMinTemp = false;
			boolean validMaxTemp = false;

			if (validInt(id)) {
				System.out.println("valid id");
				validId = true;
			} else {
				System.err.println("invalid id");
			}

			if (validString(name)) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.err.println("invalid name");
			}

			if (validString(country)) {
				System.out.println("valid country");
				validCountry = true;
			} else {
				System.err.println("invalid country");
			}

			if (validdouble(area)) {
				System.out.println("valid area");
				validArea = true;
			} else {
				System.err.println("invalid area");
			}

			if (validdouble(minTemp)) {
				System.out.println("valid mintemp");
				validMinTemp = true;
			} else {
				System.err.println("invalid minTemp");
			}

			if (validdouble(maxTemp)) {
				System.out.println("valid maxtemp");
				validMaxTemp = true;
			} else {
				System.err.println("invalid maxtemp");
			}

			if (validFlag(validId, validName, validCountry, validArea, validMinTemp, validMaxTemp)) {
				System.out.println("All properties are valid and Then save data");
				boolean exist = this.repo.isExist(dto);
				if (!exist) {
					boolean save = this.repo.save(dto);
					return save;
				} else {
					System.err.println("not valid data");
					throw new InvalidFestivalException(
							"Invalid Exception is by InvalidFestivalException, Data terminate");
				}

			}
			return false;

		}
		return false;
	}

	@Override
	public DesertDTO find(DesertDTO dto) throws InvalidFestivalException {
		if (validThensave(dto)) {
			return this.repo.find(dto);
		}
		return null;
	}

	@Override
	public DesertDTO findByName(String name) {
		if (validString(name)) {
			return this.repo.findByName(name);
		}
		return null;
	}

	@Override
	public double findAreaByName(String name) {
		if (validString(name)) {
			return this.repo.findAreaByName(name);
		}
		return 0;
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, double area) {
		if (validString(name) && validString(country) && validdouble(area)) {
			return this.repo.findByNameAndCountryAndArea(name, country, area);
		}
		return null;

	}

	@Override
	public int total() {
		return this.repo.total();
	}

	@Override
	public boolean isExist(DesertDTO dto) throws InvalidFestivalException {
		if (this.validThensave(dto)) {
			return this.repo.isExist(dto);

		}
		return false;
	}

}