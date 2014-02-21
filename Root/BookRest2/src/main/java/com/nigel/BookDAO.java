package com.nigel;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * data access class, will get data from database.
 */
@Component
public class BookDAO {
	/**
	 * for sake of example only, we are storing data in memory this is just to
	 * simulate real database.
	 */
	public Map<String, Book> bookDaatbase = new HashMap<String, Book>();

	public BookDAO() {
		super();
		bookDaatbase.put("1000", new Book("1000", "Little women",
				"Louisa may alcot", null));
		bookDaatbase.put("1001", new Book("1001", "Great expectations",
				"Charles dickens", null));
		bookDaatbase.put("1002", new Book("1002",
				"The Adventures of Huckleberry Finn ", "Mark twain", null));
		bookDaatbase.put("1003", new Book("1003", "Alice in Wonderland",
				"Lewis carrol", null));
	}

	public Book getBook(String id) {
		return bookDaatbase.get(id);
	}

	public void saveBook(Book book) {
		// insert book into the database ..
		bookDaatbase.put(book.getId(), book);
	}
}
