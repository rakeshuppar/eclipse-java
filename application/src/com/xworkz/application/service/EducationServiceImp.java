package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.EducationRepository;

import static com.xworkz.application.util.EducationUtil.*;

public class EducationServiceImp implements EducationService {

	private EducationRepository repo;

	public EducationServiceImp(EducationRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(EducationDTO dto) throws InvalidFestivalException {

		System.out.println("running validthen save in EducationDTO");

		if (dto != null) {
			System.out.println("dto is null");

			int id = dto.getId();
			String degree = dto.getDegreeName();
			double percent = dto.getPercentage();
			String university = dto.getUniversity();
			LocalDate start = dto.getStartDate();
			LocalDate end = dto.getEndDate();
			int back = dto.getBacklogs();
			String stream = dto.getStream();
			String candiadte = dto.getCandidateName();

			boolean validId = false;
			boolean validDegree = false;
			boolean validPercentage = false;
			boolean validUniversity = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validBacklogs = false;
			boolean validStream = false;
			boolean validCandidateName = false;

			if (validint(id)) {
				System.out.println("valid ID");
				validId = true;
			} else {
				System.err.println("invalid ID");
			}

			if (validString(degree)) {
				System.out.println("valid Degree");
				validDegree = true;
			} else {
				System.err.println("invalid Degree");
			}

			if (validDouble(percent)) {
				System.out.println("valid percentage");
				validPercentage = true;
			} else {
				System.err.println("invalid percentage");
			}

			if (validString(university)) {
				System.out.println("valid University");
				validUniversity = true;
			} else {
				System.err.println("invalid Univaersity");
			}

			if (validDate(start, start)) {
				System.out.println("valid Startdate");
				validStartDate = true;
			} else {
				System.err.println("invalid StartDate");
			}

			if (validDate(end, end)) {
				System.out.println("valid EndDate");
				validEndDate = true;
			} else {
				System.err.println("invalis EndDate");
			}

			if (validint(back)) {
				System.out.println("valid backlogs");
				validBacklogs = true;
			} else {
				System.err.println("invalid backlogs");
			}

			if (validString(stream)) {
				System.out.println("valid stream");
				validStream = true;
			} else {
				System.err.println("invalid stream");
			}

			if (validString(candiadte)) {
				System.out.println("valid candidate name");
				validCandidateName = true;
			} else {
				System.err.println("invalid candidate name");
			}

			if (vaildFlag(validId, validDegree, validPercentage, validUniversity, validStartDate, validEndDate,
					validBacklogs, validStream, validCandidateName)) {
				System.out.println("All properties are valid thean save data");
				boolean exists = this.repo.isExist(dto);
				if (!exists) {
					System.out.println("dto is exists");
					boolean save = this.repo.save(dto);
					return save;
				} else {
					System.err.println("not valid data");
					throw new InvalidFestivalException("Invalid Exception is by InvalidFestivalException, Data terminate"); 
				}
			}
			return false;

		}
		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) throws InvalidFestivalException {
		if (validThenSave(dto)) {
			return this.repo.find(dto);
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateName(String candiadteName) {
		if (validString(candiadteName)) {
			return this.repo.findByCandidateName(candiadteName);
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateNameAndUniversity(String candidateName, String university) {
		if (validString(candidateName) && validString(university)) {
			return this.repo.findByCandidateNameAndUniversity(candidateName, university);
		}
		return null;
	}

	@Override
	public boolean findBacklogsByCandiadateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		if (validString(candidateName) && validString(degreeName) && validString(university)) {
			this.repo.findBacklogsByCandiadateNameAndDegreeNameAndUniversity(candidateName, degreeName, university);
		}
		return false;
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) {
		if (validString(candidateName) && validDate(startDate, startDate) && validDate(endDate, endDate)) {
			return this.repo.findByCandidateNameAndStartDateAndEndDate(candidateName, startDate, endDate);
		}
		return null;
	}

	@Override
	public double findPercentageByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		if (validString(candidateName) && validString(degreeName) && validString(university)) {
			return this.repo.findPercentageByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName,
					university);
		}
		return 0;
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		if (validString(candidateName) && validString(degreeName) && validString(university)) {
			return this.repo.findStreamByCandidateNameAndDegreeNameAndUniversity(candidateName, degreeName, university);
		}
		return null;
	}

	@Override
	public String findUniversityByCandidateName(String candidateName) {
		if (validString(candidateName)) {
			return this.repo.findUniversityByCandidateName(candidateName);
		}
		return null;
	}

	@Override
	public int total() {
		if (validint(0)) {
			this.repo.total();

		}
		return 0;
	}

	@Override
	public boolean isExist(EducationDTO dto) throws InvalidFestivalException {
		if (validThenSave(dto)) {
			return this.repo.isExist(dto);
		}
		return false;
	}
}
