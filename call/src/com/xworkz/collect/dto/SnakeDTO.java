package com.xworkz.collect.dto;

import com.xworkz.collect.constants.snake.Type;
import java.io.Serializable;
import java.util.Objects;

public class SnakeDTO implements Serializable, Comparable<SnakeDTO> {

	private int id;
	private Type type;
	private String name;
	private String place;

	public SnakeDTO(int id, String name, String place, Type type) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, place, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SnakeDTO other = (SnakeDTO) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(place, other.place)
				&& Objects.equals(type, other.type);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public int compareTo(SnakeDTO o) {
		System.out.println("Running compare to method---------");
		return Integer.compare(this.getId(), o.getId());
	}

	@Override
	public String toString() {
		return "SnakeDTO [id=" + id + ", type=" + type + ", name=" + name + ", place=" + place + "]";
	}

}
