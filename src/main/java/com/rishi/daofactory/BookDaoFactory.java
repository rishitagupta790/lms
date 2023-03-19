
package com.rishi.daofactory;

import com.rishi.dao.BookDaoImpl;
import com.rishi.dao.IBookDao;

public class BookDaoFactory {

	private BookDaoFactory() {}

	private static IBookDao bookDao = null;

	public static IBookDao getBookDao() {
		if (bookDao == null) {
			bookDao = new BookDaoImpl();
		}
		return bookDao;
	}
}
