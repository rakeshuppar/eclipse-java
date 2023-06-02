package com.xworkz.student.service;

import com.xworkz.student.dto.StudentDTO;

public interface StudentService {

	boolean validThenSave(StudentDTO dto) throws ClassNotFoundException ;

}
