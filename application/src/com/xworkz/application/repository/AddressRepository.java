package com.xworkz.application.repository;

import com.xworkz.application.dto.AddressDTO;

public interface AddressRepository {

	public boolean save(AddressDTO repo);

	public default boolean isExists(AddressDTO dto) {
		return false;

	}

	int total();

	AddressDTO findByNumber(int number);

	boolean find(AddressDTO dto);

	AddressDTO findByStreet(String street);

	AddressDTO findByPinCode(int pincode);

	AddressDTO findByStreetAndPinCodeAndArea(int pincode, String area, String street);

	AddressDTO findByCityAndState(String city, String state);

	int findFloorByNumber(int number);

	String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode);

	int findPincodeByNumber(int number);

	AddressDTO[] findAll();
}
