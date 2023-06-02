package com.xworkz.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.student.dto.StudentDTO;
import com.xworkz.student.repository.StudentRepository;
import com.xworkz.student.repository.StudentRepositoryImp;
import com.xworkz.student.service.StudentService;
import com.xworkz.student.service.StudentServiceImp;

@WebServlet(loadOnStartup = 1,urlPatterns = "/send")
public class StudentServlet extends HttpServlet {
	
	public StudentServlet() {
		System.out.println("Running no arg constructor in StudentServlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet Method in StudentServlet");
	
		
		StudentDTO dto=new StudentDTO();
		dto.setName(req.getParameter("name"));
		dto.setQualification(req.getParameter("qualification"));
	    dto.setStream(req.getParameter("stream"));
		dto.setCourse(req.getParameter("course"));
		dto.setCollege(req.getParameter("college"));
		dto.setCity(req.getParameter("city"));
		dto.setState(req.getParameter("state"));
		dto.setCountry(req.getParameter("country"));
		
		StudentRepository repo= new StudentRepositoryImp();
		
		StudentService service= new StudentServiceImp(repo);
		try {
			boolean save=service.validThenSave(dto);
			System.out.println(save);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = req.getRequestDispatcher("/display.jsp");
		dis.forward(req, resp);	
		
	}

}
