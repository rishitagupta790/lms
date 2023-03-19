package com.rishi.servicefactory;

import com.rishi.service.IStudentService;
import com.rishi.service.StudentServiceImpl;

public class StudentServiceFactory {

	private StudentServiceFactory() {

	}

	private static IStudentService studentService = null;

	public static IStudentService getStudentService() {
		
		if (studentService == null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}

}
