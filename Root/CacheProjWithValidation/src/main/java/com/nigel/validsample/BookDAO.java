package com.nigel.validsample;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class BookDAO {

	public void saveBook(@Valid Book book) {

		// insert book into the database ..
		System.out.println("saved!");
	}
}
