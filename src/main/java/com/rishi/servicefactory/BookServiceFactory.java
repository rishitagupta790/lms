package com.rishi.servicefactory;

import com.rishi.service.BookServiceImpl;
import com.rishi.service.IBookService;

public class BookServiceFactory {

	private BookServiceFactory() {
	}
	private static IBookService bookService = null;

	public static IBookService getBookService() {

		if (bookService == null) {
			bookService = new BookServiceImpl();
		}
		return bookService;
	}

}
