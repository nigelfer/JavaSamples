package com.nigel;

public interface BookService {
	public abstract Book getBook(String id);
	public abstract void saveBook(Book book);
}