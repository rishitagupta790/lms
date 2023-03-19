package com.rishi.service;


import com.rishi.dao.IRegLibrarianDao;
import com.rishi.dao.IssueBookDao;
import com.rishi.daofactory.BookDaoFactory;
import com.rishi.daofactory.issueBookDaoFactory;
import com.rishi.daofactory.regLibrarianDaoFactory;
import com.rishi.dto.IssueBook;
import com.rishi.dto.RegisterLibrarian;

//service layer logic
public class IssueBookServiceImpl implements IssueBookService {

	private IssueBookDao issueBookDao;

	
	@Override
	public String addIssueBook(IssueBook issueBook) {
		issueBookDao=issueBookDaoFactory.getIssueBookDao();
		return issueBookDao.addIssueBook(issueBook);
	}
	


}
