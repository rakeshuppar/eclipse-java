package com.xworkz.application.dtoRunner;

import java.time.LocalDate;

import com.xworkz.application.constants.weapon.Type;
import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.WeaponRepoImp;
import com.xworkz.application.repository.WeaponRepository;
import com.xworkz.application.service.WeaponService;
import com.xworkz.application.service.WeaponServiceImp;

public class WeaponDTORunner {

	public static void main(String[] args) {

		WeaponDTO weapon = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);
		WeaponRepository repo = new WeaponRepoImp();

		WeaponService service = new WeaponServiceImp(repo);

		WeaponDTO weapon1 = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		WeaponDTO weapon2 = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		WeaponDTO weapon3 = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		WeaponDTO weapon4 = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		WeaponDTO weapon5 = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		try {
			boolean saved = service.validAndSave(weapon);
			System.out.println("Service is:" + saved);

			System.out.println("=======================================================================");

			boolean saved1 = service.validAndSave(weapon1);
			System.out.println("Service is:" + saved1);

			System.out.println("=======================================================================");

			boolean saved2 = service.validAndSave(weapon2);
			System.out.println("Service is:" + saved2);

			System.out.println("=======================================================================");

			boolean saved3 = service.validAndSave(weapon3);
			System.out.println("Service is:" + saved3);

			System.out.println("=======================================================================");

			boolean saved4 = service.validAndSave(weapon4);
			System.out.println("Service is:" + saved);

			System.out.println("=======================================================================");

			boolean saved5 = service.validAndSave(weapon5);
			System.out.println("Service is:" + saved5);

			System.out.println("=======================================================================");

		} catch (InvalidFestivalException e) {
			System.out.println(e.getMessage());
		}

	}

}
