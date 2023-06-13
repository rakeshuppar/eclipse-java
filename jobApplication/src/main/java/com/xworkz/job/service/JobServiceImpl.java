package com.xworkz.job.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.job.dto.JobDTO;
import com.xworkz.job.entity.JobEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JobServiceImpl implements JobService {
	
	@Override
	public boolean validThenSave(JobDTO dto) {
		log.info("Running validThenSave method in JobServiceImpl ");
		
		JobEntity entity=new JobEntity();
		BeanUtils.copyProperties(dto, entity);
		
		System.out.println("JobEntity:"+entity);
		return true;
	}

}
