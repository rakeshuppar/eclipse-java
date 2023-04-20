package com.xworkz.application.dtoRunner;

import com.xworkz.application.dto.DairyDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.DairyRepository;
import com.xworkz.application.repository.DairyRepositoryImp;
import com.xworkz.application.service.DairyService;
import com.xworkz.application.service.DairyServiceImp;

public class DairyDTORunner {

	public static void main(String[] args) throws InvalidFestivalException {

		DairyDTO dto = new DairyDTO("Nandini", "Rajajinagar", 7.0, 9.0, "Raju");

		DairyRepository repo = new DairyRepositoryImp();

		DairyService service = new DairyServiceImp(repo);
		boolean saved = service.validThenSave(dto);
		System.out.println("service is:" + saved);

		System.out.println("------------------------------------------------------");

		DairyDTO dto1 = new DairyDTO(null, "Malleshwaram", 8.0, 8.30, "Basu");
		boolean saved1 = service.validThenSave(dto1);
		System.out.println("service is:" + saved1);

		System.out.println("------------------------------------------------------");

		DairyDTO dto2 = new DairyDTO("Nandinii", "Majestic", 7.30, 9.30, "Krishna");
		boolean saved2 = service.validThenSave(dto2);
		System.out.println("service is:" + saved2);

		System.out.println("------------------------------------------------------");

		DairyDTO dto3 = new DairyDTO("Arogya", "BhasyamCircle", 10.0, 10.30, "RAJU");
		boolean saved3 = service.validThenSave(dto3);
		System.out.println("service is:" + saved3);

		System.out.println("------------------------------------------------------");

		DairyDTO dto4 = new DairyDTO("Nandini", "Rajajinagar", 7.0, 9.15, "Pradeep");
		boolean saved4 = service.validThenSave(dto4);
		System.out.println("service is:" + saved4);

		System.out.println("------------------------------------------------------");

		boolean ref = service.find(dto1);
		System.out.println("find dto:" + ref);

		System.out.println("1111111111111111111111");

		DairyDTO name = service.findByName("Nandini");
		System.out.println("find dto by name:" + name);

		System.out.println("2222222222222222222222");

		DairyDTO ref1 = service.findByNameorOpenorClose("Arogya", 10.0, 10.30);
		System.out.println("find dto by name or open or close:" + ref1);

		System.out.println("3333333333333333333333");

		double name1 = service.openFindByName("Arogya");
		System.out.println("open find by name: " + name1);

		System.out.println("4444444444444444444444");

		double ref2 = service.openFindByNameAndClose("Nandinii", 9.30);
		System.out.println("open find by name and close:" + ref2);

		System.out.println("55555555555555555555555");

		int total = service.total();
		System.out.println("Total DairyDto's are:" + total);

		System.out.println("666666666666666666666666");

		service.findAll();

	}

}
