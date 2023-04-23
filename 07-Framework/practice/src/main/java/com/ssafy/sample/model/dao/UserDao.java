package com.ssafy.sample.model.dao;

import com.ssafy.sample.model.User;

import java.sql.SQLException;

public interface UserDao {
    User selectLogin(User user) throws SQLException;
}
