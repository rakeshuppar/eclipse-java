package com.xworkz.showRoom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.showRoom.dto.ShowRoomDTO;

@Component
public class ShowRoomRepositiryImp implements ShowRoomRepository {

	private Collection<ShowRoomDTO> showRoom = new ArrayList<>();

//	public ShowRoomRepositiryImp(Collection<ShowRoomDTO> showRoom) {
//		this.showRoom = showRoom;
//	}

	@Override
	public boolean save(ShowRoomDTO dto) {
		System.out.println("Running save method  ShowRoomRepositiryImp---- ");
		return this.showRoom.add(dto);
	}

}
