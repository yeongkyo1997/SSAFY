package com.ssafy.self.student.model.service;

import java.util.List;

import com.ssafy.self.student.model.Student;
import com.ssafy.self.student.model.dao.StudentDao;
import com.ssafy.self.student.model.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	private static StudentService instance = new StudentServiceImpl();

	private StudentServiceImpl() {
		studentDao = StudentDaoImpl.getInstance();
	}

	public static StudentService getInstance() {
		return instance;
	}

	@Override
	public List<Student> list() throws Exception {
		return null;
	}
}
