package com.samples.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MVCdemoServlet")
public class MVCdemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// step 1
		String[] students = {"Susan", "John", "Alex", "William" };
		
		// step 2
		request.setAttribute("student_list", students);
		
		// step 3
		RequestDispatcher rd = request.getRequestDispatcher("/viewStudent.jsp");
		rd.forward(request, response);
		
	}


}