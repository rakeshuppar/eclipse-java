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

		FestivalDTO dto = new FestivalDTO(1,
				"ugadi", LocalDate.of(2023, 1, 3), LocalDate.of(2023, 1, 4), "Holige",
				"Durga");

		FestivalRepository repo = new FestivalRepoImp();

		FestivalService service = new FestivalServiceImp(repo);

		FestivalDTO dto1 = new FestivalDTO(1, "fggjhjh", LocalDate.of(2023, 2, 3), LocalDate.of(2023, 2, 4), "Holige",
				"Durga");
		FestivalService service1 = new FestivalServiceImp(repo);

		FestivalDTO dto2 = new FestivalDTO(1, "djjd", LocalDate.of(2023, 3, 3), LocalDate.of(2023, 3, 4), "Holige",
				"Durga");
		FestivalService service2 = new FestivalServiceImp(repo);
		
		FestivalDTO dto3 = new FestivalDTO(1, "hdhdh", LocalDate.of(2023, 3, 3), LocalDate.of(2023, 3, 4), "Holige",
				"Durga");
		FestivalService service3 = new FestivalServiceImp(repo);

		try {
			boolean saved = service.validThenSave(dto);
			System.out.println(saved);
			System.out.println("==============================================");
			boolean saved1 = service1.validThenSave(dto1);
			System.out.println(saved1);
			System.out.println("==============================================");
			boolean saved2 = service2.validThenSave(dto2);
			System.out.println(saved2);
			System.out.println("===============================================");
			boolean saved3=service3.validThenSave(dto3);
			System.out.println(saved3);
			System.out.println("================================================");

		} catch (InvalidFestivalException exe) {
			System.out.println(exe.getMessage());

		}
	}
}
