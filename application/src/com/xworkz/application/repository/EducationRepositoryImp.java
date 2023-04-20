package com.xworkz.application.repository;

import java.time.LocalDate;

import com.xworkz.application.dto.EducationDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class EducationRepositoryImp implements EducationRepository {

	private EducationDTO[] edu = new EducationDTO[3];
	private int eduindex = 0;

	@Override
	public boolean save(EducationDTO repo) {

		if (this.eduindex < this.edu.length) {
			this.edu[eduindex] = repo;
			System.out.println("repo is saved at index:" + this.eduindex + " " + repo);
			this.eduindex++;
			return true;
		} else {
			System.err.println("memory is full,cannot add more files,maximum allow");
			throw new FestivalMemoryFullException("Memory Full Exception is Handled by FestivalMemoryFullException, Will terminate");
		}

	}

	@Override
	public boolean isExist(EducationDTO dto) {
		if (this.eduindex == 0) {
			System.out.println("first element will not check");
			return false;
		} else {
			System.err.println("second element will onwards check");
			for (int index = 0; index < this.eduindex; index++) {
				EducationDTO temp = this.edu[index];
				if (temp.equals(dto)) {
					System.out.println("address already exists");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) {

		for (int i = 0; i < this.edu.length; i++) {
			EducationDTO temp = this.edu[i];
			if (temp.equals(dto)) {
				System.out.println("dto is present:" + dto);
			}
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateName(String candidateName) {

		for (int i = 0; i < this.edu.length; i++) {
			EducationDTO temp = this.edu[i];
			if (temp.getCandidateName().equals(candidateName)) {
				System.out.println("candidatename is present:" + candidateName);
			}
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateNameAndUniversity(String candidateName, String university) {
		for (int i = 0; i < this.edu.length; i++) {
			EducationDTO temp = this.edu[i];
			if (temp.getCandidateName().equals(candidateName) && temp.getUniversity().equals(university))
				;
			System.out
					.println("candidatename is present:" + candidateName + " " + "university is present:" + university);
		}

		return null;
	}

	@Override
	public boolean findBacklogsByCandiadateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		for (int i = 0; i < this.edu.length; i++) {
			EducationDTO temp = this.edu[i];
			if (temp.getCandidateName().equals(candidateName) && temp.getDegreeName().equals(degreeName)
					&& temp.getUniversity().equals(university))
				;
			System.out.println("candidatename is present:" + candidateName + " " + "degree is present:" + degreeName
					+ " " + "University is present:" + university);
		}
		return false;
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) {
		for (int i = 0; i < this.edu.length; i++) {
			EducationDTO temp = this.edu[i];
			if (temp.getCandidateName().equals(candidateName) && temp.getStartDate().equals(startDate)
					&& temp.getEndDate().equals(endDate))
				;
			System.out.println("candidatename is present:" + candidateName + " " + "start date is present:" + startDate
					+ " " + "Enddate is present:" + endDate);
		}
		return null;
	}

	@Override
	public double findPercentageByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		for (int i = 0; i < this.edu.length; i++) {
			EducationDTO temp = this.edu[i];
			if (temp.getCandidateName().equals(candidateName) && temp.getDegreeName().equals(degreeName)
					&& temp.getUniversity().equals(university))
				;
			System.out.println("candidatename is present:" + candidateName + " " + "degree is present:" + degreeName
					+ " " + "University is present:" + university);
		}

		return 0;
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUniversity(String candidateName, String degreeName,
			String university) {
		for (int i = 0; i < this.edu.length; i++) {
			EducationDTO temp = this.edu[i];
			if (temp.getCandidateName().equals(candidateName) && temp.getDegreeName().equals(degreeName)
					&& temp.getUniversity().equals(university))
				;
			System.out.println("candidatenamed is present:" + candidateName + " " + "degree is present:" + degreeName
					+ " " + "University is present:" + university);
		}
		return null;
	}

	@Override
	public String findUniversityByCandidateName(String candidateName) {
		for (int i = 0; i < this.edu.length; i++) {
			EducationDTO temp = this.edu[i];
			if (temp.getCandidateName().equals(candidateName))
				;
			System.out.println("candidate name is present:" + candidateName);
		}

		return null;
	}

	@Override
	public int total() {
		return 0;
	}
}
