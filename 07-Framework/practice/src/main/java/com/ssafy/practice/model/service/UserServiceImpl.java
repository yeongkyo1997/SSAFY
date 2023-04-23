package com.ssafy.practice.model.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.ssafy.practice.model.User;
import com.ssafy.practice.model.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	private final UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(User user) throws SQLException {
		return userDao.selectLogin(user);
	}

}
