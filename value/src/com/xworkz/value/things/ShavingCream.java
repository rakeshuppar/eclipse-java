package com.xworkz.value.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShavingCream {

	private String brand;
	@Value(value = "200.0")
	private double price;
	@Value(value = "500")
	private double quantity;

	public ShavingCream(@Value(value = "Gillete") String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "ShavingCream [brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
