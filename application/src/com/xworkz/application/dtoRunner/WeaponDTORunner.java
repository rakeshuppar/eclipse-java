package com.xworkz.application.dtoRunner;

import java.time.LocalDate;

import com.xworkz.application.constants.weapon.Type;
import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.service.WeaponImp;
import com.xworkz.application.service.WeaponService;

public class WeaponDTORunner {

	public static void main(String[] args) {

		WeaponDTO weapon = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		System.out.println(weapon.toString());
		System.out.println("Weapon is equal to Weapon:" + weapon.equals(weapon));
		System.out.println("Hashcode:" + weapon.hashCode() + " Original Hashcode:" + System.identityHashCode(weapon));

		WeaponService service = new WeaponImp();
		boolean saved = service.validAndSave(weapon);
		System.out.println("Service is:" + saved);

	}

}
