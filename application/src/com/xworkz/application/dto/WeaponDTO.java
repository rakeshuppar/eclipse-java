package com.xworkz.application.dto;

import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constants.weapon.Type;

public class WeaponDTO {

	private int id;
	private String name;
	private Type type;
	private double cost;
	private String material;
	private String madeBy;
	private String manufacuredBy;
	private LocalDate date;
	private String usedBy;
	private String usedFor;
	private double weight;

	public WeaponDTO() {
		System.out.println("Running no arg constructor in WeaponDTO");
	}

	public WeaponDTO(int id, String name, Type type, double cost, String material, String madeBy, String manufacuredBy,
			LocalDate date, String usedBy, String usedFor, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.material = material;
		this.madeBy = madeBy;
		this.manufacuredBy = manufacuredBy;
		this.date = date;
		this.usedBy = usedBy;
		this.usedFor = usedFor;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "WeaponDTO [id=" + id + ", name=" + name + ", type=" + type + ", cost=" + cost + ", material=" + material
				+ ", madeBy=" + madeBy + ", manufacuredBy=" + manufacuredBy + ", date=" + date + ", usedBy=" + usedBy
				+ ", usedFor=" + usedFor + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, date, id, madeBy, manufacuredBy, material, name, type, usedBy, usedFor, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeaponDTO other = (WeaponDTO) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && Objects.equals(date, other.date)
				&& id == other.id && Objects.equals(madeBy, other.madeBy)
				&& Objects.equals(manufacuredBy, other.manufacuredBy) && Objects.equals(material, other.material)
				&& Objects.equals(name, other.name) && type == other.type && Objects.equals(usedBy, other.usedBy)
				&& Objects.equals(usedFor, other.usedFor)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getManufacuredBy() {
		return manufacuredBy;
	}

	public void setManufacuredBy(String manufacuredBy) {
		this.manufacuredBy = manufacuredBy;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
