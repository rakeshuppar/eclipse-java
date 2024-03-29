package com.xworkz.job.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
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

import com.xworkz.job.constant.ApplicationConstant;
import com.xworkz.job.dto.JobDTO;
import com.xworkz.job.service.JobService;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@EnableWebMvc
@Slf4j
public class JobController {

	@Autowired
	private JobService service;

	Collection<JobDTO> collections = new ArrayList<JobDTO>();

	public JobController() {
		log.info("Running no arg constructor in JobController");
	}

	@PostMapping("/send")
	public String onClick(@Valid JobDTO dto, BindingResult result, Model model, MultipartFile file) throws IOException {
		log.info("Running onClick method in JobController:" + dto);
		this.collections.add(dto);

		if (result.hasErrors()) {
			log.info("Data is invalid");
			List<ObjectError> error = result.getAllErrors();
			error.forEach(e -> System.out.println(e.getDefaultMessage()));
			// model.addAttribute("errors", error);
			model.addAttribute("dto", dto);
			return "/job.jsp";

		} else {
			log.info("File Recived:" + file.getName());
			log.info("File Size:" + file.getSize());
			log.info("File Type:" + file.getContentType());
			log.info("File Bytes:" + file.getBytes());
			dto.setFileName(System.currentTimeMillis() + "_" + file.getOriginalFilename());
			dto.setContectType(file.getContentType());
			dto.setFileSize(file.getSize());

			this.service.validThenSave(dto);

			File phyicalFile = new File(ApplicationConstant.FILE_LOCATION + dto.getFileName());
			try (OutputStream os = new FileOutputStream(phyicalFile)) {
				os.write(file.getBytes());

			}
			model.addAttribute("Successfull", "This application is saved for:" + dto.getName() + "successfully");
			log.info("Data is valid");

		}
		return "/job.jsp";
	}

	@GetMapping("/display")
	public String dispaly(Model model) {
		log.info("Running display method in Job COntroller");
		model.addAttribute("fall", this.collections);
		return "/display.jsp";
	}

	@GetMapping("/fileDownload")
	public void dispalyImage(String fileName, String contectType, HttpServletResponse response) throws IOException {
		log.info("Running displayImage method in Job Controller ");
		File file = new File(ApplicationConstant.FILE_LOCATION + fileName);
		response.setContentType(contectType);
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