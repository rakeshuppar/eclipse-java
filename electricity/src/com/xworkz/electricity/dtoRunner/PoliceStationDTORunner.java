package com.xworkz.electricity.dtoRunner;

import com.xworkz.electricity.dto.PoliceStationDTO;
import com.xworkz.electricity.repository.PoliceStationRepository;
import com.xworkz.electricity.repository.PoliceStationRepositoryImp;
import com.xworkz.electricity.service.PoliceStationService;
import com.xworkz.electricity.service.PoliceStationServiceImp;

public class PoliceStationDTORunner {
	public static void main(String[] args) {

		PoliceStationDTO dto = new PoliceStationDTO(0, "RajajinagarPoliceStation", "Rakesh", 4, "Rajajinagara");

		PoliceStationRepository repo = new PoliceStationRepositoryImp();

		PoliceStationService service = new PoliceStationServiceImp(repo);
		boolean saved = service.validThenSave(dto);
		System.out.println(saved);

	}
}
