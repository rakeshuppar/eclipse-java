package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constants.Headphone.Brand;
import com.xworkz.application.constants.Headphone.TypeandWeight;
import com.xworkz.application.constants.Headphone.Colour;

public class HeadphoneDTO implements Serializable {

	private Brand brand;
	private String modelNum;
	private double price;
	private boolean bass;
	private Colour colour;
	private TypeandWeight typeandweight;
	private String customerName;
	private int invoiceNum;
	private LocalDate date;
	private int warrantyPeriod;

	public HeadphoneDTO() {
		System.out.println("Running no arg constructor in HeadPhoneDTO");
	}

	public HeadphoneDTO(Brand brand, String modelNum, double price, boolean bass, Colour colour,
			TypeandWeight typeandweight, String customerName, int invoiceNum, LocalDate date, int warrantyPeriod) {
		super();
		this.brand = brand;
		this.modelNum = modelNum;
		this.price = price;
		this.bass = bass;
		this.colour = colour;
		this.typeandweight = typeandweight;
		this.customerName = customerName;
		this.invoiceNum = invoiceNum;
		this.date = date;
		this.warrantyPeriod = warrantyPeriod;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModelNum() {
		return modelNum;
	}

	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public TypeandWeight getTypeandweight() {
		return typeandweight;
	}

	public void setTypeandweight(TypeandWeight typeandweight) {
		this.typeandweight = typeandweight;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(int invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setPeriod(int warrentyPeriod) {
		this.warrantyPeriod = warrentyPeriod;
	}

	@Override
	public String toString() {
		return "HeadphoneDTO [brand=" + brand + " , modelNum=" + modelNum + ", price=" + price + ", bass=" + bass
				+ ", Colour=" + colour + ", TypeandWeight=" + typeandweight + ", customerName=" + customerName
				+ ", invoiceNum=" + invoiceNum + ", Date=" + date + ", warrantyPeriod=" + warrantyPeriod + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, modelNum, price, bass, colour, typeandweight, customerName, invoiceNum, date,
				warrantyPeriod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeadphoneDTO other = (HeadphoneDTO) obj;
		return bass == other.bass && Objects.equals(customerName, other.customerName) && invoiceNum == other.invoiceNum
				&& Objects.equals(modelNum, other.modelNum) && warrantyPeriod == other.warrantyPeriod
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

}
