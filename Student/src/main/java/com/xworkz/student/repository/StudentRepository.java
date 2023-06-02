package com.xworkz.student.repository;

import com.xworkz.student.dto.StudentDTO;

public interface StudentRepository {
	
	boolean save(StudentDTO dto) throws ClassNotFoundException ;

}
