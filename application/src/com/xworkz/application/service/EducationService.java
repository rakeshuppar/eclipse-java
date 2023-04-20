package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.InvalidFestivalException;

public interface EducationService {

	public boolean validThenSave(EducationDTO dto) throws InvalidFestivalException;

	public default boolean isExist(EducationDTO dto) throws InvalidFestivalException {
		return false;

	}

	public EducationDTO find(EducationDTO dto) throws InvalidFestivalException;

	public EducationDTO findByCandidateName(String candiadateName);

	public EducationDTO findByCandidateNameAndUniversity(String candidateName, String university);

	public boolean findBacklogsByCandiadateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university);

	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate);

	double findPercentageByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university);

	String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university);

	String findUniversityByCandidateName(String candidateName);

	int total();

}
