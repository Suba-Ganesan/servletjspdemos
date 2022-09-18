package com.samples.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/demoServlet")
public class demoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String namefromsourseservlet=(String) session.getAttribute("username");
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		pw.println("WELCOME "+namefromsourseservlet);
				
	}

}
