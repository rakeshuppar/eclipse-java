package com.xworkz.showRoom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
public class PolishDTO implements Serializable, Comparable<PolishDTO> {

	@Min(value = 1, message = "value should be greater than 1")
	@Max(value = 20, message = "value should be lesser than 100")
	private int cost;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String color;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String polishBrand;

	@Override
	public int compareTo(PolishDTO o) {
		System.out.println("Ruuning compareTo method in ShowRoomDTO");
		return Integer.compare(this.getCost(), o.getCost());
	}

}
