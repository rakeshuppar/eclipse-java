package com.xworkz.electricity.dtoRunner;

import java.time.LocalDate;

import com.xworkz.electricity.dto.MarriageDTO;
import com.xworkz.electricity.repository.MarriageRepository;
import com.xworkz.electricity.repository.MarriageRepositoryImp;
import com.xworkz.electricity.service.MarriageService;
import com.xworkz.electricity.service.MarriageServiceImp;

public class MarriageDTORunner {
	public static void main(String[] args) {

		MarriageDTO dto = new MarriageDTO(1, "John", "juliet", false, LocalDate.of(2020, 04, 20), "Church", 99, true);

		MarriageRepository repo = new MarriageRepositoryImp();

		MarriageService service = new MarriageServiceImp(repo);
		boolean saved = service.validThenSave(dto);
		System.out.println(saved);

	}

}
