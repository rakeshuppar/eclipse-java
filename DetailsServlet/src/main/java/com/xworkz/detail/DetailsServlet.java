package com.xworkz.detail;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(loadOnStartup = 1,urlPatterns = "/info")
public class DetailsServlet extends HttpServlet {
	
	public DetailsServlet() {
		System.out.println("no arg constructor running on DetailsServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do Post method in DetailsServlet");
		
		System.out.println("Ip of"+req.getParameter("fname")+req.getRemoteAddr());
		Cookie[] cook = req.getCookies();
		if(cook!=null) {
			for (Cookie cookie : cook) {
				System.out.println(cookie.getName()+" "+cookie.getValue());
			}
		}
		req.setAttribute("fname", req.getParameter("fname"));
		req.setAttribute("lname", req.getParameter("lname"));
		req.setAttribute("acnumber", req.getParameter("acnumber"));
		req.setAttribute("password1", req.getParameter("password1"));
		req.setAttribute("password2", req.getParameter("password2"));
		
	    req.setAttribute("from", req.getParameter("from"));
	    req.setAttribute("to", req.getParameter("to"));
	    req.setAttribute("amount", req.getParameter("amount"));
	
		
		HttpSession session = req.getSession();
		session.setAttribute("name", req.getParameter("fname"));
		
		ServletContext context = req.getServletContext();
		context.setAttribute("company", "Xworkz");
		
		
		RequestDispatcher dis = req.getRequestDispatcher("/display.jsp");
		dis.forward(req, resp);
	
	//	RequestDispatcher dis1 = req.getRequestDispatcher("/amount.jsp");
    //   dis1.forward(req, resp);
	
		
	}

}
