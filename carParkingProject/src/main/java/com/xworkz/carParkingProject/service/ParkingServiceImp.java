package com.xworkz.carParkingProject.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.carParkingProject.dto.ParkingDTO;
import com.xworkz.carParkingProject.emailUtil.SendEmail;
import com.xworkz.carParkingProject.entity.ParkingEntity;
import com.xworkz.carParkingProject.repository.ParkingRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ParkingServiceImp implements ParkingService {

	@Autowired
	private ParkingRepository repo;

	@Override
	public ParkingDTO signIn(String email, String password) {
		log.info("Running SignIn method in ParkingServiceImp");
		ParkingEntity entity = this.repo.findByEmail(email);
		ParkingDTO dto = new ParkingDTO();
		if (entity.getEmail().equals(email) && entity.getPasword().equals(password)) {
			// SendEmail.sendEmail(entity.getEmail(), entity.getPasword());
			LocalDateTime datetime = LocalDateTime.now();
			datetime = datetime.withSecond(0).withNano(0);
			entity.setLastLoginTime(datetime);
			this.repo.updateLoginTime(entity);
			BeanUtils.copyProperties(entity, dto);
			return dto;
		} else {
			return null;
		}
	}
}