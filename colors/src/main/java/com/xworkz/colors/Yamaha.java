package com.xworkz.colors;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/Bike5")
public class Yamaha extends HttpServlet {

	public Yamaha() {
		System.out.println("Running no-arg constructor in YamahaBike");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("execute doGet method on YamahaBike");

		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		System.out.println(req.getRequestURI());
		
		Enumeration<String> enumation = req.getHeaderNames();
		
		while (enumation.hasMoreElements()) {
			String headername = (String) enumation.nextElement();
			System.out.println(headername+" : "+req.getHeader(headername));
			
		}
		
		System.out.println("=========================================");
		
		
		
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html><body><h1>This is my First Response</h1></body></html>");
		
	}
	


	
}
