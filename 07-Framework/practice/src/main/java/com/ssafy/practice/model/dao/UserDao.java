package com.ssafy.practice.model.dao;

import java.sql.SQLException;

import com.ssafy.practice.model.User;

public interface UserDao {

	User selectLogin(User user) throws SQLException;

}
