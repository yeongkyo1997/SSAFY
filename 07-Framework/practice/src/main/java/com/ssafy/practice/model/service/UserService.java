package com.ssafy.practice.model.service;

import java.sql.SQLException;

import com.ssafy.practice.model.User;

public interface UserService {

	User login(User user) throws SQLException;

}
