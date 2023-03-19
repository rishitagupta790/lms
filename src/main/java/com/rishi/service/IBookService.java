package com.rishi.service;

import java.sql.ResultSet;

import com.rishi.dto.Book;

public interface IBookService {
	
	// operations to be implemented
	public String addBook(Book book);

	public ResultSet searchBookBySub(String bsubject);
	public Book searchBookByAuthor(String bauthor);
	public Book searchBookByTitle(String bname);

	public String updateBook(Book book);

	public String deleteBook(String bid);

}
