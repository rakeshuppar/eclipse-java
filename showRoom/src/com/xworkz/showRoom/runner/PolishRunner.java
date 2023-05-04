package com.xworkz.showRoom.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showRoom.configuration.ShowConfiguration;
import com.xworkz.showRoom.dto.PolishDTO;
import com.xworkz.showRoom.dto.SalesManagerDTO;
import com.xworkz.showRoom.dto.ShowRoomDTO;
import com.xworkz.showRoom.dto.SockDTO;
import com.xworkz.showRoom.service.PolishService;
import com.xworkz.showRoom.service.SalesManagerService;
import com.xworkz.showRoom.service.ShowRoomService;
import com.xworkz.showRoom.service.SockService;

public class PolishRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ShowConfiguration.class);
		System.out.println("-----------------------START-------------------------------");
		System.out.println("---------------------PolishDTO------------------------------");
		PolishDTO dto = new PolishDTO(20, "Black", "Cherry");
		PolishService po = context.getBean(PolishService.class);
		System.out.println(po.validThenSave(dto));
		System.out.println(dto);

		System.out.println("-----------------------SalesManagerDTO-----------------------------");

		SalesManagerDTO dto1 = new SalesManagerDTO("Basavaraj", 50);
		SalesManagerService se = context.getBean(SalesManagerService.class);
		System.out.println(se.validThenSave(dto1));
		System.out.println(dto1);

		System.out.println("-----------------------ShowRoomDTO-----------------------------");

		ShowRoomDTO dto2 = new ShowRoomDTO(1, "Basavaraj", "Bagalkot", "GST12562");
		ShowRoomService sert = context.getBean(ShowRoomService.class);
		System.out.println(sert.validThenSave(dto2));
		System.out.println(dto2);

		System.out.println("----------------------SockDTO-------------------------------");

		SockDTO dto3 = new SockDTO("Adidas", 90);
		SockService ser = context.getBean(SockService.class);
		System.out.println(ser.validThenSave(dto3));
		System.out.println(dto3);

		System.out.println("-----------------------END-------------------------------");

	}

}
