package com.samples.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samples.domain.Book;
import com.samples.utils.hibernateUtils;

public class BookStoreService {

	public void addBook(Book book) {

	}

	public List<Book> getBooks() {
		List<Book> books = null;
		
		Session session = hibernateUtils.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();

			books = session.createQuery("from Book").list();

			txn.commit();

		} catch (Exception ex) {
			if (txn != null) {
				txn.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return books;
	}

}