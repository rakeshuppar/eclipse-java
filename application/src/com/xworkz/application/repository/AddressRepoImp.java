package com.xworkz.application.repository;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class AddressRepoImp implements AddressRepository {

	private AddressDTO[] address = new AddressDTO[4];
	private int addressindex = 0;

	@Override
	public boolean save(AddressDTO repo) {
		System.out.println("running save in AddressRepoImplememet" + repo);

		if (this.addressindex < this.address.length) {
			this.address[addressindex] = repo;
			System.out.println("repo is saved at index:" + this.addressindex + " " + repo);
			this.addressindex++;
			return true;
		} else {
			System.err.println("memory is full,cannot add more files,maximum allow");
			throw new FestivalMemoryFullException(
					"Memory Full Exception is Handled by FestivalMemoryFullException, Will terminate");
		}

	}

	@Override
	public boolean isExists(AddressDTO dto) {

		if (this.addressindex == 0) {
			System.out.println("first element will not check");
			return false;
		} else {
			System.err.println("second element will onwards check");
			for (int index = 0; index < this.addressindex; index++) {
				AddressDTO temp = this.address[index];
				if (temp.equals(dto)) {
					System.out.println("address  already exists");
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public int total() {

		return this.addressindex;
	}

	@Override
	public AddressDTO findByNumber(int number) {
		for (int i = 0; i < this.addressindex; i++) {
			AddressDTO temp1 = this.address[i];
			if (temp1.getNumber() == number) {
				System.out.println("Number is present:" + number);
				return temp1;
			}
		}

		return null;
	}

	@Override
	public AddressDTO findByStreet(String street) {
		for (int i = 0; i < this.addressindex; i++) {
			AddressDTO temp2 = this.address[i];
			if (temp2.getStreet().equals(street)) {
				System.out.println("Street is present:" + street);
				return temp2;
			}
		}

		return null;
	}

	@Override
	public AddressDTO findByPinCode(int pincode) {

		for (int i = 0; i < this.addressindex; i++) {
			AddressDTO temp3 = this.address[i];
			if (temp3.getPincode() == pincode) {
				System.out.println("Pincode is present:" + pincode);
				return temp3;

			}
		}
		return null;
	}

	@Override
	public AddressDTO findByStreetAndPinCodeAndArea(int pincode, String area, String street) {
		for (int i = 0; i < this.addressindex; i++) {
			AddressDTO temp4 = this.address[i];
			if (temp4.getStreet().equals(street) && temp4.getPincode() == pincode && temp4.getArea().equals(area)) {
				System.out.println("streets is present:" + street + " " + "pincode is present :" + pincode + " "
						+ "area is present" + area);
				return temp4;
			}
		}
		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) {
		for (int i = 0; i < this.addressindex; i++) {
			AddressDTO temp5 = this.address[i];
			if (temp5.getCity().equals(city) && temp5.getState().equals(state)) {
				System.out.println("City is present:" + city + " State is present:" + state);
				return temp5;
			}
		}
		return null;
	}

	@Override
	public int findFloorByNumber(int number) {
		for (int i = 0; i < this.addressindex; i++) {
			AddressDTO temp6 = this.address[i];
			if (temp6.getNumber() == number) {
				System.out.println("Number is present:" + number);
				return address[i].getFloor();
			}
		}
		return 0;
	}

	@Override
	public String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode) {
		for (int i = 0; i < this.addressindex; i++) {
			AddressDTO temp7 = this.address[i];
			if (temp7.getNumber() == number && temp7.getFloor() == floor && temp7.getStreet().equals(street)
					&& temp7.getPincode() == pincode) {
				System.out.println("Number is present:" + number + ":Floor is present:" + floor + ":Street is present:"
						+ street + "Pincode is present:" + pincode);
				return address[i].getCity();
			}
		}
		return null;
	}

	@Override
	public int findPincodeByNumber(int number) {
		for (int i = 0; i < this.addressindex; i++) {
			AddressDTO temp8 = this.address[i];
			if (temp8.getNumber() == number) {
				System.out.println("Number is present:" + number);
				return address[i].getPincode();
			}
		}
		return 0;
	}

	@Override
	public boolean find(AddressDTO dto) {

		for (int i = 0; i < this.addressindex; i++) {
			AddressDTO temp9 = this.address[i];
			if (temp9.equals(dto)) {
				System.out.println("dto is present:" + dto);
				return true;
			}
		}
		return false;
	}

	@Override
	public AddressDTO[] findAll() {
		if (addressindex != 0) {
			return address;
		}
		return null;
	}

}
