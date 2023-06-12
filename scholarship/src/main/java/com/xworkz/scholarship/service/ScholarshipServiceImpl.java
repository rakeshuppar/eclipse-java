package com.xworkz.scholarship.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.scholarship.dto.ScholarshipDTO;
import com.xworkz.scholarship.entity.ScholarshipEntity;

@Service
public class ScholarshipServiceImpl implements ScholarshipService {


	@Override
	public boolean validThenSave(ScholarshipDTO dto) {
		System.out.println("Running validThenSave method in ScholarshipServiceImpl ");
		
		ScholarshipEntity entity = new ScholarshipEntity();

		BeanUtils.copyProperties(dto, entity);
		System.out.println("ScholarshipEntity:"+entity);
		return true;
	}

}
