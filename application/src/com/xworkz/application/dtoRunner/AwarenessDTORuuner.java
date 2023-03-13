package com.xworkz.application.dtoRunner;

import java.time.LocalDate;

import com.xworkz.application.dto.AwarenessDTO;

public class AwarenessDTORuuner {

	public static void main(String[] args) {

		AwarenessDTO awareness = new AwarenessDTO();
		awareness.setType("Environment Awareness");
		awareness.setMode("offline");
		awareness.setDate(LocalDate.of(2023, 02, 27));
		awareness.setDuration(2.30);
		awareness.setArea("On StreetRoad");
		System.out.println(awareness.equals(awareness));
		System.out.println(
				"Hash Code:" + awareness.hashCode() + "Original Hash Code:" + System.identityHashCode(awareness));
		System.out.println(awareness.toString());

	}

}
