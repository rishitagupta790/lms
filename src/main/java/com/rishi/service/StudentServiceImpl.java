package com.rishi.service;

import com.rishi.dao.IStudentDao;
import com.rishi.daofactory.StudentDaoFactory;
import com.rishi.dto.Student;

//service layer logic
public class StudentServiceImpl implements IStudentService {

	private IStudentDao stdDao;
	@Override
	public String addStudent(Student student) {
		stdDao =StudentDaoFactory.getStudentDao();
		return stdDao.addStudent(student);
	}

	@Override
	public Student searchStudent(Integer sid) {
		stdDao =StudentDaoFactory.getStudentDao(); 
		return stdDao.searchStudent(sid);
	}

	@Override
	public String updateStudent(Student student) {
		stdDao =StudentDaoFactory.getStudentDao(); 
		return stdDao.updateStudent(student);
	}

	@Override
	public String deleteStudent(Integer sid) {
		stdDao =StudentDaoFactory.getStudentDao(); 
		return stdDao.deleteStudent(sid);
	}

}
