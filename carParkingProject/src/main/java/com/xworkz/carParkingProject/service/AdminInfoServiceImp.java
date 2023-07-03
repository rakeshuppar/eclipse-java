package com.xworkz.carParkingProject.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.xworkz.carParkingProject.dto.AdminInfoDTO;
import com.xworkz.carParkingProject.entity.AdminInfoEntity;
import com.xworkz.carParkingProject.repository.AdminInfoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Component
public class AdminInfoServiceImp implements AdminInfoService {

	@Autowired
	private AdminInfoRepository repo;

	@Override
	public boolean validThenSave(AdminInfoDTO dto) {
		log.info("Running validThenSave method in  AdminInfoServiceImp");
		AdminInfoEntity record = this.repo.findByLocationTypeClassficationDays(dto.getLocation(), dto.getType(),
				dto.getClassfication(), dto.getDays());
		if (record != null) {
			log.info("Data is already exist in the database");
			return false;
		} else {
			AdminInfoEntity entity = new AdminInfoEntity();
			BeanUtils.copyProperties(dto, entity);
			this.repo.save(entity);
			return true;
		}
	}

	@Override
	public List<AdminInfoDTO> findByLocation(String location) {
		log.info("Running findByLocation in AdminInfoServiceImp");

		List<AdminInfoEntity> entity = this.repo.findByLocation(location);

		List<AdminInfoDTO> dtos = entity.stream().map(ent -> {

			AdminInfoDTO adminInfodto = new AdminInfoDTO();
			BeanUtils.copyProperties(ent, adminInfodto);
			return adminInfodto;

		}).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public AdminInfoDTO isExist(String location, String type, String classifiction, int days) {
		log.info("Running isExist method in  AdminInfoServiceImp"); //
		AdminInfoEntity record = this.repo.findByLocationTypeClassficationDays(location, type, classifiction, days);
		if (record != null) {
			AdminInfoDTO dto = new AdminInfoDTO();
			BeanUtils.copyProperties(record, dto);
			return dto;
		} else {
			return null;
		}
	}
}