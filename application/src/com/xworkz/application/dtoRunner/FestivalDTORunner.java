package com.xworkz.application.dtoRunner;

import java.time.LocalDate;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.FestivalRepoImp;
import com.xworkz.application.repository.FestivalRepository;
import com.xworkz.application.service.FestivalService;
import com.xworkz.application.service.FestivalServiceImp;

public class FestivalDTORunner {

	public static void main(String[] args) {

		try {
			FestivalDTO dto = new FestivalDTO(1, "Ugadi", LocalDate.of(2023, 1, 3), LocalDate.of(2023, 1, 4), "Holige",
					"Durga");

			FestivalRepository repo = new FestivalRepoImp();

			FestivalService service = new FestivalServiceImp(repo);
			boolean saved = service.validThenSave(dto);

			System.out.println("Service is:" + saved);

			System.out.println("________________________________________");

			FestivalDTO dto1 = new FestivalDTO(1, "Ugadi", LocalDate.of(2023, 2, 3), LocalDate.of(2023, 2, 4), "Holige",
					"Durga");

			FestivalService service1 = new FestivalServiceImp(repo);
			boolean saved1 = service1.validThenSave(dto1);
			System.out.println("Service is:" + saved1);

			System.out.println("==============================================");

			FestivalDTO dto2 = new FestivalDTO(1, "Ugadi", LocalDate.of(2023, 3, 3), LocalDate.of(2023, 3, 4), "Holige",
					"Durga");

			FestivalService service2 = new FestivalServiceImp(repo);
			boolean saved2 = service2.validThenSave(dto2);

			System.out.println("Service is:" + saved2);

			System.out.println("================================================");

			FestivalDTO dto3 = new FestivalDTO(3, "Ugadi", LocalDate.of(2023, 3, 7), LocalDate.of(2023, 3, 8), "Holige",
					"Durga");

			FestivalService service3 = new FestivalServiceImp(repo);
			boolean saved3 = service3.validThenSave(dto3);

			System.out.println("Service is:" + saved3);

			System.out.println("================================================");

			FestivalDTO dto4 = new FestivalDTO(4, "ugadi", LocalDate.of(2023, 3, 15), LocalDate.of(2023, 3, 18),
					"Holige", "Durga");

			FestivalService service4 = new FestivalServiceImp(repo);
			boolean saved4 = service4.validThenSave(dto4);

			System.out.println("Service is:" + saved4);

			System.out.println("================================================");

			FestivalDTO dto5 = new FestivalDTO(5, "Ugadi", LocalDate.of(2023, 3, 22), LocalDate.of(2023, 3, 24),
					"Holige", "Durga");

			FestivalService service5 = new FestivalServiceImp(repo);
			boolean saved5 = service5.validThenSave(dto5);

			System.out.println("Service is:" + saved5);

		} catch (InvalidFestivalException exe) {
			System.out.println(exe.getMessage());

		}
	}
}
