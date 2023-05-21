package com.xworkz.Rakesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/PMname")
public class PMInfo extends HttpServlet{

	public PMInfo() {
		System.out.println("Created no arg constructor in PMinfo");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get method in PMinfo");
		
		req.getRequestURI();
		
		String PMname=req.getParameter("PMname");
		System.out.println("pmName: " +PMname);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("pm details page---");
		writer.print("</h1>");
		writer.print("</h3>");
		writer.print("pmName:" +PMname);
		writer.print("</h1>");
		writer.print("<br>");
		writer.print("<a href='index.html'>Go to Index---");
		writer.print("</body>");
		writer.print("</html>");
		
		
		
		
	}
	
	
	
}
