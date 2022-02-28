package com.simplilearn.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("tname");
		String password=request.getParameter("tpass");
		 PrintWriter out=response.getWriter();
		 
		if((username.equals("admin")) && (password.equals("admin")))
		  {
			
		out.println("  <h1> Welcome  "+username);
		
		        }
		
		else
		  {
		out.println("  <h1>  Invalid username or password ");
		out.println("  <a href='./Registration.html'> Click for Home page </a>");
		         }
		  out.println("  </BODY>");
		  out.println("</HTML>");
		  out.close();
		 }
		
}
