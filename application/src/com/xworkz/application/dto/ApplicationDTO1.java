package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ApplicationDTO1 implements Serializable {

	private String name;
	private double version;
	private LocalDate createDate;
	private int size;
	private String developedBy;
	private String type;
	private double price;
	private LocalDate firstVersionReleaseDate;
	private LocalDate currentVersionReleaseDate;
	private LocalDate nextVersionReleaseDate;
	private int trailDays;
	private String languageUsed;
	private double minProcessorSpeed;
	private double minramSpeedRequired;
	private boolean internetNeeded;
	private int ageLimit;
	private double numDownloads;
	private float ratings;
	private String osTypeSupported;

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

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getFirstVersionReleaseDate() {
		return firstVersionReleaseDate;
	}

	public void setFirstVersionReleaseDate(LocalDate firstVersionReleaseDate) {
		this.firstVersionReleaseDate = firstVersionReleaseDate;
	}

	public LocalDate getCurrentVersionReleaseDate() {
		return currentVersionReleaseDate;
	}

	public void setCurrentVersionReleaseDate(LocalDate currentVersionReleaseDate) {
		this.currentVersionReleaseDate = currentVersionReleaseDate;
	}

	public LocalDate getNextVersionReleaseDate() {
		return nextVersionReleaseDate;
	}

	public void setNextVersionReleaseDate(LocalDate nextVersionReleaseDate) {
		this.nextVersionReleaseDate = nextVersionReleaseDate;
	}

	public int getTrailDays() {
		return trailDays;
	}

	public void setTrailDays(int trailDays) {
		this.trailDays = trailDays;
	}

	public String getLanguageUsed() {
		return languageUsed;
	}

	public void setLanguageUsed(String languageUsed) {
		this.languageUsed = languageUsed;
	}

	public double getMinProcessorSpeed() {
		return minProcessorSpeed;
	}

	public void setMinProcessorSpeed(double minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}

	public double getMinRamSpeedRequired() {
		return minramSpeedRequired;
	}

	public void setRamSpeedRequired(double ramSpeedRequired) {
		this.minramSpeedRequired = ramSpeedRequired;
	}

	public boolean isInternetNeeded() {
		return internetNeeded;
	}

	public void setInternetNeeded(boolean internetNeeded) {
		this.internetNeeded = internetNeeded;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public double getNumDownloads() {
		return numDownloads;
	}

	public void setNumDownloads(double numDownloads) {
		this.numDownloads = numDownloads;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public String getOsTypeSupported() {
		return osTypeSupported;
	}

	public void setOsTypeSupported(String osTypeSupported) {
		this.osTypeSupported = osTypeSupported;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ageLimit, createDate, currentVersionReleaseDate, developedBy, firstVersionReleaseDate,
				internetNeeded, languageUsed, minProcessorSpeed, name, nextVersionReleaseDate, numDownloads,
				osTypeSupported, price, minramSpeedRequired, ratings, size, trailDays, type, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO1 other = (ApplicationDTO1) obj;
		return ageLimit == other.ageLimit && Objects.equals(createDate, other.createDate)
				&& Objects.equals(currentVersionReleaseDate, other.currentVersionReleaseDate)
				&& Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(firstVersionReleaseDate, other.firstVersionReleaseDate)
				&& internetNeeded == other.internetNeeded && Objects.equals(languageUsed, other.languageUsed)
				&& Double.doubleToLongBits(minProcessorSpeed) == Double.doubleToLongBits(other.minProcessorSpeed)
				&& Objects.equals(name, other.name)
				&& Objects.equals(nextVersionReleaseDate, other.nextVersionReleaseDate)
				&& Double.doubleToLongBits(numDownloads) == Double.doubleToLongBits(other.numDownloads)
				&& Objects.equals(osTypeSupported, other.osTypeSupported)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(minramSpeedRequired) == Double.doubleToLongBits(other.minramSpeedRequired)
				&& Float.floatToIntBits(ratings) == Float.floatToIntBits(other.ratings) && size == other.size
				&& trailDays == other.trailDays && Objects.equals(type, other.type)
				&& Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}

	@Override
	public String toString() {
		return "ApplicationDTO1 [name=" + name + ", version=" + version + ", createDate=" + createDate + ", size="
				+ size + ", developedBy=" + developedBy + ", type=" + type + ", price=" + price
				+ ", firstVersionReleaseDate=" + firstVersionReleaseDate + ", currentVersionReleaseDate="
				+ currentVersionReleaseDate + ", nextVersionReleaseDate=" + nextVersionReleaseDate + ", trailDays="
				+ trailDays + ", languageUsed=" + languageUsed + ", minProcessorSpeed=" + minProcessorSpeed
				+ ", ramSpeedRequired=" + minramSpeedRequired + ", internetNeeded=" + internetNeeded + ", ageLimit="
				+ ageLimit + ", numDownloads=" + numDownloads + ", ratings=" + ratings + ", osTypeSupported="
				+ osTypeSupported + "]";
	}

}
