package com.xworkz.application.dtoRunner;

import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.ApplicationRepoImp;
import com.xworkz.application.repository.ApplicationRepository;
import com.xworkz.application.service.ApplicationService;
import com.xworkz.application.service.ApplicationServiceImp;
import java.time.LocalDate;

public class ApplicationDTORunner {

	public static void main(String[] args) throws InvalidFestivalException {

		ApplicationDTO apps = new ApplicationDTO("Whatsapp", 20, "Rekhesh", 20, LocalDate.of(2022, 6, 20));
		System.out.println(apps);

		ApplicationRepository repo = new ApplicationRepoImp();

		ApplicationService service = new ApplicationServiceImp(repo);
		boolean saved = service.validThenSave(apps);
		System.out.println("service is:" + saved);

		ApplicationDTO apps1 = new ApplicationDTO("Instagram", 13, "brahma", 99, LocalDate.of(2021, 5, 22));

		ApplicationDTO apps2 = new ApplicationDTO("Instagram", 21, "brahma", 70, LocalDate.of(2021, 7, 22));

		ApplicationDTO apps3 = new ApplicationDTO("Instagram", 21, "brahma", 88, LocalDate.of(2021, 11, 22));

		ApplicationDTO apps4 = new ApplicationDTO("Instagram", 21, "brahma", 60, LocalDate.of(2022, 1, 22));

		ApplicationDTO apps5 = new ApplicationDTO("Instagram", 21, "brahma", 98, LocalDate.of(2022, 2, 10));

		System.out.println("============================================================");

		try {
			boolean saved1 = service.validThenSave(apps1);
			System.out.println("service is:" + saved1);
			System.out.println("============================================================");
			boolean saved2 = service.validThenSave(apps2);
			System.out.println("service is:" + saved2);
			System.out.println("============================================================");
			boolean saved3 = service.validThenSave(apps3);
			System.out.println("service is:" + saved3);
			System.out.println("============================================================");
			boolean saved4 = service.validThenSave(apps4);
			System.out.println("service is:" + saved4);
			System.out.println("============================================================");
			boolean saved5 = service.validThenSave(apps5);
			System.out.println("service is:" + saved5);
			System.out.println("============================================================");

		} catch (InvalidFestivalException e) {
			System.out.println("InvalidFestivalExceptivalidfestival");
		}
	}
}
