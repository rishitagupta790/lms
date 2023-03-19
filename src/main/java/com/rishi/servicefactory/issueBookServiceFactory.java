package com.rishi.servicefactory;

import com.rishi.service.IRegLibrarianService;
import com.rishi.service.IssueBookService;
import com.rishi.service.IssueBookServiceImpl;
import com.rishi.service.RegLibrarianServiceImpl;

public class issueBookServiceFactory {

	private issueBookServiceFactory() {
	}
	
	private static IssueBookService issueBookService = null;

	public static IssueBookService getIssueBookService() {

		if (issueBookService == null) {
			issueBookService = new IssueBookServiceImpl();
		}
		return issueBookService;
	}

}
