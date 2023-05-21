package com.xworkz.Rakesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/country")
public class CountryInfo extends HttpServlet {

	public CountryInfo() {
		System.out.println("Created no arg constructor in CountryInfo");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do get method in CountryInfo");

		String ref = req.getParameter("Countryname");
		String ref1 = req.getParameter("Countrycode");
		String ref2 = req.getParameter("Countrycapital");
		String ref3 = req.getParameter("CountryPopulation");
		
		System.out.println("CountryName:" +ref+" "+ " CountryCode:" +ref1+" "+" CountryCapital:"+ ref2+" "+" CountryPopulation:"+ref3);
		
		String ref4=req.getParameter("PMname");
		System.out.println("PmName:"+ref4);
	
		System.out.println("========================================");

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("country Info---------");
		writer.print("</h1>");

		writer.print("Countryname:" + ref);
		writer.print("<br>");
		writer.print("Countrycode:" + ref1);
		writer.print("<br>");
		writer.print("Countrycapital:" + ref2);
		writer.print("<br>");
		writer.print("Countrypopulation:" + ref3);
		writer.print("<br>");
		writer.print("<form method='get' action='PMname'>");
		writer.print("Enter PM name <input type='text' name='PMname'>");
		writer.print("<br>");
		writer.print("sendPm...<input type='submit' value='send'>");
		writer.print("</form>");

		writer.print("</body>");
		writer.print("</html>");

	}

}
