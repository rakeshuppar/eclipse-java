package com.xworkz.favour;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(loadOnStartup = 1,urlPatterns = "/fav")
public class FavouriteServlet extends HttpServlet{
	
	public FavouriteServlet() {
		System.out.println("Running no arg constructor in FavouriteServlet");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Do Post method in FavouriteServlet");
		
		
		req.setAttribute("food", req.getParameter("foods"));
	    req.setAttribute("place",req.getParameter("places"));
	    req.setAttribute("person",req.getParameter("persons"));
	    
	    String laptops[]= new String[3];
	    laptops[0]="HP";
	    laptops[1]="LENOVO";
	    laptops[2]="DWELL";
	    
	    HttpSession session = req.getSession();
	    session.setAttribute("laptop",laptops);
	    
	    
	    req.setAttribute("laptop0", laptops[0]);
	    req.setAttribute("laptop1", laptops[1]);
	    req.setAttribute("laptop2", laptops[2]);
       
	    RequestDispatcher request=req.getRequestDispatcher("InfoDisplay.jsp");
	    request.forward(req, resp);
	}

	
}
