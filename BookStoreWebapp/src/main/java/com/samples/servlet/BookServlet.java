package com.samples.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samples.domain.Book;
import com.samples.service.BookStoreService;

@WebServlet("/books")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BookStoreService bookstoreService;
	
	public void init() throws ServletException {
		super.init();
		this.bookstoreService = new BookStoreService();
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Book> books = this.bookstoreService.getBooks();
		
		request.setAttribute("books", books);
		
		RequestDispatcher rd = request.getRequestDispatcher("/viewbooks.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}