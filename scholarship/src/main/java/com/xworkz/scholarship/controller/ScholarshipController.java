package com.xworkz.scholarship.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.scholarship.constatnt.ApplicationConstant;
import com.xworkz.scholarship.dto.ScholarshipDTO;
import com.xworkz.scholarship.service.ScholarshipService;

@Component
@RequestMapping("/")
@EnableWebMvc
public class ScholarshipController implements WebMvcConfigurer {

	@Autowired
	private ScholarshipService service;

	public ScholarshipController() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@PostMapping("/click")
	public String onClick(@Valid ScholarshipDTO dto, BindingResult result, Model model, MultipartFile file)
			throws IOException {
		System.out.println("Running onClick method on ScholarshipController:" + dto);

		if (result.hasErrors()) {
			System.out.println("Data is invalid");
			List<ObjectError> error = result.getAllErrors();
			error.forEach(e -> System.err.println(e.getDefaultMessage()));
			model.addAttribute("errors", error);
			model.addAttribute("dto", dto);
			return "/scholar.jsp";
		} else {
			this.service.validThenSave(dto);
			System.out.println("Data is valid");
			System.out.println("File received:" + file.getName());
			System.out.println("File size:" + file.getSize());
			System.out.println("File type:" + file.getContentType());
			System.out.println("File byte:" + file.getBytes());
			
			service.validThenSave(dto);
			
			File pFile = new File(ApplicationConstant.FILE_LOCATION + file.getOriginalFilename());
            
			
			
			try (OutputStream os = new FileOutputStream(pFile)) {
				os.write(file.getBytes());
				System.out.println("file added successfully");
			}

			model.addAttribute("msg", "Scholarship application for:" + dto.getStudentName() + "submitted successfully");

			model.addAttribute("successfull",
					"Scholarship Application is saved for " + dto.getStudentName() + " successfully");

		}
		return "/scholar.jsp";
	}

	@GetMapping("/fileDownload")
	public void sendImage(String fileName, String contentType, HttpServletResponse response) throws IOException {
		System.out.println("Running sendImage.......");
		File file = new File(ApplicationConstant.FILE_LOCATION + fileName);
		response.setContentType(contentType);
		OutputStream outputStream = response.getOutputStream();

		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[4096];
		int length;
		while ((length = in.read(buffer)) > 0) {
			outputStream.write(buffer, 0, length);
		}
		in.close();
		outputStream.flush();
	}
}
