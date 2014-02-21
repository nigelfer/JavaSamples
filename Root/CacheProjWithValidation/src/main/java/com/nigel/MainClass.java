package com.nigel;

import java.util.List;
import java.util.Map;

import org.hibernate.validator.method.MethodConstraintViolationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nigel.validsample.Book;
import com.nigel.validsample.BookDAO;
import com.nigel.validsample.ValidationUtil;

public class MainClass {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		try {
			// Book_v1 book = new Book_v1(null, "Effective Java", null, "I");
			Book book = new Book(null, "Effective Java", null, "Z");

			BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");
			bookDAO.saveBook(book);

		} catch (MethodConstraintViolationException me) {
			ValidationUtil.getValidationError(me);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ReferenceDaaCache referenceDaaCache = (ReferenceDaaCache) context
				.getBean("referenceDataCacheImpl");
		// 1st call
		Map<String, List<RefData>> referenceData = referenceDaaCache
				.getReferenceData();
		// 2nd call ..should be cached.
		referenceData = referenceDaaCache.getReferenceData();
		System.out.println("end");
	}

}
