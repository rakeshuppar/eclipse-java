package com.xworkz.application.dtoRunner;

import java.time.LocalDate;

import com.xworkz.application.dto.TravelDTO;

public class TravelDTORunner {

	public static void main(String[] args) {

		TravelDTO travel = new TravelDTO();
		travel.setDate(LocalDate.of(2023, 6, 06));
		travel.setTravelMode("Train");
		travel.setTravelBudget(15000);
		travel.setNumDays(20);
		travel.setTraveller("Rakesh");
		System.out.println(travel.toString());
		System.out.println("Hashcode:" + travel.hashCode() + " Original Hashcode:" + System.identityHashCode(travel));
		System.out.println(travel.equals(travel));
	}

}
