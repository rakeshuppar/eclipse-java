package com.xworkz.application.dtoRunner;

import java.time.LocalDate;

import com.xworkz.application.constants.Headphone.Brand;
import com.xworkz.application.constants.Headphone.Colour;
import com.xworkz.application.constants.Headphone.TypeandWeight;
import com.xworkz.application.dto.HeadphoneDTO;
import com.xworkz.application.service.HeadphoneImp;
import com.xworkz.application.service.HeadphoneService;

public class HeadphoneDTORunner {

	public static void main(String[] args) {

		HeadphoneDTO head = new HeadphoneDTO(Brand.MI, "ZBW4476IN", 800, true, Colour.BLACK, TypeandWeight.EARBUDS,
				"Rakesh", 555, LocalDate.of(2020, 6, 6), 12);
		System.out.println(head);
		System.out.println("Headphone is equals to Headphone:"+head.equals(head));
        System.out.println("Hashcode:"+head.hashCode() + " Original HashCode:"+System.identityHashCode(head));
		
		HeadphoneService service=new HeadphoneImp();
		boolean saved=service.validThenSave(head);
		System.out.println("service is:"+saved);

	}

}
