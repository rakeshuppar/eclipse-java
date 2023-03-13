package com.xworkz.application.dtoRunner;

import java.time.LocalDate;

import com.xworkz.application.dto.AttendanceDTO;

public class AttendanceDTORunner {

	public static void main(String[] args) {

		AttendanceDTO attendence = new AttendanceDTO();
		attendence.setNumMembers(50);
		attendence.setPresent(30);
		attendence.setAbsent(20);
		attendence.setDate(LocalDate.of(2022, 6, 06));
		attendence.setNumColumns(6);
		System.out.println(attendence.equals(attendence));
		System.out.println(attendence.toString());
		System.out.println(attendence.hashCode() + " Origin Hashcode:" + System.identityHashCode(attendence));

	}

}
