package com.xworkz.carParkingProject.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.carParkingProject.dto.UserDTO;
import com.xworkz.carParkingProject.dto.UserInfoDTO;
import com.xworkz.carParkingProject.entity.UserEntity;
import com.xworkz.carParkingProject.entity.UserInfoEntity;
import com.xworkz.carParkingProject.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository repo;

	@Override
	public boolean validThanSave(UserDTO dto, UserInfoDTO infodto) {
		log.info("Running validThanSave method in UserServiceImp");
		UserEntity record = this.repo.findByUserEmail(dto.getEmail());
		if (record == null) {
			UserEntity userEntity = new UserEntity();
			BeanUtils.copyProperties(dto, userEntity);
			boolean saved = this.repo.save(userEntity);
			if (saved) {
				UserInfoEntity entity = new UserInfoEntity();
				UserEntity useByEmail = this.repo.findByUserEmail(dto.getEmail());
				infodto.setParkingId(useByEmail.getUserId());
				BeanUtils.copyProperties(infodto, entity);
				this.repo.saveUserParkingInfo(entity);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isUserExist(String email) {
		log.info("Running isUserExist in UserServiceImp");
		UserEntity entity = this.repo.findByUserEmail(email);
		if (entity != null) {
			return true;
		}
		return false;
	}

}
