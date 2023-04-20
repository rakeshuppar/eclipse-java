package com.xworkz.application.dtoRunner;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.EducationRepository;
import com.xworkz.application.repository.EducationRepositoryImp;
import com.xworkz.application.service.EducationService;
import com.xworkz.application.service.EducationServiceImp;

public class EducationDTORunner {

	public static void main(String[] args) {

		EducationDTO dto = new EducationDTO(5, "Engineering", 80.d, "VTUBelagavi", LocalDate.of(2016, 1, 1),
				LocalDate.of(2020, 1, 1), 1, "Civil", "SHREEHARI");

		EducationRepository repo = new EducationRepositoryImp();

		EducationService service = new EducationServiceImp(repo);

		EducationDTO dto1 = new EducationDTO(5, "Engineering", 80.d, "VTUBelagavi", LocalDate.of(2016, 1, 1),
				LocalDate.of(2020, 1, 1), 1, "Civil", "RAKESH");

		EducationDTO dto2 = new EducationDTO(5, "Engineering", 80.d, "VTUBelagavi", LocalDate.of(2016, 1, 1),
				LocalDate.of(2020, 1, 1), 1, "MECHANICAL", "BASU");
		
		EducationDTO dto3 = new EducationDTO(5, "Engineering", 80.d, "VTUBelagavi", LocalDate.of(2016, 1, 1),
				LocalDate.of(2020, 1, 1), 1, "MECHANICAL", "Annesh");

		try {
			boolean saved = service.validThenSave(dto);
			System.out.println(saved);
			System.out.println("----------------------------------------------------");
			boolean saved1 = service.validThenSave(dto1);
			System.out.println(saved1);
			System.out.println("----------------------------------------------------");
			boolean saved2 = service.validThenSave(dto2);
			System.out.println(saved2);
			System.out.println("----------------------------------------------------");
            boolean saved3=service.validThenSave(dto3);
            System.out.println(saved3);
			

		} catch (InvalidFestivalException e) {
			System.out.println("InvalidFestivalExceptivalidfestival:" + e.getMessage());
		}

	}

}