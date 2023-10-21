package com.jsp.secure;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");	
		String email = req.getParameter("email");
		String password = req.getParameter("myPassword");
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(req, resp);
	}
	
		

}
