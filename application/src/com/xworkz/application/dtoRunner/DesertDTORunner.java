package com.xworkz.application.dtoRunner;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.DesertRepository;
import com.xworkz.application.repository.DesertRepositoryImp;
import com.xworkz.application.service.DesertService;
import com.xworkz.application.service.DesertServiceImp;

public class DesertDTORunner {

	public static void main(String[] args) {

		DesertDTO dto = new DesertDTO(1, "Gobi", "china", 12950, 25d, 55d);
		DesertRepository repo = new DesertRepositoryImp();

		DesertService service = new DesertServiceImp(repo);

		DesertDTO dto1 = new DesertDTO(2, "Thar", "India", 23825, 26d, 56d);

		DesertDTO dto2 = new DesertDTO(3, "Antarctic", "Antarcticcountry", 14200, 27d, 57d);

		DesertDTO dto3 = new DesertDTO(4, "Sahara", "Africa", 92000, 30, 58);

		DesertDTO dto4 = new DesertDTO(5, "ArabianDesert", "WesternAsia", 23300, 20, 48);

		DesertDTO dto5 = new DesertDTO(6, "Kalhari", "SouthAfrica", 900000, 35, 45);

		DesertDTO dto6 = new DesertDTO(7, "Patagonian", "Argentine", 673000, 13, 34);

		DesertDTO dto7 = new DesertDTO(8, "Syrian", "Syria", 500000, 29, 35);

		DesertDTO dto8 = new DesertDTO(9, "Great Basin", "NorthAmerica", 492098, 35, 45);

		DesertDTO dto9 = new DesertDTO(10, "Karkum", "Turkmenistan", 350000, 33, 46);

		DesertDTO dto10 = new DesertDTO(11, "Great Victoria", "Australia", 348750, 21, 40);

		DesertDTO dto11 = new DesertDTO(12, "Sonoran Desert", "Mexico", 23300, 28, 46);

		DesertDTO dto12 = new DesertDTO(13, "Ogden", "EasternAfrica", 256000, 32, 52);

		DesertDTO dto13 = new DesertDTO(14, "Puntland", "Somalia", 200200, 25, 38);

		DesertDTO dto14 = new DesertDTO(15, "Guban", "Somalia", 175000, 32, 52);

		try {

			boolean saved = service.validThensave(dto);
			System.out.println("service is:" + saved);
			System.out.println("===================================");
			boolean saved1 = service.validThensave(dto1);
			System.out.println("service is:" + saved1);
			System.out.println("====================================");
			boolean saved2 = service.validThensave(dto2);
			System.out.println("service is :" + saved2);
			System.out.println("====================================");
			boolean saved3 = service.validThensave(dto3);
			System.out.println("service is:" + saved3);
			System.out.println("===================================");
			boolean saved4 = service.validThensave(dto4);
			System.out.println("service is:" + saved4);
			System.out.println("===================================");
			boolean saved5 = service.validThensave(dto5);
			System.out.println("service is:" + saved5);
			System.out.println("===================================");
			boolean saved6 = service.validThensave(dto6);
			System.out.println("service is:" + saved6);
			System.out.println("===================================");
			boolean saved7 = service.validThensave(dto7);
			System.out.println("service is:" + saved7);
			System.out.println("===================================");
			boolean saved8 = service.validThensave(dto8);
			System.out.println("service is:" + saved8);
			System.out.println("===================================");
			boolean saved9 = service.validThensave(dto9);
			System.out.println("service is:" + saved9);
			System.out.println("===================================");
			boolean saved10 = service.validThensave(dto10);
			System.out.println("service is:" + saved10);
			System.out.println("===================================");
			boolean saved11 = service.validThensave(dto11);
			System.out.println("service is:" + saved11);
			System.out.println("===================================");
			boolean saved12 = service.validThensave(dto12);
			System.out.println("service is:" + saved12);
			System.out.println("===================================");
			boolean saved13 = service.validThensave(dto13);
			System.out.println("service is:" + saved13);
			System.out.println("===================================");
			boolean saved14 = service.validThensave(dto14);
			System.out.println("service is:" + saved14);
			System.out.println("=============================method");
			DesertDTO des = service.find(dto);
			System.out.println("dto is find:" + des);

		} catch (InvalidFestivalException e) {
			System.out.println("Invalid exception is handled by catch block");
		}

		System.out.println("=======================================");

		System.out.println(service.total());

		double name = service.findAreaByName("THAR");
		System.out.println("area:" + name);

		DesertDTO des1 = service.findByName("THAR");
		System.out.println("dto is find:" + des1);

		DesertDTO des2 = service.findByNameAndCountryAndArea("THAR", "china", 23825);
		System.out.println("dto is find:" + des2);

		int total = service.total();
		System.out.println("total:" + total);

		System.out.println("-------------------------------------");

	}

}
