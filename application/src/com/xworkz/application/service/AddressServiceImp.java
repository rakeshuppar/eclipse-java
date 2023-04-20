package com.xworkz.application.service;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.AddressRepository;
import static com.xworkz.application.util.AddressUtil.*;

public class AddressServiceImp implements AddressService {

	private AddressRepository repo;

	public AddressServiceImp(AddressRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validthensave(AddressDTO dto) throws InvalidFestivalException {
		System.out.println("running valid ThenSave in AddressDTO");

		if (dto != null) {
			System.out.println("dto is not null");

			String street = dto.getStreet();
			String area = dto.getArea();
			int pin = dto.getPincode();
			int floor = dto.getFloor();
			int number = dto.getNumber();
			String city = dto.getCity();
			String state = dto.getState();

			boolean validStreet = false;
			boolean validArea = false;
			boolean validPinCode = false;
			boolean validFloor = false;
			boolean validNumber = false;
			boolean validCity = false;
			boolean validState = false;

			if (validString(street)) {
				System.out.println("valid street");
				validStreet = true;
			} else {
				System.err.println("invalid street");
			}

			if (validString(area)) {
				System.out.println("valid area");
				validArea = true;
			} else {
				System.err.println("invalid area");
			}

			if (validint(pin)) {
				System.out.println("valid pin");
				validPinCode = true;
			} else {
				System.err.println("invalid pin");
			}

			if (validint(floor)) {
				System.out.println("valid floor");
				validFloor = true;
			} else {
				System.err.println("invalid floor");
			}

			if (validint(number)) {
				System.out.println("valid number");
				validNumber = true;
			} else {
				System.err.println("invalid number");
			}

			if (validString(city)) {
				System.out.println("valid city");
				validCity = true;
			} else {
				System.err.println("invalid city");
			}

			if (validString(state)) {
				System.out.println("valid state");
				validState = true;
			} else {
				System.err.println("invalid state");
			}

			if (validFlag(validStreet, validArea, validPinCode, validFloor, validNumber, validCity, validState)) {
				System.out.println("All properties are valid and Then save data");
				boolean exists = this.repo.isExists(dto);
				if (!exists) {
					System.out.println("dto is exists");
					boolean save = this.repo.save(dto);
					return save;
				} else {
					System.err.println("not valid Data");
					throw new InvalidFestivalException(
							"Invalid Exception is by InvalidFestivalException, Data terminate");
				}

			}

			return false;
		}
		return false;
	}

	@Override
	public int total() {

		return this.repo.total();
	}

	@Override
	public boolean find(AddressDTO dto) throws InvalidFestivalException {
		if (validthensave(dto)) {
			throw new InvalidFestivalException("Handle the exception");
		}
		return false;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		if (validString(street)) {
			return this.repo.findByStreet(street);
		}
		return null;
	}

	@Override
	public AddressDTO findByPinCode(int pincode) {
		if (validint(pincode)) {
			return this.repo.findByPinCode(pincode);
		}
		return null;
	}

	@Override
	public AddressDTO findByStreetAndPinCodeAndArea(int pincode, String area, String street) {
		if (validint(pincode) && validString(area) && validString(street)) {
			return this.repo.findByStreetAndPinCodeAndArea(pincode, area, street);
		}
		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		if (validString(city) && validString(state)) {
			return this.repo.findByCityAndState(city, state);
		}
		return null;
	}

	@Override
	public int findFloorByNumber(int number) {
		if (validint(number)) {
			return this.repo.findFloorByNumber(number);
		}
		return 0;
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode) {
		if (validint(number) && validint(floor) && validString(street) && validint(pincode)) {
			return this.repo.findCityByNumberAndFloorAndStreetAndPincode(number, floor, street, pincode);
		}
		return null;
	}

	@Override
	public int findPincodeByNumber(int number) {
		if (validint(number)) {
			return this.repo.findPincodeByNumber(number);
		}
		return 0;
	}

	@Override
	public AddressDTO findByNumber(int number) {
		if (validint(number)) {
			return this.repo.findByNumber(number);
		}
		return null;
	}

	@Override
	public boolean isExists(AddressDTO dto) throws InvalidFestivalException {
		if (validthensave(dto)) {
			return this.repo.isExists(dto);
		}
		return false;
	}

	@Override
	public AddressDTO[] findAll() {
		AddressDTO[] owndto = this.repo.findAll();
		for (int j = 0; j < owndto.length; j++) {
			if (owndto[j] != null) {
				System.out.println("repo:" + j + " " + owndto[j]);
			}
		}

		return owndto;
	}
}