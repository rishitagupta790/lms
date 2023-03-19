
package com.rishi.daofactory;

import com.rishi.dao.IRegLibrarianDao;
import com.rishi.dao.RegLibrarianDaoImpl;

public class regLibrarianDaoFactory {

	private regLibrarianDaoFactory() {}

	private static IRegLibrarianDao registerLibrarianDao = null;

	public static IRegLibrarianDao getRegLibrarianDao() {
		if (registerLibrarianDao == null) {
			registerLibrarianDao = new RegLibrarianDaoImpl();
		}
		return registerLibrarianDao;
	}
}
