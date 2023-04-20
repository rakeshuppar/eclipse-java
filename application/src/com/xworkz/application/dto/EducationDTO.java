package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class EducationDTO implements Serializable {
	
	private int id;
	private String degreeName;
	private double percentage;
	private String University;
	private LocalDate startDate;
	private LocalDate endDate;
	private int backlogs;
	private String stream;
	private String candidateName;
	
	public EducationDTO() {
		System.out.println("no arg constructor in Education DTO");
	}

	public EducationDTO(int id, String degreeName, double percentage, String university, LocalDate startDate,
			LocalDate endDate, int backlogs, String stream, String candidateName) {
		super();
		this.id = id;
		this.degreeName = degreeName;
		this.percentage = percentage;
		University = university;
		this.startDate = startDate;
		this.endDate = endDate;
		this.backlogs = backlogs;
		this.stream = stream;
		this.candidateName = candidateName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getUniversity() {
		return University;
	}

	public void setUniversity(String university) {
		University = university;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getBacklogs() {
		return backlogs;
	}

	public void setBacklogs(int backlogs) {
		this.backlogs = backlogs;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(University, backlogs, candidateName, degreeName, endDate, id, percentage, startDate,
				stream);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EducationDTO other = (EducationDTO) obj;
		return Objects.equals(University, other.University) && backlogs == other.backlogs
				&& Objects.equals(candidateName, other.candidateName) && Objects.equals(degreeName, other.degreeName)
				&& Objects.equals(endDate, other.endDate) && id == other.id
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& Objects.equals(startDate, other.startDate) && Objects.equals(stream, other.stream);
	}

	@Override
	public String toString() {
		return "EducationDTO [id=" + id + ", degreeName=" + degreeName + ", percentage=" + percentage + ", University="
				+ University + ", startDate=" + startDate + ", endDate=" + endDate + ", backlogs=" + backlogs
				+ ", stream=" + stream + ", candidateName=" + candidateName + "]";
	}
	
	
	

}
