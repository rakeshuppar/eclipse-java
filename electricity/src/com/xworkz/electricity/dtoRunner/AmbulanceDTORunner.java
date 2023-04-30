package com.xworkz.electricity.dtoRunner;

import java.time.LocalDate;

import com.xworkz.electricity.dto.AmbulanceDTO;
import com.xworkz.electricity.repository.AmbulanceRepository;
import com.xworkz.electricity.repository.AmbulanceRepositoryImp;
import com.xworkz.electricity.service.AmbulanceService;
import com.xworkz.electricity.service.AmbulanceServiceImp;

public class AmbulanceDTORunner {

	public static void main(String[] args) {

		AmbulanceDTO dto = new AmbulanceDTO(1, "KA29M1998", "HF625HGHH5GH69G", "Raju", false, "Krishna",
				LocalDate.of(2022, 04, 22));

		AmbulanceRepository repo = new AmbulanceRepositoryImp();

		AmbulanceService service = new AmbulanceServiceImp(repo);
		boolean saved = service.validThenSave(dto);
		System.out.println(saved);

	}

}
