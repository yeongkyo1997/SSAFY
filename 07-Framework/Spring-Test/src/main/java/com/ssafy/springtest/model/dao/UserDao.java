package com.ssafy.springtest.model.dao;

import com.ssafy.springtest.model.User;

import java.sql.SQLException;

public interface UserDao {
    User selectLogin(User user) throws SQLException;

}
