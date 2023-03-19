package com.rishi.service;

import java.sql.ResultSet;

import com.rishi.dao.IBookDao;
import com.rishi.daofactory.BookDaoFactory;
import com.rishi.dto.Book;

//service layer logic
public class BookServiceImpl implements IBookService {

	private IBookDao bkDao;
	
	@Override
	public ResultSet searchBookBySub(String bsubject) {
		bkDao =BookDaoFactory.getBookDao(); 
		return bkDao.searchBookBySub(bsubject);
	}
	
	@Override
	public String addBook(Book book) {
		bkDao=BookDaoFactory.getBookDao();
		return bkDao.addBook(book);
	}

	@Override
	public String updateBook(Book book) {
		bkDao =BookDaoFactory.getBookDao(); 
		return bkDao.updateBook(book);
	}

	@Override
	public String deleteBook(String bid) {
		bkDao =BookDaoFactory.getBookDao(); 
		return bkDao.deleteBook(bid);}

	

	@Override
	public Book searchBookByAuthor(String bauthor) {
		bkDao =BookDaoFactory.getBookDao(); 
		return bkDao.searchBookByAuthor(bauthor);	
		}

	@Override
	public Book searchBookByTitle(String bname) {
		bkDao =BookDaoFactory.getBookDao(); 
		return bkDao.searchBookByTitle(bname);
	}


}
