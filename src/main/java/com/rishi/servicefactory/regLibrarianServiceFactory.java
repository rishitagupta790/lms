package com.rishi.servicefactory;

import com.rishi.service.IRegLibrarianService;
import com.rishi.service.RegLibrarianServiceImpl;

public class regLibrarianServiceFactory {

	private regLibrarianServiceFactory() {
	}
	
	private static IRegLibrarianService librarianService = null;

	public static IRegLibrarianService getRegLibrarianService() {

		if (librarianService == null) {
			librarianService = new RegLibrarianServiceImpl();
		}
		return librarianService;
	}

}
