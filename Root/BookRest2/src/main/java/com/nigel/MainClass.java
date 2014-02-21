package com.nigel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		try {

			BookService bookService = (BookService) context
					.getBean("bookServiceImpl");
			Book book = bookService.getBook("1002");
			System.out.println(book);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end");
	}

}
