package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AmbulanceDTO implements Serializable, Comparable<AmbulanceDTO> {

	@Min(value = 1, message = "value should be greater than 1")
	@Max(value = 100, message = "value should be lesser than 100")
	private int id;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String regNo;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String chasisNo;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String ownerName;
	@AssertFalse
	private boolean insuranceExpired;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String driverName;
	@NotNull
	private LocalDate taxStartDate;

	public AmbulanceDTO(int id, String regNo, String chasisNo, String ownerName, boolean insuranceExpired,
			String driverName, LocalDate taxStartDate) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.chasisNo = chasisNo;
		this.ownerName = ownerName;
		this.insuranceExpired = insuranceExpired;
		this.driverName = driverName;
		this.taxStartDate = taxStartDate;
	}

	@Override
	public String toString() {
		return "AmbulanceDTO [id=" + id + ", regNo=" + regNo + ", chasisNo=" + chasisNo + ", ownerName=" + ownerName
				+ ", insuranceExpired=" + insuranceExpired + ", driverName=" + driverName + ", taxStartDate="
				+ taxStartDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(chasisNo, driverName, id, insuranceExpired, ownerName, regNo, taxStartDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AmbulanceDTO other = (AmbulanceDTO) obj;
		return chasisNo == other.chasisNo && Objects.equals(driverName, other.driverName) && id == other.id
				&& insuranceExpired == other.insuranceExpired && Objects.equals(ownerName, other.ownerName)
				&& Objects.equals(regNo, other.regNo) && Objects.equals(taxStartDate, other.taxStartDate);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public boolean isInsuranceExpired() {
		return insuranceExpired;
	}

	public void setInsuranceExpired(boolean insuranceExpired) {
		this.insuranceExpired = insuranceExpired;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public LocalDate getTaxStartDate() {
		return taxStartDate;
	}

	public void setTaxStartDate(LocalDate taxStartDate) {
		this.taxStartDate = taxStartDate;
	}

	@Override
	public int compareTo(AmbulanceDTO o) {
		System.out.println("Running compare to method in ambulanceDTO");
		return this.ownerName.compareTo(ownerName);
	}

}
