package com.xworkz.application.dtoRunner;

import java.time.LocalDate;

import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.implement.ApplicationImp;
import com.xworkz.application.service.ApplicationService;

public class ApplicationDTORunner {

	public static void main(String[] args) {

		ApplicationDTO application = new ApplicationDTO();
		application.setName("Whatsapp");
		application.setSize(20);
		application.setVersion(1.22);
		application.setDevelopedBy("Rekhesh");
		application.setCreatedDate(LocalDate.of(2022, 6, 01));
		System.out.println(application.toString());
		System.out.println(application.equals((application)));
		System.out.println(application);
		System.out.println(
				"hashcode:" + application.hashCode() + "  originalhashcode:" + System.identityHashCode(application));

		ApplicationService service = new ApplicationImp();
		boolean saved = service.validThenSave(application);
		System.out.println("service:" + saved);

	}
}
