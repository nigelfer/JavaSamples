package com.nigel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Business service class
 */
@Component
public class BookServiceImpl implements BookService {
	private BookDAO bookDAO;

	@Override
	public Book getBook(String id) {
		return bookDAO.getBook(id);
	}

	@Override
	public void saveBook(Book book) {
		bookDAO.saveBook(book);
	}

	@Autowired
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
}
