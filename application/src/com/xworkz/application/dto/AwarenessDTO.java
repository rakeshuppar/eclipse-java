package com.xworkz.application.dto;

import java.time.LocalDate;
import java.util.Objects;

public class AwarenessDTO {

	private String type;
	private String mode;
	private LocalDate date;
	private double duration;
	private String area;

	public AwarenessDTO() {
		System.out.println("Running no arg constructor in AwarenessDTO");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, date, duration, mode, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AwarenessDTO other = (AwarenessDTO) obj;
		return Objects.equals(area, other.area) && Objects.equals(date, other.date)
				&& Double.doubleToLongBits(duration) == Double.doubleToLongBits(other.duration)
				&& Objects.equals(mode, other.mode) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "AwarenessDTO [type=" + type + ", mode=" + mode + ", date=" + date + ", duration=" + duration + ", area="
				+ area + "]";
	}

}
