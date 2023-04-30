package com.xworkz.electricity.dtoRunner;

import java.time.LocalDate;

import com.xworkz.electricity.constants.Location;
import com.xworkz.electricity.dto.ShowRoomDTO;
import com.xworkz.electricity.repository.ShowRoomRepository;
import com.xworkz.electricity.repository.ShowRoomRepositoryImp;
import com.xworkz.electricity.service.ShowRoomService;
import com.xworkz.electricity.service.ShowRoomServiceImp;

public class ShowRoomDTORunner {
	public static void main(String[] args) {

		ShowRoomDTO dto = new ShowRoomDTO(1, "Honda", Location.MAJESTIC, 55, LocalDate.of(2022, 9, 25), false);

		ShowRoomRepository repo = new ShowRoomRepositoryImp();

		ShowRoomService service = new ShowRoomServiceImp(repo);
		boolean saved = service.validThenSave(dto);
		System.out.println(saved);

	}

}
