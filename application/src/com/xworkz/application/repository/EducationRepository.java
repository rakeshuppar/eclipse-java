package com.xworkz.application.repository;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;

public interface EducationRepository {

	public boolean save(EducationDTO dto);

	public default boolean isExist(EducationDTO dto) {
		return false;

	}

	public EducationDTO find(EducationDTO dto1);

	public EducationDTO findByCandidateName(String candidateName);

	public EducationDTO findByCandidateNameAndUniversity(String candidateName, String university);

	public boolean findBacklogsByCandiadateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String University);

	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate);

	double findPercentageByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university);

	String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university);

	String findUniversityByCandidateName(String candidateName);

	int total();

}
