package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constants.Headphone.*;
import com.xworkz.application.dto.HeadphoneDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.HeadphoneRepoImp;
import com.xworkz.application.repository.HeadphoneRepository;
import com.xworkz.application.util.HeadphoneUtil;

public class HeadphoneServiceImp implements HeadphoneService {

	private HeadphoneRepository repo;

	public HeadphoneServiceImp(HeadphoneRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(HeadphoneDTO head) throws InvalidFestivalException {
		System.out.println("Running valid Then Save in Haedphone Imp");

		if (head != null) {
			System.out.println("HeadPhone is not null,Valid The properties");

			Brand brand = head.getBrand();
			String model = head.getModelNum();
			double price = head.getPrice();
			boolean bass = head.isBass();
			Colour colour = head.getColour();
			TypeandWeight tw = head.getTypeandweight();
			String customer = head.getCustomerName();
			int invoice = head.getInvoiceNum();
			LocalDate date = head.getDate();
			int warranty = head.getWarrantyPeriod();

			boolean validBrand = false;
			boolean validModelNumber = false;
			boolean validPrice = false;
			boolean validBass = false;
			boolean validColour = false;
			boolean validTypeAndWeight = false;
			boolean validCustomerName = false;
			boolean validInvoice = false;
			boolean validDate = false;
			boolean validWarrentyPeriod = false;

			if (Brand.BOAT != null) {
				System.out.println("valid brand");
				validBrand = true;
			} else {
				System.err.println("invalid brand");
			}

			if (HeadphoneUtil.validString(model)) {
				System.out.println("valid model");
				validModelNumber = true;
			} else {
				System.err.println("invalid model");
			}

			if (HeadphoneUtil.validNumbers(price)) {
				System.out.println("valid Price");
				validPrice = true;
			} else {
				System.err.println("invalid price");
			}

			if (bass = true) {
				System.out.println("valid bass");
				validBass = true;
			} else {
				System.err.println("invalid bass");
			}

			if (Colour.BLACK != null) {
				System.out.println("valid colour");
				validColour = true;
			} else {
				System.err.println("invalid colour");
			}

			if (TypeandWeight.EARBUDS != null) {
				System.out.println("valid Type and Weight");
				validTypeAndWeight = true;
			} else {
				System.out.println("invalid Type and Weight");
			}

			if (HeadphoneUtil.validString(customer)) {
				System.out.println("valid Customer");
				validCustomerName = true;
			} else {
				System.err.println("invalid Customer");
			}

			if (HeadphoneUtil.validNumber(invoice)) {
				System.out.println("valid invoice");
				validInvoice = true;
			} else {
				System.err.println("invalid invoice");
			}

			if(HeadphoneUtil.validDate(date, date)) {
				System.out.println("valid date");
				validDate = true;
			} else {
				System.err.println("invalid date");
			}

			if (HeadphoneUtil.validNumber(warranty)) {
				System.out.println("valid warrenty");
				validWarrentyPeriod = true;
			} else {
				System.err.println("invalid warrenty");
			}

			if (HeadphoneUtil.validFlag(validBrand, validModelNumber, validPrice, validBass, validColour, validTypeAndWeight,
					validCustomerName, validInvoice, validDate, validWarrentyPeriod)) {

				System.out.println("All properties are valid and Then save data");
				boolean save = this.repo.save(head);
				return save;
			} else {
				System.err.println("not valid data");
				throw new InvalidFestivalException("Invalid Exception is by InvalidFestivalException, Data terminate"); 
			}
		} 
		else {
			System.err.println("dto is  null");

		}
		return false;

	}
}
