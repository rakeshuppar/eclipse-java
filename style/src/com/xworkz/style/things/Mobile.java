package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Mobile {

	@Value(value = "Redmi")
	private String brand;

	@Value(value = "acquaGreen")
	private String color;

	@Value(value = "15000.0")
	private double cost;

	@Value(value = "Andriod10.0")
	private String os;

	@Value(value = "4G")
	private String cellularTechnology;

	@Value(value = "128GB")
	private String memoryCapacity;

	@Value(value = "6.53")
	private double screenSize;

	@Value(value = "RedmiNote9")
	private String deviceName;

	@Value(value = "microSDXC")
	private String cardSlot;

	@Value(value = "Dual")
	private String Sim;

	@Value(value = "HSPA,LTE-A")
	private String speed;

	@Value(value = "GSM/HSPA/LTE")
	private String technlogy;

	@Value(value = "Corning Gorilla Glass")
	private String potection;

	@Value(value = "181.0")
	private double weight;

	@Value(value = "Available")
	private String status;

	public String name() {
		System.out.println("Running name in Mobile--------");
		return "Samsung";

	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", color=" + color + ", cost=" + cost + ", os=" + os + ", cellularTechnology="
				+ cellularTechnology + ", memoryCapacity=" + memoryCapacity + ", screenSize=" + screenSize
				+ ", deviceName=" + deviceName + ", cardSlot=" + cardSlot + ", Sim=" + Sim + ", speed=" + speed
				+ ", technlogy=" + technlogy + ", potection=" + potection + ", weight=" + weight + ", status=" + status
				+ "]";
	}

}
