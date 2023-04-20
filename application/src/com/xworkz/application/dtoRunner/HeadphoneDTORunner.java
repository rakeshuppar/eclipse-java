package com.xworkz.application.dtoRunner;

import java.time.LocalDate;

import com.xworkz.application.constants.Headphone.Brand;
import com.xworkz.application.constants.Headphone.Colour;
import com.xworkz.application.constants.Headphone.TypeandWeight;
import com.xworkz.application.dto.HeadphoneDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.HeadphoneRepoImp;
import com.xworkz.application.repository.HeadphoneRepository;
import com.xworkz.application.service.HeadphoneService;
import com.xworkz.application.service.HeadphoneServiceImp;

public class HeadphoneDTORunner {

	public static void main(String[] args) {

		HeadphoneDTO head = new HeadphoneDTO(Brand.MI, "ZBW4476IN", 800, true, Colour.BLACK, TypeandWeight.EARBUDS,
				"Rakesh", 555, LocalDate.of(2020, 6, 6), 12);
		System.out.println(head);
		System.out.println("Headphone is equals to Headphone:" + head.equals(head));
		System.out.println("Hashcode:" + head.hashCode() + " Original HashCode:" + System.identityHashCode(head));

		HeadphoneRepository repo = new HeadphoneRepoImp();

		HeadphoneService service = new HeadphoneServiceImp(repo);
		
		HeadphoneDTO head1 = new HeadphoneDTO(Brand.SAMSUNG, "ZBW4476IN", 900, true, Colour.YELLOW,
				TypeandWeight.ON_EAR, "Kavan", 555, LocalDate.of(2020, 6, 6), 12);
		
		HeadphoneDTO head2 = new HeadphoneDTO(Brand.BOAT, "ZBW4476IN", 700, true, Colour.WHITE, TypeandWeight.IN_EAR,
				"shreehari", 555, LocalDate.of(2020, 6, 6), 12);
	
	
		HeadphoneDTO head3 = new HeadphoneDTO(Brand.MI, "ZBW4476IN", 400, false, Colour.GREY, TypeandWeight.EARBUDS,
				"Sanket", 555, LocalDate.of(2020, 6, 6), 12);

		
		HeadphoneDTO head4 = new HeadphoneDTO(Brand.MI, "ZBW4476IN", 700, true, Colour.RED, TypeandWeight.ON_EAR,
				"Annesh", 555, LocalDate.of(2020, 6, 6), 12);
	
	
		HeadphoneDTO head5 = new HeadphoneDTO(Brand.SAMSUNG, "ZBW4476IN", 500, false, Colour.PINK, TypeandWeight.IN_EAR,
				"Basu", 555, LocalDate.of(2020, 6, 6), 12);
	
		
		
		try {
			boolean saved = service.validThenSave(head);
			System.out.println("service is:" + saved);

			System.out.println("=============================================================");

			boolean saved1 = service.validThenSave(head1);
			System.out.println("service is:" + saved1);

			System.out.println("=============================================================");

			boolean saved2 = service.validThenSave(head2);
			System.out.println("service is:" + saved2);

			System.out.println("=============================================================");
			boolean saved3 = service.validThenSave(head3);
			System.out.println("service is:" + saved3);

			System.out.println("=============================================================");
			
			boolean saved4 = service.validThenSave(head4);
			System.out.println("service is:" + saved4);

			System.out.println("=============================================================");
			
			boolean saved5 = service.validThenSave(head5);
			System.out.println("service is:" + saved5);

			System.out.println("=============================================================");
			



			
		} catch (InvalidFestivalException e) {
			System.out.println();
		}
	}

}
