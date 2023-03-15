package com.xworkz.application.dtoRunner;

import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.service.ApplicationImp;
import com.xworkz.application.service.ApplicationService;

import java.time.LocalDate;

public class ApplicationDTORunner {

	public static void main(String[] args) {

		ApplicationDTO application = new ApplicationDTO();
		application.setName("Whatsapp");
		application.setSize(20);
		application.setVersion(1.22);
		application.setDevelopedBy("Rekhesh");
		application.setCreatedDate(LocalDate.of(2022, 6, 01));
		System.out.println(application.toString());
		System.out.println("Application is equal to Application:" + application.equals((application)));
		System.out.println(
				"hashcode:" + application.hashCode() + "  originalhashcode:" + System.identityHashCode(application));

		ApplicationService service = new ApplicationImp();
		boolean saved = service.validThenSave(application);
		System.out.println("service is:" + saved);

	}
}
