package com.xworkz.application.service;

import com.xworkz.application.*;
import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.exception.InvalidFestivalException;

public interface AddressService {

	public boolean validthensave(AddressDTO dto) throws InvalidFestivalException;

	public default boolean isExists(AddressDTO dto) throws InvalidFestivalException {
		return false;
	}

	int total();

	AddressDTO findByNumber(int number);

	boolean find(AddressDTO dto) throws InvalidFestivalException;

	AddressDTO findByStreet(String street);

	AddressDTO findByPinCode(int pincode);

	AddressDTO findByStreetAndPinCodeAndArea(int pincode, String area, String street);

	AddressDTO findByCityAndState(String city, String state);

	int findFloorByNumber(int number);

	String findCityByNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode);

	int findPincodeByNumber(int number);

	AddressDTO[] findAll();
}
