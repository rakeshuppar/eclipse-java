package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ApplicationDTO implements Serializable {

	private String name;
	private double version;
	private String developedBy;
	private int size;
	private LocalDate createdDate;

	public ApplicationDTO() {
		System.out.println("Running no arg constructor in ApplicationDTO");
	}

	public ApplicationDTO(String name, double version, String developedBy, int size, LocalDate createdDate) {
		super();
		this.name = name;
		this.version = version;
		this.developedBy = developedBy;
		this.size = size;
		this.createdDate = createdDate;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdDate, developedBy, name, size, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		return Objects.equals(createdDate, other.createdDate) && Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(name, other.name) && size == other.size
				&& Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", developedBy=" + developedBy + ", size="
				+ size + ", createdDate=" + createdDate + "]";
	}

}
