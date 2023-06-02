package com.xworkz.isckon.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class IsckonDTO implements Serializable, Comparable<IsckonDTO> {

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 45)
	private String godName;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 45)
	private String location;

	@Min(value = 20)
	@Max(value = 200)
	private double area;

	@Min(value = 20)
	@Max(value = 200)
	private float entryFee;

	private boolean open;

	@Override
	public int compareTo(IsckonDTO o) {
		return this.getGodName().compareTo(o.getGodName());
	}
}
