
package com.rishi.daofactory;

import com.rishi.dao.IssueBookDao;
import com.rishi.dao.IssueBookDaoImpl;

public class issueBookDaoFactory {

	private issueBookDaoFactory() {}

	private static IssueBookDao issueBookDao = null;

	public static IssueBookDao getIssueBookDao() {
		if (issueBookDao == null) {
			issueBookDao = new IssueBookDaoImpl();
		}
		return issueBookDao;
	}
}
