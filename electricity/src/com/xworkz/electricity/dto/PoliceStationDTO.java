package com.xworkz.electricity.dto;

import java.io.Serializable;

import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.graalvm.polyglot.Value;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor

public class PoliceStationDTO implements Serializable, Comparable<PoliceStationDTO> {

	@Min(value = 1, message = "value should be greater than 1")
	@Max(value = 100, message = "value should be lesser than 100")
	private int id;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String name;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String inspectorName;
	@Min(value = 1, message = "value should be greater than 1")
	@Max(value = 100, message = "value should be lesser than 100")
	private int cells;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String area;

	public PoliceStationDTO(int id, String name, String inspectorName, int cells, String area) {
		super();
		this.id = id;
		this.name = name;
		this.inspectorName = inspectorName;
		this.cells = cells;
		this.area = area;
	}

	@Override
	public int compareTo(PoliceStationDTO o) {
		System.out.println("Running compare to method in PoliceStation DTO");
		return this.name.compareTo(name);
	}

}
