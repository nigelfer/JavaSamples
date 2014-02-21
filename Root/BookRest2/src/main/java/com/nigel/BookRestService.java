package com.nigel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * REST class
 */
@Controller
@RequestMapping("/book")
public class BookRestService {
	private BookService bookService;

	/**
	 * example call http://localhost:8080/bookrest/service/book/1002
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,
			produces = "application/json")
	public @ResponseBody
	Book getBook(@PathVariable String id) {
		System.out.println("searching for book ..id= " + id);
		return bookService.getBook(id);
	}

	public void saveBook(Book book) {
		bookService.saveBook(book);
	}

	@Autowired
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

}
