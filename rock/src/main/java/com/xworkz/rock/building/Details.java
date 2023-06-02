package com.xworkz.rock.building;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/build", loadOnStartup = 1)
public class Details extends HttpServlet {

	public Details() {
		System.out.println("Running no arg constructor in Details");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Running dopost method in details");

		RequestDispatcher dispatch = request.getRequestDispatcher("display.jsp");
		dispatch.forward(request, response);

	}

}
