package com.rishi.dao;

import java.sql.ResultSet;

import com.rishi.dto.IssueBook;

public interface IssueBookDao {

	public String addIssueBook(IssueBook issueBook);

	ResultSet checkdue(Integer sid);
	
	public String returnBook(Integer sid, String bid);

}

