package com.xworkz.application.dtoRunner;

import java.time.LocalDate;

import com.xworkz.application.constants.weapon.Type;
import com.xworkz.application.dto.WeaponDTO;
import com.xworkz.application.repository.WeaponRepoImp;
import com.xworkz.application.repository.WeaponRepository;
import com.xworkz.application.service.WeaponService;
import com.xworkz.application.service.WeaponServiceImp;

public class WeaponDTORunner {

	public static void main(String[] args) {

		WeaponDTO weapon = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		System.out.println(weapon.toString());
		System.out.println("Weapon is equal to Weapon:" + weapon.equals(weapon));
		System.out.println("Hashcode:" + weapon.hashCode() + " Original Hashcode:" + System.identityHashCode(weapon));

		WeaponRepository repo = new WeaponRepoImp();

		WeaponService service = new WeaponServiceImp(repo);
		boolean saved = service.validAndSave(weapon);
		System.out.println("Service is:" + saved);

		System.out.println("=======================================================================");

		
		WeaponDTO weapon1 = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		System.out.println(weapon1.toString());
		System.out.println("Weapon is equal to Weapon:" + weapon1.equals(weapon1));
		System.out.println("Hashcode:" + weapon.hashCode() + " Original Hashcode:" + System.identityHashCode(weapon));

		WeaponRepository repo1 = new WeaponRepoImp();

		WeaponService service1 = new WeaponServiceImp(repo1);
		boolean saved1 = service.validAndSave(weapon1);
		System.out.println("Service is:" + saved1);

		System.out.println("=======================================================================");

		
		WeaponDTO weapon2 = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		System.out.println(weapon2.toString());
		System.out.println("Weapon is equal to Weapon:" + weapon2.equals(weapon2));
		System.out.println("Hashcode:" + weapon2.hashCode() + " Original Hashcode:" + System.identityHashCode(weapon2));

		WeaponRepository repo2 = new WeaponRepoImp();

		WeaponService service2 = new WeaponServiceImp(repo2);
		boolean saved2 = service.validAndSave(weapon2);
		System.out.println("Service is:" + saved2);

		System.out.println("=======================================================================");

		WeaponDTO weapon3 = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		System.out.println(weapon3.toString());
		System.out.println("Weapon is equal to Weapon:" + weapon3.equals(weapon3));
		System.out.println("Hashcode:" + weapon3.hashCode() + " Original Hashcode:" + System.identityHashCode(weapon3));

		WeaponRepository repo3 = new WeaponRepoImp();

		WeaponService service3 = new WeaponServiceImp(repo3);
		boolean saved3 = service.validAndSave(weapon3);
		System.out.println("Service is:" + saved3);

		System.out.println("=======================================================================");

		
		WeaponDTO weapon4 = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		System.out.println(weapon4.toString());
		System.out.println("Weapon is equal to Weapon:" + weapon4.equals(weapon4));
		System.out.println("Hashcode:" + weapon.hashCode() + " Original Hashcode:" + System.identityHashCode(weapon4));

		WeaponRepository repo4 = new WeaponRepoImp();

		WeaponService service4 = new WeaponServiceImp(repo4);
		boolean saved4 = service.validAndSave(weapon4);
		System.out.println("Service is:" + saved);

		System.out.println("=======================================================================");

		
		WeaponDTO weapon5 = new WeaponDTO(251, "Air Gun", Type.HANDGUN, 10500, "Wood & Alloys of tin ,bismuth",
				"Bartholomaus Girandoni", "IHPlimited", LocalDate.of(2005, 2, 5), "Rakesh", "Hunting", 700);

		System.out.println(weapon5.toString());
		System.out.println("Weapon is equal to Weapon:" + weapon5.equals(weapon5));
		System.out.println("Hashcode:" + weapon5.hashCode() + " Original Hashcode:" + System.identityHashCode(weapon5));

		WeaponRepository repo5 = new WeaponRepoImp();

		WeaponService service6 = new WeaponServiceImp(repo5);
		boolean saved5 = service.validAndSave(weapon5);
		System.out.println("Service is:" + saved5);

		System.out.println("=======================================================================");

		
	}

}
