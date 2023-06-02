package com.xworkz.contact.contoller;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.contact.dto.ContactDTO;
import com.xworkz.contact.emailUtil.SendEmail;

@Component
@RequestMapping("/")
public class ContactController {

Collection<ContactDTO> collection=new ArrayList<ContactDTO>();

	public ContactController() {
	System.out.println("Running no arg constructor in ContactController ");
	}
	@PostMapping("/save")
	public String send(ContactDTO dto, Model model,HttpServletRequest req) {
		System.out.println("Running send method in ContactController:"+dto);
		this.collection.add(dto);
		HttpSession httpsession=req.getSession();
		httpsession.setAttribute("hname", req.getParameter("name"));
		httpsession.setAttribute("email", req.getParameterValues("email"));
		httpsession.setAttribute("hcountry", req.getParameter("country"));
		httpsession.setAttribute("hnumber", req.getParameter("mobileNum"));
		httpsession.setAttribute("htype", req.getParameter("type"));
		httpsession.setAttribute("hdescription", req.getParameter("description"));
	    SendEmail.sendEmail(dto.getEmail(), dto.getName());
		model.addAttribute("msg", "This is saved for:"+dto.getName()+"successfully");
	    model.addAttribute("list",collection);
		return "/view.jsp";		
	}
	
	@GetMapping("/view")
	public String onView(Model model) {
		System.out.println("Running on View method in ContactController");
		model.addAllAttributes(this.collection);
		return "/view.jsp";
	}

}
