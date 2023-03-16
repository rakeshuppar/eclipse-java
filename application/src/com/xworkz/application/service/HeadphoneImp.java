package com.xworkz.application.service;

import static com.xworkz.application.utility.HeadphoneUtility.*;

import java.time.LocalDate;

import com.xworkz.application.constants.Headphone.*;
import com.xworkz.application.dto.HeadphoneDTO;

public class HeadphoneImp implements HeadphoneService {

	@Override
	public boolean validThenSave(HeadphoneDTO head) {
		System.out.println("running valid Then Save in Haedphone Imp");

		if (head != null) {
			System.out.println("HeadPhone is not null,Valid The propertes");

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

			if (validString(model)) {
				System.out.println("valid model");
				validModelNumber = true;
			} else {
				System.err.println("invalid model");
			}

			if (validNumbers(price)) {
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

			if (validString(customer)) {
				System.out.println("valid Customer");
				validCustomerName = true;
			} else {
				System.err.println("invalid Customer");
			}

			if (validNumber(invoice)) {
				System.out.println("valid invoice");
				validInvoice = true;
			} else {
				System.err.println("invalid invoice");
			}

			if (validDate(date, date)) {
				System.out.println("valid date");
				validDate = true;
			} else {
				System.err.println("invalid date");
			}

			if (validNumber(warranty)) {
				System.out.println("valid warrenty");
				validWarrentyPeriod = true;
			} else {
				System.err.println("invalid warrenty");
			}

			if (validFlag(validBrand, validModelNumber, validPrice, validBass, validColour, validTypeAndWeight,
					validCustomerName, validInvoice, validDate, validWarrentyPeriod)) {
				System.out.println("All properties are valid and Then save");
				return true;
			} else {
				System.err.println("not valid");
			}
			return false;

		}
		return false;

	}
}
