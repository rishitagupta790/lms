package com.rishi.service;


import com.rishi.dao.IRegLibrarianDao;
import com.rishi.daofactory.BookDaoFactory;
import com.rishi.daofactory.regLibrarianDaoFactory;
import com.rishi.dto.RegisterLibrarian;

//service layer logic
public class RegLibrarianServiceImpl implements IRegLibrarianService {

	private IRegLibrarianDao regLibrarianDao;

	@Override
	public String registerLibrarian(RegisterLibrarian registerLibrarian) {

		regLibrarianDao=regLibrarianDaoFactory.getRegLibrarianDao();
		return regLibrarianDao.registerLibrarian(registerLibrarian);
	}
	


}
