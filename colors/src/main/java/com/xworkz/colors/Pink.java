package com.xworkz.colors;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/Hibiscus")
public class Pink extends HttpServlet {

	public Pink() {
		System.out.println("Running no-arg constructor in Pink Color");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Execute doGet method in Pink(Hibiscus) Colors");
	}

}
