package com.samples.domain;

import java.util.List;


public class Book {

	private String isbn;
	private String name;
	private Publisher publisher; //ref object
	private List<Chapter> chapters;//ref object
	
	public Book(String isbn, String name, Publisher publisher) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", publisher=" + publisher + ", chapters=" + chapters + "]";
	}
	
}